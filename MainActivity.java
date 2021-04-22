package com.example.applab3_ediaz_rpedroza_awu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.applab3_ediaz_rpedroza_awu.Helpers.CustomDialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //declaramos las variables de los controles que vamos a utilizar
    EditText txtNum1;
    EditText txtNum2;
    TextView lblResultado;
    Spinner spnOp;
    CheckBox chkMsg;
    String opera = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InicializarControles();
    }

    private void InicializarControles() {
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        spnOp = (Spinner) findViewById(R.id.spnOp);
        chkMsg = (CheckBox)findViewById(R.id.chkMsg);
        lblResultado = (TextView) findViewById(R.id.lblRes);

        this.InicializarSpinner();
    }

    public List<String> ObtenerOperacion() {
        List<String> operacion = new ArrayList<String>();
        operacion.add("Suma");
        operacion.add("Resta");
        operacion.add("Multiplicacion");
        operacion.add("Division");

        return operacion;
    }

    public String ObtenerOperacionSeleccionada() {
        try {
            return (String) spnOp.getSelectedItem();
        } catch (Exception e) {

        }
        return "";
    }

    public void InicializarSpinner() {
        ArrayAdapter<String> Operadores = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, this.ObtenerOperacion());
        spnOp.setAdapter(Operadores);
    }

    public void Operador(View view) {
        Integer resultado = 0;
        String oper = "";
        try {
            String opera = this.ObtenerOperacionSeleccionada();
            int n1 = Integer.parseInt(txtNum1.getText().toString());
            int n2 = Integer.parseInt(txtNum2.getText().toString());

            if (opera.equals("Suma")) {
                resultado = n1 + n2;
                oper = "+";
            }
            else if (opera.equals("Resta")) {
                resultado = n1 - n2;
                oper = "-";
            }
            else if (opera.equals("Multiplicacion")) {
                resultado = n1 * n2;
                oper = "x";
            }
            else {
                resultado = n1 / n2;
                oper= "/";
            }

            if (chkMsg.isChecked()){
                FragmentManager fm = getSupportFragmentManager();
                CustomDialog dialog = new CustomDialog ("RESULTADO",n1 +" " +oper +" " + n2 +" = " +resultado);
                dialog.show(fm, "DIALOGO");
            }

            lblResultado.setText("Resultado: " + Integer.toString(resultado));

        } catch (Exception e) {
            Toast.makeText(this, "Error en la suma de los datos" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
