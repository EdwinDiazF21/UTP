package Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreacionBD extends SQLiteOpenHelper {

    String tablaUsuarios = "CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, usuario TEXT, contrasena TEXT, nombre TEXT, apellido TEXT, tipoUsuario INTEGER)";
    String tablaRecetas = "CREATE TABLE recetas (idReceta INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, rutaImg TEXT, ing1 TEXT, ing2 TEXT, ing3 TEXT, ing4 TEXT, ing5 TEXT, preparacion TEXT)";
    String tablaSesion = "CREATE TABLE sesion (id INTEGER, usuario TEXT, nombre TEXT)";

    public CreacionBD (Context context, String nombreBD, SQLiteDatabase.CursorFactory cursor, int VersionBD)
    {
        super(context, nombreBD, cursor, VersionBD);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL(tablaUsuarios);
        db.execSQL(tablaRecetas);
        db.execSQL(tablaSesion);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int lastDb, int newDb){

    }
}
