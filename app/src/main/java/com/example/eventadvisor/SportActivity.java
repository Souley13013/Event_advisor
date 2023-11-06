package com.example.eventadvisor;

import static android.widget.Toast.makeText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SportActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Intent intentLoadMusiqueActivity = new Intent(SportActivity.this, MainActivity.class);
                startActivity(intentLoadMusiqueActivity);
            }
        });

        //Verification du lancement de l'activité (A Enlever plus tard)
        makeText(getApplicationContext(),"Sucess", Toast.LENGTH_LONG).show();
    }
}