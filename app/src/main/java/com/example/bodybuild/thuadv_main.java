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


public class thuadv_main extends Fragment {

    public thuadv_main() {
        // Required empty public constructor
    }




    GifImageView standingbicep,barbellchetcrl,ez,diamondpushup,rppushdown,lte;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thuadv_main, container, false);
        standingbicep = view.findViewById(R.id.standingBicepcable);
        standingbicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=85kXYq7Ssh4");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        barbellchetcrl = view.findViewById(R.id.barbbellCheatcurl);
        barbellchetcrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=II4UIgobmvo");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        ez = view.findViewById(R.id.ezpeacher);
        ez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=Gydpcouclx8");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        diamondpushup = view.findViewById(R.id.diammond);
        diamondpushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=J0DnG1_S92I");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        rppushdown = view.findViewById(R.id.roappushdown);
        rppushdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=vB5OHsJ3EME");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        lte = view.findViewById(R.id.layingTricepextension);
        lte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=4re6CJ0XNF8");
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
