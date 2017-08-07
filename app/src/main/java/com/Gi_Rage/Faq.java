package com.Gi_Rage;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Faq extends AppCompatActivity {
    private BottomSheetBehavior  fas1,fas2,fas3,fas4,fas5,fas6,fas7,fas8,fas9,fas10;
    Button fab1,fab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        //set sheet layout
        View bottomSheet = findViewById(R.id.faqsheet1);
        View bottomSheet1 = findViewById(R.id.faqsheet2);
        View bottomSheet2 = findViewById(R.id.faqsheet3);
        View bottomSheet3 = findViewById(R.id.faqsheet4);
        View bottomSheet4 = findViewById(R.id.faqsheet5);
        View bottomSheet5 = findViewById(R.id.faqsheet6);
        View bottomSheet6 = findViewById(R.id.faqsheet7);
        View bottomSheet7 = findViewById(R.id.faqsheet8);
        View bottomSheet8 = findViewById(R.id.faqsheet9);
        View bottomSheet9 = findViewById(R.id.faqsheet10);
         fas1 = BottomSheetBehavior.from(bottomSheet);
        fas1.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_DRAGGING:
                        Log.i("BottomSheetCallback", "BottomSheetBehavior.STATE_DRAGGING");
                        break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        Log.i("BottomSheetCallback", "BottomSheetBehavior.STATE_SETTLING");
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED:
                        Log.i("BottomSheetCallback", "BottomSheetBehavior.STATE_EXPANDED");
                        break;
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Log.i("BottomSheetCallback", "BottomSheetBehavior.STATE_COLLAPSED");
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN:
                        Log.i("BottomSheetCallback", "BottomSheetBehavior.STATE_HIDDEN");
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.i("BottomSheetCallback", "slideOffset: " + slideOffset);
            }
        });
        //set the reference of sheet behavior layout to open
        fas2 =BottomSheetBehavior.from(bottomSheet1);
        //set the button on click to open the sheet
         fab1 = (Button) findViewById(R.id.faq1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas1.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas1.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas1.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fab2 = (Button) findViewById(R.id.faq2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas2.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas2.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas2.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas3 =BottomSheetBehavior.from(bottomSheet2);
        findViewById(R.id.faq3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas3.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas3.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas3.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas4 =BottomSheetBehavior.from(bottomSheet3);
        findViewById(R.id.faq4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas4.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas4.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas4.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas5 =BottomSheetBehavior.from(bottomSheet4);
        findViewById(R.id.faq5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas5.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas5.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas5.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas6 =BottomSheetBehavior.from(bottomSheet5);
        findViewById(R.id.faq6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas6.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas6.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas6.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas7 =BottomSheetBehavior.from(bottomSheet6);
        findViewById(R.id.faq7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas7.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas7.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas7.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas8 =BottomSheetBehavior.from(bottomSheet7);
        findViewById(R.id.faq8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas8.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas8.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas8.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas9 =BottomSheetBehavior.from(bottomSheet8);
        findViewById(R.id.faq9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas9.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas9.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas9.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        fas10 =BottomSheetBehavior.from(bottomSheet9);
        findViewById(R.id.faq10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fas10.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    fas10.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    fas10.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
    }
}
