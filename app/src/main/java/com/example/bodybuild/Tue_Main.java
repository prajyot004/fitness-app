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


public class Tue_Main extends Fragment {

    public Tue_Main() {
        // Required empty public constructor
    }


    GifImageView widegriplatpulldown,closegriplatpulldown,bentoverdumbbellrow
            ,ropepushdown,overheadptricepext,benchdips;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_tue__main, container, false);


        widegriplatpulldown = view.findViewById(R.id.widGripLatPullDown);
        widegriplatpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=lueEJGjTuPQ");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        closegriplatpulldown = view.findViewById(R.id.closeGripLatPullDown);
        closegriplatpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=apzFTbsm7HU");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        bentoverdumbbellrow = view.findViewById(R.id.bentOverDumbbellRow);
        bentoverdumbbellrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=vT2GjY_Umpw");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        ropepushdown = view.findViewById(R.id.ropePushDown);
        ropepushdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=vB5OHsJ3EME");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });


        overheadptricepext = view.findViewById(R.id.overHeadTricepsExtension);
        overheadptricepext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=r1f0JVPSZvw");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        benchdips = view.findViewById(R.id.benchDips);
        benchdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=c3ZGl4pAwZ4");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });



        // Inflate the layout for this fragment
        return view;
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
