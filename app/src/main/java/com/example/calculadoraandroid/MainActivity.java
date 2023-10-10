package com.example.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Capturar los EdiText

    private EditText n1;
    private EditText n2;
    //texView

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //relacion
        this.n1 = findViewById(R.id.txtNumero1);
        this.n2 = findViewById(R.id.txtNumero2);
        this.resultado = findViewById(R.id.txtResultado);
    }

    public void onClick(View view) {
        // Capturamos los eventos de la vista
        if (view.getId() == R.id.btnSumar) {
        resultado.setText("El resultado de la Suma es:" + Sumar());
        } else if (view.getId() == R.id.btnRestar) {
            resultado.setText("El resultado de la Resta es:" + Restar());
        } else if (view.getId() == R.id.btnMultiplicar) {
            resultado.setText("El resultado de la Multiplicacion es:" + Multiplicar());
        }else if (view.getId() == R.id.btnDividir) {
            resultado.setText("El resultado de la Division es:" + Dividir());
        }
      }

    //Metodo Sumar

    public double Sumar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) + Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;

    }

    //Metodo Restar

    public double Restar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) - Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;

    }

    //Metodo Multiplicar

    public double Multiplicar() {
        double resultado = 0;
        resultado = Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;

    }

    //Metodo Dividir

    public double Dividir() {
        double resultado = 0;
        double numero1 = 0;
        double numero2 = 0;

        numero1 = Double.parseDouble(this.n1.getText().toString().trim());
        numero2 = Double.parseDouble(this.n2.getText().toString().trim());

        if (numero2 == 0) {
            Toast.makeText(this, "No es posible dividir un numero entre cero Rey", Toast.LENGTH_LONG).show();

        } else {
            resultado = numero1 / numero2;
        }
        return resultado;
    }

}