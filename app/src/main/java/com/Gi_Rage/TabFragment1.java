package com.Gi_Rage;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by RAJA on 2/6/2017.
 */

public class TabFragment1 extends Fragment {
    ImageView img1,img2,img3,img4,img5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {View view=inflater.inflate(R.layout.tab_fragment_1, container, false);
        Context mcontext= getActivity().getApplicationContext();

        img1= (ImageView) view.findViewById(R.id.storyImagee1);
        img2= (ImageView) view.findViewById(R.id.storyImagee2);
        img3= (ImageView) view.findViewById(R.id.storyImagee3);
        img4= (ImageView)view.findViewById(R.id.storyImagee4);
        img5= (ImageView) view.findViewById(R.id.storyImagee5);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/1HaEe4o.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img1);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/oVFQCAT.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img2);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/sLn3RiH.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img3);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/5xQ7CkD.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img4);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/Cpa711P.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img5);
        return view;

    }
}
