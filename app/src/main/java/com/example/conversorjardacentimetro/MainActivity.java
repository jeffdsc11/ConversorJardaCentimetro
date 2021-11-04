package com.example.conversorjardacentimetro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtValor;
    Button  btnConverte;
    TextView txtResultado;
    double resultado,valoremJarda;
    double valoremCM = 91.44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtValor);
        btnConverte = findViewById(R.id.btnConverte);
        txtResultado= findViewById(R.id.txtResultado);

        btnConverte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valoremJarda= Integer.parseInt(edtValor.getText().toString());
                resultado = valoremCM * valoremJarda;
                txtResultado.setText(Double.toString(resultado) );
            }
        });



    }
}