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


public class wedadv_main extends Fragment {

    public wedadv_main() {
        // Required empty public constructor
    }


    GifImageView seateddumbbelloverhd,dlr,cablefacepull,incshrugs,wighttedfrontraise;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wedadv_main, container, false);
        seateddumbbelloverhd = view.findViewById(R.id.SeatedDumbbellOverhead);
        seateddumbbelloverhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=b5JzUH8gsOg");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        dlr = view.findViewById(R.id.DumbbellLateralRaise);
        dlr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=3VcKaXpzqRo");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        cablefacepull = view.findViewById(R.id.CableFacePulls);
        cablefacepull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=rep-qVOkqgk");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        incshrugs = view.findViewById(R.id.inclinedShrugs);
        incshrugs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=cJRVVxmytaM");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        wighttedfrontraise = view.findViewById(R.id.weightedFrontRaise);
        wighttedfrontraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=hFo-LIkCozU");
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
