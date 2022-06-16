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


public class friadv_main extends Fragment {

    public friadv_main() {
        // Required empty public constructor
    }



    GifImageView olphcl,sbbb,cfr,wrstroller,standreveresclr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friadv_main, container, false);
        olphcl = view.findViewById(R.id.olymichcl);
        olphcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=zC3nLlEvin4");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        sbbb = view.findViewById(R.id.seatedbarwies);
        sbbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=qMtmHwaCmYI");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        cfr = view.findViewById(R.id.cblfrntras);
        cfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=wxzEul89zR0");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        wrstroller = view.findViewById(R.id.Wristroller);
        wrstroller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com/watch?v=-lOFG0U_rlY");
                startActivity(new Intent(Intent.ACTION_VIEW,url));
            }
        });

        standreveresclr = view.findViewById(R.id.standing);
        standreveresclr.setOnClickListener(new View.OnClickListener() {
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
