package com.Gi_Rage;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.telephony.SmsManager;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
String contact="1";
    public boolean isFirstStart;
    Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //  Intro App Initialize SharedPreferences
                SharedPreferences getSharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());

                //  Create a new boolean and preference and set it to true
                isFirstStart = getSharedPreferences.getBoolean("firstStart", true);

                //  Check either activity or app is open very first time or not and do action
                if (isFirstStart) {

                    //  Launch application introduction screen
                    Intent i = new Intent(Home.this, MyIntro.class);
                    startActivity(i);
                    SharedPreferences.Editor e = getSharedPreferences.edit();
                    e.putBoolean("firstStart", false);
                    e.apply();
                }
            }
        });
        t.start();

        //Toolbar

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //button click for panic for shared preference variaables

        findViewById(R.id.panic).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
        String Name2 = sp.getString("Name2","");
        String Number2 = sp.getString("Number2","");
        String Name = sp.getString("Name","");
        String Number = sp.getString("Number","");

        //condition for contacts saved

        if(!sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact))
        {
            Toast.makeText(getApplicationContext(), "Please Select Contact Number To send Alert!", Toast.LENGTH_LONG).show();
        }

      //condition for one contact

        if(sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact) )
        {
            ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
            SmsManager smsManager = SmsManager.getDefault();
            StringBuffer smsBody = new StringBuffer();
            smsBody.append(Name + " Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
            smsBody.append("23.251295");//23.251295, 77.5245421//23.249159 //77.528058
            smsBody.append(",");
            smsBody.append("77.5245421");
            smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
            Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
        }

        //condition for one contact

        if(sp.getString("Contact2","").equals(contact) && !sp.getString("Contact1","").equals(contact))
        {
            ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
            SmsManager smsManager = SmsManager.getDefault();
            StringBuffer smsBody = new StringBuffer();
            smsBody.append(Name2 + " Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
            smsBody.append("23.251295");//23.251295, 77.5245421//23.249159 //77.528058
            smsBody.append(",");
            smsBody.append("77.5245421");
            smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
            Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
        }

        //condition for two contact

        if(sp.getString("Contact1","").equals(contact) && sp.getString("Contact2","").equals(contact))
        {
            ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
            SmsManager smsManager = SmsManager.getDefault();
            StringBuffer smsBody = new StringBuffer();
            smsBody.append("Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
            smsBody.append("23.251295");//23.251295, 77.5245421//23.249159 //77.528058
            smsBody.append(",");
            smsBody.append("77.5245421");
            smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
            smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
            Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
        }
    }
});

        //button click for safe button and shared preference variable

        findViewById(R.id.safe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
                String Name2 = sp.getString("Name2","");
                String Number2 = sp.getString("Number2","");
                String Name = sp.getString("Name","");
                String Number = sp.getString("Number","");

                //condition for contact saved

                if(!sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact))
                {
                    Toast.makeText(getApplicationContext(), "Please Select Contact Number To send Alert!", Toast.LENGTH_LONG).show();
                }

                //condition for save one contact

                if(sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact) )
                {
                    ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                    SmsManager smsManager = SmsManager.getDefault();
                    StringBuffer smsBody = new StringBuffer();
                    smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
                    smsBody.append("23.251295");//23.251295, 77.5245421//23.249159 //77.528058
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                    smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
                }

                //condition for save one contact

                if(sp.getString("Contact2","").equals(contact) && !sp.getString("Contact1","").equals(contact))
                {
                    ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                    SmsManager smsManager = SmsManager.getDefault();
                    StringBuffer smsBody = new StringBuffer();
                    smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
                    smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                    smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
                }

                //condition for save two contact

                if(sp.getString("Contact1","").equals(contact) && sp.getString("Contact2","").equals(contact))
                {
                    ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                    SmsManager smsManager = SmsManager.getDefault();
                    StringBuffer smsBody = new StringBuffer();
                    smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
                    smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                    smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                    smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
                }

            }
        });

        //action for float button

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Welcome to the Gi-Rage", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        findViewById(R.id.Emergencycontact).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent j = new Intent(Home.this,AddContact.class);
                startActivity(j);
            }
        });
        findViewById(R.id.Nearbyplace).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent K = new Intent(Home.this,MapsActivity.class);
                startActivity(K);
            }
        });
        findViewById(R.id.Emergencycon).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent FF = new Intent(Home.this,Emergency_number.class);
                startActivity(FF);
            }
        });
        findViewById(R.id.Connectwith).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent f = new Intent(Home.this,FaceBook_Page.class);
                startActivity(f);
            }
        });

        //action for drawer layout

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //condition for navigation drawer list item click

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent D = new Intent(this,Home.class);
            startActivity(D);
        } else if (id == R.id.nav_gallery) {
            Intent D = new Intent(this,Emergency_number.class);
            startActivity(D);
        } else if (id == R.id.nav_Near) {
            Intent D = new Intent(this,MapsActivity.class);
            startActivity(D);
        }else if (id == R.id.nav_slideshow) {
            Intent D = new Intent(this,MotivationCover.class);
            startActivity(D);
        } else if (id == R.id.nav_manage) {
            Intent D = new Intent(this,SituationGuide.class);
            startActivity(D);
        } else if (id == R.id.nav_share) {
            Intent D = new Intent(this,FaceBook_Page.class);
            startActivity(D);
        } else if (id == R.id.nav_send) {
            Intent D = new Intent(this,Faq.class);
            startActivity(D);
        }
        else if (id == R.id.AddAert) {
            Intent D = new Intent(this,AddContact.class);
            startActivity(D);
        }
        else if (id == R.id.nav_lic) {
            Intent D = new Intent(this,Licence.class);
            startActivity(D);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //condition for key button press

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode== KeyEvent.KEYCODE_VOLUME_UP){
            event.startTracking();
            return true;
        }
        if(keyCode== KeyEvent.KEYCODE_VOLUME_DOWN){
            event.startTracking();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }

    //condition for long press button

    @Override
    public boolean onKeyLongPress(int keyCode,KeyEvent event){

        //action for volume up  button

        if(keyCode==KeyEvent.KEYCODE_VOLUME_UP){
            SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
            String Name2 = sp.getString("Name2","");
            String Number2 = sp.getString("Number2","");
            String Name = sp.getString("Name","");
            String Number = sp.getString("Number","");

            //condition for not save contact

            if(!sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact))
            {
                Toast.makeText(getApplicationContext(), "Please Select Contact Number To send Alert!", Toast.LENGTH_LONG).show();
            }

            //condition for one contact

            if(sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact) )
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append(Name + "Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
                smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }

            //condition for one contact save

            if(sp.getString("Contact2","").equals(contact) && !sp.getString("Contact1","").equals(contact))
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append(Name2 + "Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
               smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }

            //condition for two contact save

            if(sp.getString("Contact1","").equals(contact) && sp.getString("Contact2","").equals(contact))
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append("Hi, I am in trouble Please help ! My Location Link http://maps.google.com/maps?q=");
                smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }
            return true;
        }

         //action for volume down  button

        if(keyCode==KeyEvent.KEYCODE_VOLUME_DOWN){
            SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
            String Name2 = sp.getString("Name2","");
            String Number2 = sp.getString("Number2","");
            String Name = sp.getString("Name","");
            String Number = sp.getString("Number","");

            //condition for not save contact

            if(!sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact))
            {
                Toast.makeText(getApplicationContext(), "Please Select Contact Number To send Alert!", Toast.LENGTH_LONG).show();
            }

            //condition for one contact save

            if(sp.getString("Contact1","").equals(contact) && !sp.getString("Contact2","").equals(contact) )
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
               smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }

            //condition for one contact save

            if(sp.getString("Contact2","").equals(contact) && !sp.getString("Contact1","").equals(contact))
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
               smsBody.append("23.251295");
                    smsBody.append(",");
                    smsBody.append("77.5245421");
                smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }

            //condition for two contact save

            if(sp.getString("Contact1","").equals(contact) && sp.getString("Contact2","").equals(contact))
            {
                ActivityCompat.requestPermissions(Home.this,new String[]{Manifest.permission.SEND_SMS},1);
                SmsManager smsManager = SmsManager.getDefault();
                StringBuffer smsBody = new StringBuffer();
                smsBody.append("Hi, I am Safe ! Please Don't Worry My Location Link http://maps.google.com/maps?q=");
                smsBody.append("23.249159");
                smsBody.append(",");
                smsBody.append("77.528058");
                smsManager.sendTextMessage(Number, null, smsBody.toString(), null, null);
                smsManager.sendTextMessage(Number2, null, smsBody.toString(), null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
            }

            return true;
        }
        return onKeyLongPress(keyCode,event);
    }
}


