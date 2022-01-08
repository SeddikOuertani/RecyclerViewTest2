package com.example.recyclerviewtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation de recycler View
        RecyclerView personsRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Initialisation de arraylist de persons
        ArrayList<Person> persons = new ArrayList<>();

        //ajout des persons
        persons.add(new Person("Yosra","22222222"));
        persons.add(new Person("Samira","33333333"));
        persons.add(new Person("Fat7i","44444444"));

        //Initialisation de l'adapter de type adapter qu'on a créé
        PersonAdapter personAdapter = new PersonAdapter(persons);

        //On met personAdapter comme adapter pour notre recycler view
        personsRecyclerView.setAdapter(personAdapter);

        //On choisi le LayoutManager pour notre recycler view
        personsRecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}