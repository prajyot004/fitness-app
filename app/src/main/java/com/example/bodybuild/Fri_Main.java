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


public class Fri_Main extends Fragment {

    public Fri_Main() {
        // Required empty public constructor
    }


    GifImageView situps,seatedkneeraise,hanginglegraise,crunch;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fri__main, container, false);

        situps = view.findViewById(R.id.sitUps);
        situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=jDwoBqPH0jk");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        seatedkneeraise = view.findViewById(R.id.seatedKneeRaise);
        seatedkneeraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=iJwwu6N-gNM");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        hanginglegraise = view.findViewById(R.id.hangingLegRaise);
        hanginglegraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=hdng3Nm1x_E");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        crunch = view.findViewById(R.id.Crunch);
        crunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=MKmrqcoCZ-M");
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
