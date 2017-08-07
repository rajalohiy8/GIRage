package com.Gi_Rage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergency_number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_number);
        findViewById(R.id.Emg1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eg = new Intent(Emergency_number.this,Emergencydetails.class);
                eg.putExtra("Flag","optionone");
                startActivity(eg);
            }
        });
        findViewById(R.id.Emg2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eg1 = new Intent(Emergency_number.this,Emergencydetails.class);
                eg1.putExtra("Flag","optiontwo");
                startActivity(eg1);
            }
        });
        findViewById(R.id.Emg3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eg3 = new Intent(Emergency_number.this,Emergencydetails.class);
                eg3.putExtra("Flag","optionthree");
                startActivity(eg3);
            }
        });
    }
}
