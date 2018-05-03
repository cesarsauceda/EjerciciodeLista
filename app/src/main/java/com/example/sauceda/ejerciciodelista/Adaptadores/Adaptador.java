package com.example.sauceda.ejerciciodelista.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sauceda.ejerciciodelista.Datos;
import com.example.sauceda.ejerciciodelista.R;

import java.util.List;

/**
 * Created by sauceda on 11/03/18.
 */

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();  //Retorna la cantidad de elementos de la Lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);  //Retorna el Objeto de la posicion que se le indica
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId(); //Retorna el Id de la posicion que se le indica

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        LayoutInflater inflate=LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imgPerfil);
        TextView titulo = (TextView) vista.findViewById(R.id.txtTitulo);
        TextView detalle = (TextView) vista.findViewById(R.id.txtDescripcion);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImgagen());
        return vista;
    }


}
