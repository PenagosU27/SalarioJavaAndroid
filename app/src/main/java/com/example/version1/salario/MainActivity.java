package com.example.version1.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText hora;
    private EditText valor;
    private Button calcular;
    private TextView resultado;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hora = findViewById(R.id.txthoras);
        valor = findViewById(R.id.txtvalor);
        calcular = findViewById(R.id.btncalcular);
        final TextView resultado = findViewById(R.id.lblresultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = new Float(hora.getText().toString());
                float num2 = new Float(valor.getText().toString());

                Toast.makeText(MainActivity.this,
                        "El valor total a pagar al empleado es: " + (num1*num2) + " mil pesos" ,
                        Toast.LENGTH_LONG).show();


            }
        });


    }
}
