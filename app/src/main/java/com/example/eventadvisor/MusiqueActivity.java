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

public class MusiqueActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageButton monImageButtonReturnMusique;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musique);

        getSupportFragmentManager().beginTransaction().replace(R.id.wrapper2, new recfragmentmusique()).commit();

        bottomNavigationView = findViewById(R.id.bottomNav);
        //monImageButtonReturnMusique = (ImageButton) findViewById(R.id.button_return_musique);

        //Gestion du bouton HOME
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Intent intentLoadMusiqueActivity = new Intent(MusiqueActivity.this, MainActivity.class);
                startActivity(intentLoadMusiqueActivity);

            }
        });

        /*INUTILE D'UTILISER UN BOUTON RETOUR --- LE TELEPHONE LE FAIT DEJA
        monImageButtonReturnMusique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSportActivity = new Intent(MusiqueActivity.this, MainActivity.class);
                startActivity(intentLoadSportActivity);
                //Verification du lancement de l'activité (A Enlever plus tard)
                makeText(getApplicationContext(),"From musique activity to main", Toast.LENGTH_LONG).show();
            }
        });

         */


    }
}