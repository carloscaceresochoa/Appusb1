package com.usb.appusb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto1;
    private EditText edit1;
    private TextView saludotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1=findViewById(R.id.texto1);
        edit1=findViewById(R.id.edit1);
        saludotext=findViewById(R.id.saludotext);
        /*
           Log.d("texto1",texto1.getText().toString());
           // Log.d("editext1",edit1.getText().toString());

        */

    }

    public void mostrar(View view){
        String nombre,saludo;
        nombre="";
        saludo="";
        nombre=edit1.getText().toString();
        saludo="Hola "+nombre;
        saludotext.setText(saludo);
    }
}