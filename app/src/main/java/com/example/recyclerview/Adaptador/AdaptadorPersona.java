package com.example.recyclerview.Adaptador;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.recyclerview.Modelos.Persona;
import com.example.recyclerview.R;

import java.util.List;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.ViewHolder> {
    List<Persona> lp;

    public AdaptadorPersona(List<Persona> lp) {
        this.lp = lp;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemrcd,viewGroup,false);
        ViewHolder vh=new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPersona.ViewHolder viewHolder, int i) {

        viewHolder.txtnombre.setText(lp.get(i).getNombre());
        viewHolder.txtapellido.setText(lp.get(i).getApellido());
        viewHolder.txtedad.setText(lp.get(i).getEdad().toString());

    }

    @Override
    public int getItemCount() {
        return lp.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre;
        TextView txtapellido;
        TextView txtedad;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtnombre=itemView.findViewById(R.id.txtNombre);
            txtapellido=itemView.findViewById(R.id.txtApellido);
            txtedad=itemView.findViewById(R.id.txtEdad);
        }
    }
}
