package com.oscarblas.irecycle;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;


public class GoRecycle extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Direcciones> direcionesList;
    ArrayList<LugaresPV> puntosVerdes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_recycle);
        puntosVerdes = new ArrayList<>();
        direcionesList = new ArrayList<>();
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Pila, celular", "5 De Abril 638", R.drawable.ic_map_42871));
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Pila, celular", "Arauco 630", R.drawable.ic_map_42871));
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Pila, celular", "El Roble 628", R.drawable.ic_map_42871));
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Vidrio", "Avenida Ecuador", R.drawable.ic_map_42871));
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Vidrio", "Avenida Collín", R.drawable.ic_map_42871));
        direcionesList.add(new Direcciones(R.drawable.ic_plant_158798,"", "Plástico", "Vicente Méndez 146", R.drawable.ic_map_42871));

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager1 = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager1);
        ListDirec adapter = new ListDirec(this,direcionesList);
        recyclerView.setAdapter(adapter);
    }

    public void MensajeButton(View view){
        Toast.makeText(this, "Probando que funciona ImageButton", Toast.LENGTH_SHORT).show();
    }

    private void readJson(){
        AssetManager lug  = getAssets();
        try {
            InputStream lugares = lug.open("lugares.json");
            JSONArray lugga  = new JSONArray(lugares);
            for(int i=0; i< lugga.length(); i++){
                JSONObject o  = lugga.getJSONObject(i);
                LugaresPV lit = new LugaresPV();
                lit.setName(o.getString("name"));
                lit.setType(o.getString("type"));
                String latitud  = o.getString("lat");
                String longitud = o.getString("lng");
                try {
                    lit.setLat(Double.parseDouble(latitud));
                    lit.setLng(Double.parseDouble(longitud));
                }catch (NumberFormatException e){
                    lit.setLng(0);
                    lit.setLat(0);
                }
                puntosVerdes.add(lit);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
