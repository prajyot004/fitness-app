package com.example.bodybuild;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.droidsonroids.gif.GifImageView;


public class Sat_Main extends Fragment {

    public Sat_Main() {
        // Required empty public constructor
    }


    GifImageView squats,barbellsqat,barbelldromandeadlift,legpress;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sat__main, container, false);
        squats = view.findViewById(R.id.Squats);
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=YaXPRqUwItQ");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        barbellsqat = view.findViewById(R.id.BarbellSquats);
        barbellsqat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=SW_C1A-rejs");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        barbelldromandeadlift = view.findViewById(R.id.BarbellRomanianDeadLift);
        barbelldromandeadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=2SHsk9AzdjA");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        legpress = view.findViewById(R.id.legPress);
        legpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=GvRgijoJ2xY");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });





        return view;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
