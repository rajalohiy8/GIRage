package com.Gi_Rage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Emergencydetails extends AppCompatActivity {
TextView ta1,ta2,t1,t2,t3,t4,t5;
    ImageView head;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencydetails);
        head= (ImageView) findViewById(R.id.header_cover_image);
        ta1= (TextView) findViewById(R.id.user_profile_name);
        ta2= (TextView) findViewById(R.id.user_profile_short_bio);
        t1= (TextView) findViewById(R.id.emd1);
        t2= (TextView) findViewById(R.id.emd2);
        t3= (TextView) findViewById(R.id.emd3);
        t4= (TextView) findViewById(R.id.emd4);
        t5= (TextView) findViewById(R.id.emd5);
        String flag = String.valueOf(getIntent().getStringExtra("Flag"));
        if (flag.equalsIgnoreCase("optionone")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/vuxikOV.png")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(head);
            ta1.setText("TollFree Numbers");
            ta2.setText("Its Provide all service free Without Any Charge");
            t1.setText("Women's Helpline (All India)\n\n 1090");
            t2.setText("Women in Distress\n\n 1091");
            t3.setText("Police Control Room\n\n 100");
            t4.setText("Child Helpline\n\n 1098");
            t5.setText("Anti Stalking/Obscene calls\n\n 1096");



        } else if (flag.equalsIgnoreCase("optiontwo")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/syeOrLZ.png")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(head);
            ta1.setText("Women Helplines");
            ta2.setText("For Women Security");
            t1.setText("Bhopal\nWomen's Helpline\n 0755-2443801");
            t2.setText("Madhya Pradesh\n State Women Helplines\n 0755-2661813");
            t3.setText("Shuruaat Trust (NGO)\n\n 0755-2661519");
            t4.setText("Sangini Mahila kalyan Samiti (NGO)\n\n 9424477290");
            t5.setText("National Commission for Women (NCW)\n\n 111-23219750");

        }
        else if (flag.equalsIgnoreCase("optionthree")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/90dDyAQ.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(head);
            ta1.setText("Police Station");
            ta2.setText("For Taking Action Agains Crime");
            t1.setText("Bangalore\nWomen's Police Helpline Bangalore (Vanitha Sahayavani)\n8022943225");
            t2.setText("Haryana\nWomen and Child Helpline\n0124-2335100");
            t3.setText("Rajasthan\nNirbhaya Sambhali Helpline\n18001200020");
            t4.setText("Karnataka\nWomen Police Helpline\n0821-2418400");
            t5.setText("Tripura\nWomen's Helpline Numbers\n0381-2323355");

        }else {
        }
        if (flag.equalsIgnoreCase("optionone")) {
            setResult(RESULT_OK);
        }
    }
}