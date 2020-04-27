package com.example.logeodanpaz;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txtNombre;
    private CalendarView calendar;
    private EditText txtTelefono;
    private EditText txtEmail;
    private EditText txtDescripcion;
    private String mfecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (TextInputEditText) findViewById(R.id.txtNombre);
        calendar = (CalendarView) findViewById(R.id.calendar);
        txtTelefono= (EditText) findViewById(R.id.txtTelefono);
        txtEmail=(EditText) findViewById(R.id.txtEmail);
        txtDescripcion=(EditText) findViewById(R.id.txtDescripcion);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                mfecha= dayOfMonth +"/"+ (month+1) +"/"+ year;
            }
        });

        String dato = getIntent().getStringExtra("dato2");
        String fecha = getIntent().getStringExtra("fecha2");
        String telefono = getIntent().getStringExtra("telefono2");
        String email = getIntent().getStringExtra("email2");
        String descripcion = getIntent().getStringExtra("descripcion2");
        if(dato != null | fecha != null | telefono!=null | email!=null | descripcion!=null){
            txtNombre.setText(dato);
           // calendar.setDate(Long.parseLong(fecha));
            txtTelefono.setText(telefono);
            txtEmail.setText(email);
            txtDescripcion.setText(descripcion);
        }

    }

    public void siguiente (View view){
        Intent siguiente=new Intent(MainActivity.this, Segunda.class);
        siguiente.putExtra("dato", txtNombre.getText().toString());
        siguiente.putExtra("fecha", mfecha);
        siguiente.putExtra("telefono", txtTelefono.getText().toString());
        siguiente.putExtra("email", txtEmail.getText().toString());
        siguiente.putExtra("descripcion", txtDescripcion.getText().toString());
        startActivity(siguiente);
        finish();
    }
}
