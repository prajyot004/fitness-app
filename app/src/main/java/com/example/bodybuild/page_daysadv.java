package com.example.bodybuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class page_daysadv extends AppCompatActivity {
    LinearLayout mon,tue,wed,thu,fri,sat,sun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_daysadv);
        mon = findViewById(R.id.monday);
        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,mondayadv_tab.class);
                startActivity(intent);
            }
        });

        tue = findViewById(R.id.tuesday);
        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(page_daysadv.this,tueadvtab.class);
                startActivity(intent);

            }
        });

        wed = findViewById(R.id.wednesday);
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,wedadv_tab.class);
                startActivity(intent);

            }
        });

        thu = findViewById(R.id.Thursday);
        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,thuadv_tab.class);
                startActivity(intent);
            }
        });

        fri = findViewById(R.id.Friday);
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,fridayadv_tab.class);
                startActivity(intent);
            }
        });

        sat = findViewById(R.id.Saturday);
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,satadv_tab.class);
                startActivity(intent);
            }
        });

        sun = findViewById(R.id.Sunday);
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_daysadv.this,sunday.class);
                startActivity(intent);
            }
        });


    }
}
