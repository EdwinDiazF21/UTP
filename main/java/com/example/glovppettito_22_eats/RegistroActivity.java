package com.example.glovppettito_22_eats;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;

import Data.ProcesosBD;

import android.os.Bundle;

public class RegistroActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, txtUsuario, txtContra;
    private RadioGroup rgTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        this.Inicializar_Controles();
    }

    private void Inicializar_Controles()
    {
        txtNombre = (EditText)findViewById(R.id.txt_Reg_nombre);
        txtApellido = (EditText)findViewById(R.id.txt_Reg_apellido);
        txtUsuario = (EditText)findViewById(R.id.txt_Reg_usuario);
        txtContra = (EditText)findViewById(R.id.txt_Reg_cont);

        rgTipo = (RadioGroup)findViewById(R.id.rg_tipo);
    }

    
}