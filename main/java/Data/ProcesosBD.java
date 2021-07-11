package Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import Usuarios.*;

import com.example.glovppettito_22_eats.R;
import Usuarios.*;

public class ProcesosBD
{
    CreacionBD _db;

    public ProcesosBD(Context context){
        _db = new CreacionBD(context,"nombreBD",null, R.integer.BDVerision);
    }

    public Usuarios Validar_Existencia_Usuario(Usuarios usuario)
    {
        try{
            SQLiteDatabase db = _db.getReadableDatabase();
            if (db !=null) {
                String[] campos = new String[]{"id","usuario","contrasena","tipoUsuario"};
                String[] arg = new String[]{usuario.getUser(),usuario.getPassword()};

                Cursor cursor = db.query("usuarios", campos,"usuario='"+arg[0]+"'AND contrasena='"+arg[1]+"'",null,null,null,null);

                if (cursor.moveToFirst()){
                    Usuarios sesion = new Usuarios(
                            cursor.getInt(0),
                            cursor.getString(1),
                            cursor.getString(2),
                            "",
                            "",
                            cursor.getInt(3)
                    );
                    Guardar_Sesion_Usuario(sesion);
                    return sesion;
                }
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    public Boolean Guardar_Sesion_Usuario(Usuarios usuario){
        try{
            SQLiteDatabase db = _db.getWritableDatabase();
            if (db != null){
                db.delete("sesion",null,null);
                ContentValues values = new ContentValues();
                values.put("id",usuario.getId());
                values.put("usuario",usuario.getUser());
                values.put("nombre",usuario.getNombre());

                db.insert("sesion",null,values);
                db.close();
                return true;
            }
        }
        catch (Exception e){}
        return false;
    }
}
