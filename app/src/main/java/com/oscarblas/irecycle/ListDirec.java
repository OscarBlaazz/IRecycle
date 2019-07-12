package com.oscarblas.irecycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListDirec extends RecyclerView.Adapter<ListDirec.ViewHolder> {
    private Context mContex;
    private ArrayList<Direcciones>mList;
    ListDirec(Context context, ArrayList<Direcciones> list){
        mContex = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater =  LayoutInflater.from(mContex);
        View view = layoutInflater.inflate(R.layout.cardview_item_go,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Direcciones imagen= mList.get(i);
        ImageView image = viewHolder.item_imcard;
        TextView nombre = viewHolder.item_text;
        TextView tipo = viewHolder.item_nombre;
        TextView direccion = viewHolder.item_direc;
        ImageView buttonim = viewHolder.item_ima;

        image.setImageResource(imagen.getImagen());
        nombre.setText(imagen.getNombre());
        tipo.setText(imagen.getTipo());
        direccion.setText(imagen.getDireccion());
        buttonim.setImageResource(imagen.getButton_ima());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
     /**Capturas id**/

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView item_imcard;
        TextView item_text,item_nombre,item_direc;
        ImageButton item_ima;
        public ViewHolder (View itemView){
            super(itemView);
            item_imcard = itemView.findViewById(R.id.imcard);
            item_text = itemView.findViewById(R.id.nom);
            item_nombre = itemView.findViewById(R.id.tipo);
            item_direc = itemView.findViewById(R.id.direccion);
            item_ima = itemView.findViewById(R.id.mapImageButton);
        }
    }
}
