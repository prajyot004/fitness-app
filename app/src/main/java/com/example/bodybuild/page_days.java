package com.example.bodybuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class page_days extends AppCompatActivity {
LinearLayout mon,tue,wed,fri,sat,sun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_days);
        mon = findViewById(R.id.monday);
        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_days.this,MondayTab.class);
                startActivity(intent);
            }
        });

        tue = findViewById(R.id.tuesday);
        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(page_days.this,TuesdayTab.class);
                startActivity(intent);

            }
        });

        wed = findViewById(R.id.wednesday);
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_days.this,WedTab.class);
                startActivity(intent);

            }
        });

        fri = findViewById(R.id.Friday);
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_days.this,FriTab.class);
                startActivity(intent);
            }
        });

        sat = findViewById(R.id.Saturday);
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_days.this,SatTab.class);
                startActivity(intent);

            }
        });

        sun = findViewById(R.id.Sunday);
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_days.this,sunday.class);
                startActivity(intent);
            }
        });

    }
}
