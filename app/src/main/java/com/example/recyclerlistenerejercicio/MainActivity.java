package com.example.recyclerlistenerejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout constraintDetail;

    public static ArrayList<Alumnos> ITEMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerAlumnos = findViewById(R.id.rvlista);

        feedAlumnos();

        AlumnoAdapter alumnoAdapter = new AlumnoAdapter();
        recyclerAlumnos.setAdapter(alumnoAdapter);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getBaseContext());
        recyclerAlumnos.setLayoutManager(mLayoutManager);



    }

    public void feedAlumnos(){
        ITEMS =new ArrayList<Alumnos>();

        /*for(int i = 0; i<=50; i++){
            Alumnos js = new Alumnos(""+i,""+i,""+i,""+i);
            ITEMS.add(js);
        }*/

        Alumnos A1 = new Alumnos("Sergio","Cortes","Informatica","2DM3");
        Alumnos A2 = new Alumnos("Asier","Oñate","Informatica","2DM3");
        Alumnos A3 = new Alumnos("Ekaitz","martin","Informatica","2DM3");
        Alumnos A4 = new Alumnos("Eneko","vilamor","Informatica","2DM3");

        ITEMS.add(A1);
        ITEMS.add(A2);
        ITEMS.add(A3);
        ITEMS.add(A4);
    }
}
