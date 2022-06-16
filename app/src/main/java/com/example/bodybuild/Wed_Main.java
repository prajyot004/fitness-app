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


public class Wed_Main extends Fragment {
    public Wed_Main() {
        // Required empty public constructor
    }

    GifImageView seatDumbop,dumbbelllateralraise,cablefrontraise,olympichammercurl,
                  wristandreversewrits,wristbarbelcurl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wed__main, container, false);

        seatDumbop = view.findViewById(R.id.sdop);
        seatDumbop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=b5JzUH8gsOg");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        dumbbelllateralraise = view.findViewById(R.id.dumbbellLateralRaise);
        dumbbelllateralraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=3VcKaXpzqRo");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        cablefrontraise = view.findViewById(R.id.cableFrontRaise);
        cablefrontraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=wxzEul89zR0");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        olympichammercurl = view.findViewById(R.id.OlympicHammerCurl);
        olympichammercurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=GeSPWt4bSuI");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        wristandreversewrits = view.findViewById(R.id.wristAndRiversWrist);
        wristandreversewrits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=qMtmHwaCmYI");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        wristbarbelcurl = view.findViewById(R.id.reverseBarbelCurl);
        wristbarbelcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=nRgxYX2Ve9w");
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
