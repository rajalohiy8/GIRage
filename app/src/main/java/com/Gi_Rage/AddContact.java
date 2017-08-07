package com.Gi_Rage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AddContact extends AppCompatActivity {
    private static final int RESULT_PICK_CONTACT =8550;
    private static final int RESULT_PICK_CONTACTT =8551;
    private TextView textView1;
    private TextView textView2;
    private TextView textView12;
    private TextView textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView22 = (TextView) findViewById(R.id.textView22);
        SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
        String Name2 = sp.getString("Name2","");
        String Number2 = sp.getString("Number2","");
        String Contact2 = sp.getString("Contact2","");
        textView12.setText(Name2);
        textView22.setText(Number2);
        String Name = sp.getString("Name","");
        String Number = sp.getString("Number","");
        String Contact1 = sp.getString("Contact1","");
        textView1.setText(Name);
        textView2.setText(Number);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT);


    }
});
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                        ContactsContract.CommonDataKinds.Phone.CONTENT_URI);

                startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACTT);

            }
        });


}
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // check whether the result is ok
        if (resultCode == RESULT_OK) {
            // Check for the request code, we might be usign multiple startActivityForReslut
            switch (requestCode) {
                case RESULT_PICK_CONTACT:
                    contactPicked(data);
                    break;
                case RESULT_PICK_CONTACTT:
                    contactPickedd(data);
                    break;
            }
        } else {
            Log.e("MainActivity", "Failed to pick contact");
        }
    }
    /**
     * Query the Uri and read contact details. Handle the picked contact data.
     * @param data
     */
    private void contactPicked(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null ;
            String name = null;
            // getData() method will have the Content Uri of the selected contact
            Uri uri = data.getData();
            //Query the content uri
            cursor = getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();
            // column index of the phone number
            int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            // column index of the contact name
            int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
            SharedPreferences.Editor et = sp.edit();
            et.putString("Name",name);
            et.putString("Number",phoneNo);
            et.putString("Contact1","1");
            et.commit();
            // Set the value to the textviews
            String Name = sp.getString("Name","");
            String Number = sp.getString("Number","");
            textView1.setText(Name);
            textView2.setText(Number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void contactPickedd(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null ;
            String name = null;
            // getData() method will have the Content Uri of the selected contact
            Uri uri = data.getData();
            //Query the content uri
            cursor = getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();
            // column index of the phone number
            int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            // column index of the contact name
            int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            SharedPreferences sp = getSharedPreferences("Contact", MODE_PRIVATE);
            SharedPreferences.Editor et = sp.edit();
            et.putString("Name2",name);
            et.putString("Number2",phoneNo);
            et.putString("Contact2","1");
            et.commit();
            // Set the value to the textviews
            String Name2 = sp.getString("Name2","");
            String Number2 = sp.getString("Number2","");
            textView12.setText(Name2);
            textView22.setText(Number2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

