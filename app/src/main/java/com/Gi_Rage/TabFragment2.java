package com.Gi_Rage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by RAJA on 2/6/2017.
 */

public class TabFragment2 extends Fragment {
    ImageView img11;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab_fragment_2, container, false);
        Context mcontext= getActivity().getApplicationContext();

        img11= (ImageView) view.findViewById(R.id.storyImagee11);
        Picasso.with(mcontext)
                .load("http://i.imgur.com/VamAUkG.png")
                .placeholder(R.drawable.dfault)
                .error(R.drawable.error)
                .into(img11);
        return view;
    }
}
