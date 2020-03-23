package com.example.ejercicioiintent;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main2Activity extends Activity {
    TextView nombreM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnRegresar = (Button) findViewById(R.id.btnRegresar);
        nombreM = (TextView) findViewById(R.id.txtNombre);
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("NOMBRE");
        String telefono = extras.getString("TELEFONO");
        String correo = extras.getString("CORREO");
        nombreM.setText(nombre.toUpperCase()+" "+telefono+" "+correo.toUpperCase());

        //nombre = nombre.toUpperCase();
        //nombreM.setText(nombre.toUpperCase());
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                //i.putExtra("Valor1", "Android");
                //i.putExtra("Valor2", "Facil");
                i.putExtra("MAYUS", nombreM.getText().toString());
                startActivity(i);
            }
        });
    }
}