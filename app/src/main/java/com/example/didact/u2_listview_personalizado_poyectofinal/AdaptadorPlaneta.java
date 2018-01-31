package com.example.didact.u2_listview_personalizado_poyectofinal;

/**
 * Created by DIDACT on 31/01/2018.
 */
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class AdaptadorPlaneta extends ArrayAdapter<Planeta> {

    ArrayList<Planeta> planetas;
    Context c;

    public AdaptadorPlaneta(Context c, ArrayList<Planeta> planetas){
        super(c,R.layout.item_planeta,planetas);
        this.c = c;
        this.planetas = planetas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_planeta,null);

        //TextView Nombre
        TextView tvNombre=(TextView)item.findViewById(R.id.tvNombre);
        tvNombre.setText(planetas.get(position).getNombre());

        //TextView Tipo
        TextView tvTipo=(TextView)item.findViewById(R.id.tvTipo);
        tvTipo.setText(planetas.get(position).getTipo());

        //int Satelites
        TextView tvSatelites=(TextView)item.findViewById(R.id.tvSatelites);
        tvSatelites.setText(""+planetas.get(position).getSatelites());

        //int Year
        TextView tvYear=(TextView)item.findViewById(R.id.tvYear);
        tvYear.setText(""+planetas.get(position).getYear());

        //ImagenView
        String imagen = planetas.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen,"drawable",c.getPackageName());

        ImageView ivImagen = (ImageView)item.findViewById(R.id.ivImagen);

        ivImagen.setImageResource(idImagen);

        return item;
    }
}

