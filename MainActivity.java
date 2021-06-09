package com.example.glovppettito_22_eats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {

    EditText txtuser;
    EditText txtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inicializar_Controles();
    }

    private void Inicializar_Controles()
    {
       txtuser = (EditText)findViewById(R.id.etxt_user);
        txtpassword = (EditText)findViewById(R.id.etxt_contra);
    }

    


}