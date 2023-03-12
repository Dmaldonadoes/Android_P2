package com.example.a_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView resu;
    private EditText valor2;
    private String valor1;
    private String resMandar;
    private int elputoprimernumerodemierda;
    private int elputosegundonumerodemierda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        valor2 = (EditText) findViewById(R.id.val2texto);
        Intent origen = getIntent();
        valor1 = origen.getExtras().getString("val1");
        elputoprimernumerodemierda = Integer.parseInt(valor1);

        Log.d("123", "ksfbvpqiue " + elputoprimernumerodemierda);
        resu = (TextView) findViewById(R.id.resultado);

    }
    public void suma12 (View quien){
        elputosegundonumerodemierda = Integer.parseInt(String.valueOf(valor2.getText()));
        int res = elputosegundonumerodemierda+elputoprimernumerodemierda;
        Log.d("123", "suma2: " + res);
        //resu.setText(String.valueOf(res));
        resMandar = String.valueOf(res);
        Log.d("resMandar","= " + resMandar);
        Intent resultadoIntent = new Intent();
        resultadoIntent.putExtra("Valor", resMandar);
        setResult(RESULT_OK, resultadoIntent); //Duda Jordi
        finish(); // termina esta actividad (la llamada)
    }

}