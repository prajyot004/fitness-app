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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MondayMain.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MondayMain#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mondayadvmain extends Fragment {

    public mondayadvmain() {
        // Required empty public constructor
    }


    GifImageView benchpress,inclintbenchprs,delinedbenchprs,crosscable,inclinddubbellfly;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;
        view = inflater.inflate(R.layout.activity_mondayadvmain, container, false);

        benchpress = view.findViewById(R.id.benchpress);
        benchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=lWFknlOTbyM");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        inclintbenchprs = view.findViewById(R.id.inclinedBenchpress);
        inclintbenchprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=8iPEnn-ltC8");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        delinedbenchprs = view.findViewById(R.id.declinedBenchPress);
        delinedbenchprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=Pf1nDoqx_1A");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        crosscable = view.findViewById(R.id.crossCable);
        crosscable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=taI4XduLpTk");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }

        });

        inclinddubbellfly = view.findViewById(R.id.inclinedDumbbellFly);
        inclinddubbellfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Uri url = Uri.parse("https://www.youtube.com/watch?v=ajdFwa-qM98");
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
