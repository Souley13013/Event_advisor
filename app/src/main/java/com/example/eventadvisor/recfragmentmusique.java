package com.example.eventadvisor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class recfragmentmusique extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    RecyclerView recview2;
    myadaptermusique adapter;

    public recfragmentmusique() {

    }


    public static recfragmentmusique newInstance(String param1, String param2) {
        recfragmentmusique fragment = new recfragmentmusique();
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
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_recfragmentmusique, container, false);
        recview2=(RecyclerView) view.findViewById(R.id.recview2);
        recview2.setLayoutManager(new LinearLayoutManager(getContext()));

        FirebaseRecyclerOptions<modelmusique> options =
                new FirebaseRecyclerOptions.Builder<modelmusique>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Musique"), modelmusique.class)
                        .build();


        adapter = new myadaptermusique(options);
        recview2.setAdapter(adapter);

        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}