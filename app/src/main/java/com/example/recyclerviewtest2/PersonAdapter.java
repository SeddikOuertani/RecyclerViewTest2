package com.example.recyclerviewtest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {

    //HEDHA el array li bech yetwazza3 3al recyclerView list mte3ek
    //kol element mennou bech yjik fi ligne
    ArrayList<Person> personList = new ArrayList<>();

    //fel Constructeur hedha taamel initialisation lel ARRAY li déclarinéh el fou9
    public PersonAdapter(ArrayList<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        //Taamel inflate lel list_item.xml li Sna3néh
        View personListItem = inflater.inflate(R.layout.list_item, parent, false);

        //Nasn3ou el View elli bech n3addouh lel constructeur mte3 MyViewHolder louta
        MyViewHolder viewHolder = new MyViewHolder(personListItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.MyViewHolder holder, int position) {
        //Linna ysir el traitement mte3 kol element mel array
        //Ne5dhou Element mel Array mte3na 7asb el position
        Person p = personList.get(position);

        TextView nameView = holder.nameTV;
        nameView.setText(p.getName());

        Button numberBtn = holder.numberButton;
        numberBtn.setText(p.getNumber());


    }


    //Traj3elna el taille mta3 el liste
    @Override
    public int getItemCount() {
        return personList.size();
    }

    //LENNA declari class yextendi mel RecyclerView.ViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder{

        //LENNA taamel el initialisation mtaa el list item mte3ek

        //DECLARATION
        private TextView nameTV;
        private Button numberButton;

        //EL view Variable li passinéha fel constructeur hédha jétna mel onCreateViewHolder el fou9
        //el onCreateViewHolder taamel return de type View mte3 el list_item.xml
        public MyViewHolder(View view){
            super(view);
            //INITIALISATION
            nameTV = (TextView) view.findViewById(R.id.name_tv);
            numberButton = (Button) view.findViewById(R.id.number_btn);
        }
    }
}
