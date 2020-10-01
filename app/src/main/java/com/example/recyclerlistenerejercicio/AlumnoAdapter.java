package com.example.recyclerlistenerejercicio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.AlumnoBasicViewHolder>{

    public static class AlumnoBasicViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNombre;
        public TextView tvApellido;


        public AlumnoBasicViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombreItem);
            tvApellido = itemView.findViewById(R.id.tvApellidoItem);


        }


    }

    public AlumnoAdapter(){
    }

    public AlumnoBasicViewHolder onCreateViewHolder (final ViewGroup parent, int viewType){

        View itemView;

        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new AlumnoBasicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder (AlumnoBasicViewHolder holder, int position){


        holder.tvNombre.setText(MainActivity.ITEMS.get(position).getNombre());
        holder.tvApellido.setText(MainActivity.ITEMS.get(position).getApellido());

    }

    @Override
    public int getItemCount () {
        return MainActivity.ITEMS.size();
    }

}
