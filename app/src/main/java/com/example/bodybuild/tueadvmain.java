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


public class tueadvmain extends Fragment {

    public tueadvmain() {
        // Required empty public constructor
    }


    GifImageView widegriplatpulldown122,closegrip111,tbarrow,stiffarmpulldown,onearmcablerow;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;
        view = inflater.inflate(R.layout.activity_tueadvmain, container, false);

        widegriplatpulldown122 = view.findViewById(R.id.WideGripLatPullDown12);
        widegriplatpulldown122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=lueEJGjTuPQ");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });


        closegrip111 = view.findViewById(R.id.CloseGripLatPullDown123);
        closegrip111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=apzFTbsm7HU");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        tbarrow = view.findViewById(R.id.TBarRow);
        tbarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=KDEl3AmZbVE");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        stiffarmpulldown = view.findViewById(R.id.StiffArmPullDown);
        stiffarmpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=-DsR-SYETxQ");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        onearmcablerow = view.findViewById(R.id.oneArmCableRow);
        onearmcablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=_z5NMUxkxxw");
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
