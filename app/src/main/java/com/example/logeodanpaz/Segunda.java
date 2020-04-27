package com.example.logeodanpaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {
    private TextView txtNombre2;
    private TextView txtFecha2;
    private TextView txtTelefono2;
    private TextView txtEmail2;
    private TextView txtDescripcion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNombre2 = (TextView)findViewById(R.id.txtNombre2);
        txtFecha2 = (TextView) findViewById(R.id.txtFecha2);
        txtTelefono2 = (TextView)findViewById(R.id.txtTelefono2);
        txtEmail2 = (TextView)findViewById(R.id.txtEmail2);
        txtDescripcion2 = (TextView)findViewById(R.id.txtDescripcion2);

        String dato = getIntent().getStringExtra("dato");
        txtNombre2.setText(dato);
        String fecha = getIntent().getStringExtra("fecha");
        txtFecha2.setText(fecha);
        String telefono = getIntent().getStringExtra("telefono");
        txtTelefono2.setText(telefono);
        String email = getIntent().getStringExtra("email");
        txtEmail2.setText(email);
        String descripcion = getIntent().getStringExtra("descripcion");
        txtDescripcion2.setText(descripcion);

    }
    public void volver (View view){
        Intent atras=new Intent(this, MainActivity.class);
        atras.putExtra("dato2", txtNombre2.getText().toString());
        //atras.putExtra("fecha2", txtFecha2.getText().toString());
        atras.putExtra("telefono2", txtTelefono2.getText().toString());
        atras.putExtra("email2", txtEmail2.getText().toString());
        atras.putExtra("descripcion2", txtDescripcion2.getText().toString());
        startActivity(atras);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event ){
        if(keyCode==KeyEvent.KEYCODE_BACK){
            Intent atras2=new Intent(this, MainActivity.class);
            startActivity(atras2);
        }
        return super.onKeyDown(keyCode, event);
    }
}
