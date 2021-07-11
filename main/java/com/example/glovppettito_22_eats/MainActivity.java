package com.example.glovppettito_22_eats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.EditText;
import Data.CreacionBD;
import Data.ProcesosBD;
import Usuarios.*;


public class MainActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtContra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inicializar_Controles();
    }

    private void Inicializar_Controles()
    {
        txtUsuario = (EditText)findViewById(R.id.etxtUsuario);
        txtContra = (EditText)findViewById(R.id.etxtContra);
    }

    public void Iniciar_Sesion(View v)
    {
        String usuario, contra;

        try {
            usuario = txtUsuario.getText().toString();
            contra = txtContra.getText().toString();

            ProcesosBD pbd = new ProcesosBD(getApplicationContext());
            Usuarios usu = new Usuarios(0,usuario,contra,"","",0);
            Usuarios sesion = pbd.Validar_Existencia_Usuario(usu);
        }
        catch(Exception e)
        {

        }
    }


}