package com.example.bodybuild;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;


public class MondayMain extends Fragment {

    public MondayMain() {
        // Required empty public constructor
    }

    GifImageView dumbellprs,inclindeddumbelprs,declineddubbellprs,bicepcablecurl,dumbelpreachercurl,concentratedcurl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;
        view = inflater.inflate(R.layout.fragment_monday_main, container, false);

        dumbellprs = view.findViewById(R.id.dumbellPress);
        dumbellprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=VmB1G1K7v94");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        inclindeddumbelprs = view.findViewById(R.id.inclinedDumbbellPress);
        inclindeddumbelprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=8iPEnn-ltC8");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        declineddubbellprs = view.findViewById(R.id.declinedDumbbellPress);
        declineddubbellprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=Pf1nDoqx_1A");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        bicepcablecurl = view.findViewById(R.id.BicepCableCurl);
        bicepcablecurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=NFzTWp2qpiE");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        dumbelpreachercurl = view.findViewById(R.id.DumbbellPreacherCurl);
        dumbelpreachercurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=vngli9UR6Hw");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        concentratedcurl = view.findViewById(R.id.ConcentrationCurl);
        concentratedcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=0AUGkch3tzc");
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
