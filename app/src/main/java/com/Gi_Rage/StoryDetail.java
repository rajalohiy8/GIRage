package com.Gi_Rage;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class StoryDetail extends AppCompatActivity {
    TextView tv,td;
    ImageView imgst;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);
        imgst= (ImageView) findViewById(R.id.storyImagee);
        tv= (TextView) findViewById(R.id.storyhead);
        Typeface tf=Typeface.createFromAsset(getAssets(),"Roboto-Bold.ttf");
        tv.setTypeface(tf);
        td= (TextView) findViewById(R.id.storydetail1);
        Typeface tg=Typeface.createFromAsset(getAssets(),"Roboto-Medium.ttf");
        td.setTypeface(tg);
        String flag = String.valueOf(getIntent().getStringExtra("Flag"));

        if (flag.equalsIgnoreCase("optionone")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/GZODkuX.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.Poorna);
            td.setText(R.string.aPoorna);

        } else if (flag.equalsIgnoreCase("optiontwo")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/FXxaZnA.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.EnglishVinglish);
            td.setText(R.string.aEnglishVinglish);
        } else if (flag.equalsIgnoreCase("optionthree")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/y9jGUw6.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.BanditQueen);
            td.setText(R.string.aBanditQueen);
        } else if (flag.equalsIgnoreCase("optionfour")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/FEUj3VA.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.Spy);
            td.setText(R.string.aSpy);
        } else if (flag.equalsIgnoreCase("optionfive")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/kec5kv7.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.LittleMissSunshine);
            td.setText(R.string.aLittleMissSunshine);
        } else if (flag.equalsIgnoreCase("optionsix")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/nzwUUw9.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.EasyA);
            td.setText(R.string.aEasyA);
        } else if (flag.equalsIgnoreCase("optionseven")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/iBwZ6tE.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.TheBlindSide);
            td.setText(R.string.aTheBlindSide);
        } else if (flag.equalsIgnoreCase("optioneight")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/iy1cqhU.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.Fargo);
            td.setText(R.string.aFargo);
        } else if (flag.equalsIgnoreCase("optionnine")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/T71bk2T.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.BendItLikeBeckham);
            td.setText(R.string.aBendItLikeBeckham);
        } else if (flag.equalsIgnoreCase("optionten")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/fY7ec03.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.MillionDollarBaby);
            td.setText(R.string.aMillionDollarBaby);
        } else if (flag.equalsIgnoreCase("optiononone")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/SJFkYxw.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.PitchPerfect);
            td.setText(R.string.aPitchPerfect);
        } else if (flag.equalsIgnoreCase("optionotwo")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/NLUli9G.png")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.TheDevilWearsPrada);
            td.setText(R.string.aTheDevilWearsPrada);
        }
        //for Real Life Story

        else if (flag.equalsIgnoreCase("option1")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/GZODkuX.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.DickyDolma);
            td.setText(R.string.aDickyDolma);

        } else if (flag.equalsIgnoreCase("option2")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/njNZuYh.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.BachendriPal);
            td.setText(R.string.aBachendriPal);
        } else if (flag.equalsIgnoreCase("option3")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/gOGP3W8.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.Puja);
            td.setText(R.string.aPuja);
        } else if (flag.equalsIgnoreCase("option4")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/egZTa96.png")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.ArunimaSinha);
            td.setText(R.string.aArunimaSinha);
        } else if (flag.equalsIgnoreCase("option5")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/m8H1jus.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.MaryKom);
            td.setText(R.string.aMaryKom);
        } else if (flag.equalsIgnoreCase("option6")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/CKwTWEk.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.ReenaKaushalDharmashaktu);
            td.setText(R.string.aReenaKaushalDharmashaktu);
        } else if (flag.equalsIgnoreCase("option7")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/8pNjQCn.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.NeerjaBhanot);
            td.setText(R.string.aNeerjaBhanot);
        } else if (flag.equalsIgnoreCase("option8")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/WZ6P5HO.png")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.BhaktiSharma);
            td.setText(R.string.aBhaktiSharma);
        } else if (flag.equalsIgnoreCase("option9")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/PcHZwDy.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.ArchanaSardana);
            td.setText(R.string.aArchanaSardana);
        }
        else if (flag.equalsIgnoreCase("option10")) {
            Picasso.with(this)
                    .load("http://i.imgur.com/AMkwjEO.jpg")
                    .placeholder(R.drawable.dfault)
                    .error(R.drawable.error)
                    .into(imgst);
            tv.setText(R.string.KrushnaaPatil);
            td.setText(R.string.aKrushnaaPatil);
        } else {
        }
        if (flag.equalsIgnoreCase("optionone")) {
            setResult(RESULT_OK);
        }
    }
}