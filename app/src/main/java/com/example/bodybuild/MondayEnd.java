package com.example.bodybuild;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.*;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;


public class MondayEnd extends Fragment {

    View view;
    LottieAnimationView cel1,cel2,cel3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view =inflater.inflate(R.layout.fragment_monday_end,container,false);
        ImageView dn = view.findViewById(R.id.done);
        cel1 = view.findViewById(R.id.celebrate1);
        cel2 = view.findViewById(R.id.celebrate2);
        cel3 = view.findViewById(R.id.celebrate3);


        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cel1.playAnimation();
                cel2.playAnimation();
                cel3.playAnimation();

            }
        });

        return view;
    }

    public interface OnFragmentInteractionListener {

    }
}
