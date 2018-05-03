package com.example.sauceda.ejerciciodelista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sauceda.ejerciciodelista.Adaptadores.Adaptador;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        listaDatos=findViewById(R.id.listDatos);
        Lista=new ArrayList<Datos>  ();

        Lista.add(new Datos(1,"aguila","aguila Real, 400 años",R.drawable.aguila));
        Lista.add(new Datos(2,"burro","burro manso",R.drawable.burro));

        Adaptador miAdaptador=new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miAdaptador);

    }
}
