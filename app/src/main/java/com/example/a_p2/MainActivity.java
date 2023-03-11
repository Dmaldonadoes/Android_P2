package com.example.a_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText) findViewById(R.id.val1texto);
    }
    public void cambiarActividad2 (View quien){
        Intent intencion = new Intent(this, Activity2.class);
        super.startActivity(intencion);
    }
    public void sumar (View quien){
        Intent sumar1 = new Intent(this, Activity2.class);
        sumar1.putExtra("val1", String.valueOf(valor1.getText()));
        this.startActivity(sumar1);
    }
}