package com.example.eventadvisor;

import static android.widget.Toast.makeText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SportActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ImageButton monImageButtonReturnSport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        bottomNavigationView = findViewById(R.id.bottomNav);
        monImageButtonReturnSport = (ImageButton) findViewById(R.id.button_return_sport);

        //Gestion du bouton retour dans l'activité sport
        monImageButtonReturnSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSportActivity = new Intent(SportActivity.this, MainActivity.class);
                startActivity(intentLoadSportActivity);
                //Verification du lancement de l'activité (A Enlever plus tard)
                makeText(getApplicationContext(),"From sport activity to main", Toast.LENGTH_LONG).show();
            }
        });

        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Intent intentLoadMusiqueActivity = new Intent(SportActivity.this, MainActivity.class);
                startActivity(intentLoadMusiqueActivity);
            }
        });
    }
}