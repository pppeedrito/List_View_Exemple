package com.example.sr_pedro.list_view_exemple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal_1 extends AppCompatActivity {
// En esta actividad tenemos que utilizar el titulares + fotos ! !

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_1);
        final String[] datos = new String[]{"Elemento01","Elemento02","Elemento03","Elemena04"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);
        ListView listaOpc=(ListView)findViewById(R.id.ListView_ID);
        listaOpc.setAdapter(adaptador);
    }
}
/*
public class AdaptadorTitulares extends ArrayAdapter<Titular_Dr>{
    Titular_Dr[]datos;
    public AdaptadorTitulares(Context context, Titular_Dr[]datos){
        super(context, R.layout.titularly, datos);
        this.datos= datos;
    }
    public View getView (int pos, View convertV, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item= inflater.inflate(R.layout.titularly, null);

        TextView lblTitle= (TextView)item.findViewById(R.id.textView_Id1);
        lblTitle.setText(datos[pos].getTitulo());

        TextView lblSubs= (TextView)item.findViewById(R.id.textView_ID2);
        lblSubs.setText(datos[pos].getSubtitulo());
        return item;
    }
}
*/