package com.example.didact.u2_listview_personalizado_poyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPlanetas;
    ArrayList<Planeta> lista_planetas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvPlanetas=(ListView)findViewById(R.id.lvPlanetas);
        AdaptadorPlaneta adaptador = new AdaptadorPlaneta(this,lista_planetas);
        lvPlanetas.setAdapter(adaptador);

    }//FIN OnCreate

    private void cargarDatos(){

        lista_planetas.add(new Planeta("Nombre: Mercurio","Tipo: planeta","Nº Sat: 0","A. Desc.: 265 a.C.", "mercurio"));

        lista_planetas.add(new Planeta("Nombre: Venus","Tipo: planeta","Nº Sat: 0","A. Desc.: ","venus"));

        lista_planetas.add(new Planeta("Nombre: Tierra","Tipo: planeta","Nº Sat: 1","A. Desc.: ","tierra"));

        lista_planetas.add(new Planeta("Nombre: Marte","Tipo: planeta","Nº Sat: 2","A. Desc.: ","marte"));

        lista_planetas.add(new Planeta("Nombre: Júpiter","Tipo: planeta","Nº Sat: 69","A. Desc.: 1.610","jupiter"));

        lista_planetas.add(new Planeta("Nombre: Saturno","Tipo: planeta","Nº Sat: 62","A. Desc.: 1.610","saturno"));

        lista_planetas.add(new Planeta("Nombre: Urano","Tipo: planeta","Nº Sat: 27","A. Desc.: 1.781","urano"));

        lista_planetas.add(new Planeta("Nombre: Neptuno","Tipo: planeta","Nº Sat: 14","A. Desc.: 1.846","neptuno"));

        lista_planetas.add(new Planeta("Nombre: Ceres","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 1.801","ceres"));

        lista_planetas.add(new Planeta("Nombre: Plutón","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 1.930","pluton"));

        lista_planetas.add(new Planeta("Nombre: Haumea","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 2.003","haumea"));

        lista_planetas.add(new Planeta("Nombre: Makemake","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 2.005","makemake"));

        lista_planetas.add(new Planeta("Nombre: Eris","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 2.005","eris"));

        lista_planetas.add(new Planeta("Nombre: Sedna","Tipo: planeta enano","Nº Sat: 0","A. Desc.: 2.003","sedna"));


    }
}//FIN MainActivity
