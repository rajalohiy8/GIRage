package com.Gi_Rage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MotivationCover extends AppCompatActivity {

    private final String recyclerViewTitleText[] = {"Poorna", "English Vinglish", "Bandit Queen", "SPY", "Little Miss Sunshine", "EasyA", "The Blind Side", "Fargo", "Bend It Like Beckham", "Million Dollar Baby", "Pitch Perfect", "The Devil Wears Prada"
    };

    private final String recyclerViewImages[] = {"http://i.imgur.com/GZODkuXm.jpg", "http://i.imgur.com/FXxaZnAm.jpg", "http://i.imgur.com/y9jGUw6m.jpg", "http://i.imgur.com/FEUj3VAm.jpg", "http://i.imgur.com/kec5kv7m.jpg", "http://i.imgur.com/nzwUUw9m.jpg", "http://i.imgur.com/iBwZ6tEm.jpg", "http://i.imgur.com/iy1cqhUm.jpg", "http://i.imgur.com/T71bk2Tm.jpg", "http://i.imgur.com/fY7ec03m.jpg", "http://i.imgur.com/SJFkYxwm.jpg", "http://i.imgur.com/rt0c3NDm.jpg"


    };
    private final String recyclerViewTitleTextt[] = {"Dicky Dolma", "Bachendri Pal", "Puja Thakur", "Arunima Sinha", "MARY KOM", "Reena Kaushal Dharmashaktu", "Neerja Bhanot", "Bhakti Sharma", "Archana Sardana", "Krushnaa Patil"
    };

    private final String recyclerViewImagess[] = {"http://i.imgur.com/NLUli9G.png", "http://i.imgur.com/njNZuYhm.jpg", "http://i.imgur.com/gOGP3W8.jpg", "http://i.imgur.com/egZTa96m.png", "http://i.imgur.com/m8H1jus.jpg", "http://i.imgur.com/GCVWg77.png", "http://i.imgur.com/8pNjQCnm.jpg", "http://i.imgur.com/WZ6P5HOm.png", "http://i.imgur.com/PcHZwDym.jpg", "http://i.imgur.com/AMkwjEOm.jpg"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation_cover);
        initRecyclerViews();
        initRecyclerViewss();
    }

    private void initRecyclerViews() {
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(
                getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,
                true);
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<AndroidVersion> av = prepareData();
        AndroidDataAdapter mAdapter = new AndroidDataAdapter(getApplicationContext(), av);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        switch (i) {
                            case 0:
                                Intent j = new Intent(MotivationCover.this, StoryDetail.class);
                                j.putExtra("Flag", "optionone");
                                startActivity(j);
                                break;
                            case 1:
                                Intent k = new Intent(MotivationCover.this, StoryDetail.class);
                                k.putExtra("Flag", "optiontwo");
                                startActivity(k);

                                break;
                            case 2:
                                Intent a = new Intent(MotivationCover.this, StoryDetail.class);
                                a.putExtra("Flag", "optionthree");
                                startActivity(a);
                                break;
                            case 3:
                                Intent b = new Intent(MotivationCover.this, StoryDetail.class);
                                b.putExtra("Flag", "optionfour");
                                startActivity(b);
                                break;
                            case 4:
                                Intent c = new Intent(MotivationCover.this, StoryDetail.class);
                                c.putExtra("Flag", "optionfive");
                                startActivity(c);
                                break;
                            case 5:
                                Intent d = new Intent(MotivationCover.this, StoryDetail.class);
                                d.putExtra("Flag", "optionsix");
                                startActivity(d);
                                break;
                            case 6:
                                Intent e = new Intent(MotivationCover.this, StoryDetail.class);
                                e.putExtra("Flag", "optionseven");
                                startActivity(e);
                                break;
                            case 7:
                                Intent f = new Intent(MotivationCover.this, StoryDetail.class);
                                f.putExtra("Flag", "optioneight");
                                startActivity(f);
                                break;
                            case 8:
                                Intent g = new Intent(MotivationCover.this, StoryDetail.class);
                                g.putExtra("Flag", "optionnine");
                                startActivity(g);
                                break;
                            case 9:
                                Intent h = new Intent(MotivationCover.this, StoryDetail.class);
                                h.putExtra("Flag", "optionten");
                                startActivity(h);
                                break;
                            case 10:
                                Intent m = new Intent(MotivationCover.this, StoryDetail.class);
                                m.putExtra("Flag", "optiononone");
                                startActivity(m);
                            case 11:
                                Intent n = new Intent(MotivationCover.this, StoryDetail.class);
                                n.putExtra("Flag", "optionotwo");
                                startActivity(n);
                                break;
                        }
                    }
                })
        );

    }

    private void initRecyclerViewss() {
        RecyclerView mRecyclerVieww = (RecyclerView) findViewById(R.id.recycler_view1);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerVieww);
        mRecyclerVieww.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(
                getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,
                true);
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);
        mRecyclerVieww.setLayoutManager(mLayoutManager);

        ArrayList<AndroidVersion> av = prepareDataa();
        AndroidDataAdapter mAdapter = new AndroidDataAdapter(getApplicationContext(), av);
        mRecyclerVieww.setAdapter(mAdapter);

        mRecyclerVieww.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        switch (i) {
                            case 0:
                                Intent j = new Intent(MotivationCover.this, StoryDetail.class);
                                j.putExtra("Flag", "option1");
                                startActivity(j);
                                break;
                            case 1:
                                Intent k = new Intent(MotivationCover.this, StoryDetail.class);
                                k.putExtra("Flag", "option2");
                                startActivity(k);

                                break;
                            case 2:
                                Intent a = new Intent(MotivationCover.this, StoryDetail.class);
                                a.putExtra("Flag", "option3");
                                startActivity(a);
                                break;
                            case 3:
                                Intent b = new Intent(MotivationCover.this, StoryDetail.class);
                                b.putExtra("Flag", "option4");
                                startActivity(b);
                                break;
                            case 4:
                                Intent c = new Intent(MotivationCover.this, StoryDetail.class);
                                c.putExtra("Flag", "option5");
                                startActivity(c);
                                break;
                            case 5:
                                Intent d = new Intent(MotivationCover.this, StoryDetail.class);
                                d.putExtra("Flag", "option6");
                                startActivity(d);
                                break;
                            case 6:
                                Intent e = new Intent(MotivationCover.this, StoryDetail.class);
                                e.putExtra("Flag", "option7");
                                startActivity(e);
                                break;
                            case 7:
                                Intent f = new Intent(MotivationCover.this, StoryDetail.class);
                                f.putExtra("Flag", "option8");
                                startActivity(f);
                                break;
                            case 8:
                                Intent g = new Intent(MotivationCover.this, StoryDetail.class);
                                g.putExtra("Flag", "option9");
                                startActivity(g);
                                break;
                            case 9:
                                Intent h = new Intent(MotivationCover.this, StoryDetail.class);
                                h.putExtra("Flag", "option10");
                                startActivity(h);
                                break;
                        }
                    }
                })
        );

    }
    private ArrayList<AndroidVersion> prepareData() {

        ArrayList<AndroidVersion> av = new ArrayList<>();
        for (int i = 0; i < recyclerViewTitleText.length; i++) {
            AndroidVersion mAndroidVersion = new AndroidVersion();
            mAndroidVersion.setAndroidVersionName(recyclerViewTitleText[i]);
            mAndroidVersion.setrecyclerViewImage(recyclerViewImages[i]);
            av.add(mAndroidVersion);
        }
        return av;
    }
    private ArrayList<AndroidVersion> prepareDataa() {

        ArrayList<AndroidVersion> av = new ArrayList<>();
        for (int i = 0; i < recyclerViewTitleTextt.length; i++) {
            AndroidVersion mAndroidVersion = new AndroidVersion();
            mAndroidVersion.setAndroidVersionName(recyclerViewTitleTextt[i]);
            mAndroidVersion.setrecyclerViewImage(recyclerViewImagess[i]);
            av.add(mAndroidVersion);
        }
        return av;
    }

}