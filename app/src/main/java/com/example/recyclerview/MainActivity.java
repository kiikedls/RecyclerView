package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.Adaptador.AdaptadorPersona;
import com.example.recyclerview.Modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=findViewById(R.id.rcv);

        List<Persona>lp=new ArrayList<Persona>();
        lp.add(new Persona(1,"Kiike","dls",19));
        lp.add(new Persona(2,"Juan","Espinoza",21));
        lp.add(new Persona(3,"Enrique","santos",25));
//        lp.add(new Persona(4,"daniel","pasillas",21));


        AdaptadorPersona adp=new AdaptadorPersona(lp);
        /*LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(adp);
    }
}
