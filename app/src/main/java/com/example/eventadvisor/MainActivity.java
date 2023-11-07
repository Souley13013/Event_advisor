package com.example.eventadvisor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ImageButton monImageButtonSport;
    ImageButton monImageButtonMusique;
    BottomNavigationView bottomNavigationView;

    //FirebaseFirestore firestore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        firestore = FirebaseFirestore.getInstance();

        Map<String,Object> users = new HashMap<>();
        users.put("firstName","Test");

        firestore.collection("users").add(users).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getApplicationContext(),"Sucess",Toast.LENGTH_LONG).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(),"Failure",Toast.LENGTH_LONG).show();
            }
        });
*/
        monImageButtonSport = (ImageButton) findViewById(R.id.bp_sports);
        monImageButtonMusique = (ImageButton) findViewById(R.id.bp_musique);
        bottomNavigationView = findViewById(R.id.bottomNav);

        //Gestion du bouton sport
        monImageButtonSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSportActivity = new Intent(MainActivity.this, SportActivity.class);
                startActivity(intentLoadSportActivity);
            }
        });

        //Gestion du bouton Musique
        monImageButtonMusique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMusiqueActivity = new Intent(MainActivity.this, MusiqueActivity.class);
                startActivity(intentLoadMusiqueActivity);
            }
        });


    }
}