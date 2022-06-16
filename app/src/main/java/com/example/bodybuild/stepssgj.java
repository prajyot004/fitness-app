package com.example.bodybuild;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;

import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.lang.String;


public class stepssgj extends Fragment implements SensorEventListener {

    TextView tv_steps, tv_cal, tv_dis;
    SensorManager sensorManager;
    Sensor sensor;
    boolean running = false;
    public int mainstep = 0;
    public float calories = 0;
    public float distance = 0;
    Button viewall,add,del,res;
    sqHelper sqlhp;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(ContextCompat.checkSelfPermission(getContext(),
                Manifest.permission.ACTIVITY_RECOGNITION) == PackageManager.PERMISSION_DENIED){ //ask for permission
            requestPermissions(new String[]{Manifest.permission.ACTIVITY_RECOGNITION}, 0);
        }
        view = inflater.inflate(R.layout.stepssg, container, false);
        sqlhp = new sqHelper(getContext());
        tv_steps = view.findViewById(R.id.value);
        tv_cal = view.findViewById(R.id.calcount);
        tv_dis = view.findViewById(R.id.discount);
        viewall = view.findViewById(R.id.viewAll);
        add = view.findViewById(R.id.addData);
        del = view.findViewById(R.id.delete);
        res = view.findViewById(R.id.reset);
        sensorManager = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);

        ViewAllData();
        Add();
        DeleteData();
        reset();


        return view;
    }

        @Override
    public void onResume() {
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(sensor.TYPE_STEP_COUNTER);
        if (countSensor != null) {
            sensorManager.registerListener(this, countSensor, SensorManager.SENSOR_DELAY_UI);
        } else {
            Toast.makeText(getContext(), "SENSOR NOT FOUND", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        running = true;
        tv_steps.setText(String.valueOf(mainstep));
        //if you unregister the hardware will stop detecting steps
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (running) {
            mainstep = Integer.parseInt(tv_steps.getText().toString());
            mainstep++;
            tv_steps.setText(String.valueOf(mainstep));
            calories = (float) (mainstep * 0.027);
            tv_cal.setText(String.valueOf(calories));
            distance = (float) (mainstep * 0.66);
            tv_dis.setText(String.valueOf(distance) + " (m)");
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void ViewAllData() {
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cr=sqlhp.viewAllData();
                if(cr.getCount()==0){
                    showMessage("Error","No Data Found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(cr.moveToNext()){
                    buffer.append("Time: " + cr.getString(0) + "\n");
                    buffer.append("Date: " + cr.getString(1) + "\n");
                    buffer.append("Steps: " + cr.getString(2) + "\n");
                    buffer.append("Calories:" + cr.getString(3) + "\n");
                    buffer.append("Distance:" + cr.getString(4) + "\n\n");
                }
                showMessage("Data",buffer.toString());
            }
        });

    }

    private void DeleteData() {
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count =sqlhp.deleteData();
                Toast.makeText(getContext(),count+" Rows deleted",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void Add() {
        add.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                Date date = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MMMM/dd");
                String strDate = dateFormat.format(date);

                Date time = Calendar.getInstance().getTime();
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
                String strtime = timeFormat.format(time);

                boolean insert = sqlhp.insertdata(strtime,strDate,String.valueOf(mainstep)+" St",String.valueOf(calories)+" Cal",String.valueOf(distance)+" m");
                if (insert == true) {
                    Toast.makeText(getContext(), "Data inserted successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Data not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void reset(){
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_steps.setText("0");
                tv_cal.setText("0");
                tv_dis.setText("0");
            }
        });
    }


    public void showMessage(String title, String str) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(str);
        builder.show();
    }

}
