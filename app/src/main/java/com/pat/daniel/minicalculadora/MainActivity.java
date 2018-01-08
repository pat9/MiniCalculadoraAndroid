package com.pat.daniel.minicalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Numero1, Numero2, txtResultado;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero1 = findViewById(R.id.Numero1);
        Numero2 = findViewById(R.id.Numero2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Numero1.getText().toString();
                String n2 = Numero2.getText().toString();
                Log.d("Numero1", Numero1.getText().toString());
                Integer N1 = Integer.parseInt(n1);
                Integer N2 = Integer.parseInt(n2);
                Integer Resultado = N1 + N2;
                String resultado = Resultado.toString();
                txtResultado.setText(resultado);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Numero1.getText().toString();
                String n2 = Numero2.getText().toString();
                Log.d("Numero1", Numero1.getText().toString());
                Integer N1 = Integer.parseInt(n1);
                Integer N2 = Integer.parseInt(n2);
                Integer Resultado = N1 - N2;
                String resultado = Resultado.toString();
                txtResultado.setText(resultado);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Numero1.getText().toString();
                String n2 = Numero2.getText().toString();
                Log.d("Numero1", Numero1.getText().toString());
                Integer N1 = Integer.parseInt(n1);
                Integer N2 = Integer.parseInt(n2);
                Integer Resultado = N1 * N2;
                String resultado = Resultado.toString();
                txtResultado.setText(resultado);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Numero1.getText().toString();
                String n2 = Numero2.getText().toString();
                Log.d("Numero1", Numero1.getText().toString());
                Integer N1 = Integer.parseInt(n1);
                Integer N2 = Integer.parseInt(n2);
                Integer Resultado = N1 / N2;
                String resultado = Resultado.toString();
                txtResultado.setText(resultado);
            }
        });

    }

}
