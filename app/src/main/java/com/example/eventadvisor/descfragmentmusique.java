package com.example.eventadvisor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class descfragmentmusique extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    String titre, description2, image, date, heure, tarif;

    public descfragmentmusique() {

    }

    public descfragmentmusique(String titre, String description2, String image, String date, String heure, String tarif) {
        this.titre=titre;
        this.description2=description2;
        this.image=image;
        this.date=date;
        this.heure=heure;
        this.tarif=tarif;

    }


    public static descfragmentmusique newInstance(String param1, String param2) {
        descfragmentmusique fragment = new descfragmentmusique();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descfragmentmusique, container, false);
        ImageView imageholder = view.findViewById(R.id.imagegholder);
        TextView titreholder = view.findViewById(R.id.titreholder);
        TextView descriptionholder = view.findViewById(R.id.descriptionholder);
        TextView dateholder = view.findViewById(R.id.dateholder);
        TextView heureholder = view.findViewById(R.id.heureholder);
        TextView tarifholder = view.findViewById(R.id.tarifholder);

        titreholder.setText(titre);
        descriptionholder.setText(description2);
        dateholder.setText(date);
        heureholder.setText(heure);
        tarifholder.setText(tarif);

        Glide.with(getContext()).load(image).into(imageholder);

        return view;
    }

    public void onBackPressed(){
        AppCompatActivity activity=(AppCompatActivity) getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper2, new recfragmentmusique()).addToBackStack(null).commit();
    }
}