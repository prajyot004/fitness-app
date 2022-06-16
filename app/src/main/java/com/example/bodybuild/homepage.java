package com.example.bodybuild;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        BottomNavigationView bottomnav = findViewById(R.id.bottomnavigation);
        bottomnav.setOnNavigationItemSelectedListener(navlisterner);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MainActivity()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlisterner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selecterfrag =null;


                    switch (menuItem.getItemId()){
                        case R.id.workout:
                            selecterfrag = new MainActivity();
                            break;
                        case R.id.stepcounter:
                            selecterfrag = new stepssgj();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selecterfrag).commit();
                    return true;
                }
            };
}
