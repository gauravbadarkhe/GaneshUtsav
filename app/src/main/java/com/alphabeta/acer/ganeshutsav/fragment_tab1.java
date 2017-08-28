package com.alphabeta.acer.ganeshutsav;

/**
 * Created by Admin on 20-08-2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class fragment_tab1 extends Fragment {

    RelativeLayout bg_about_us;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        bg_about_us = (RelativeLayout) rootView.findViewById(R.id.bg_about_us);


        switch (SpStorage.getSharedPreferencesString(getActivity(), SpStorage.Constants.KEY_LANGUAGE, "NA")) {
            case SpStorage.Constants.LANG_ENG:
                bg_about_us.setBackgroundResource(R.drawable.aboutus1);
                break;
            case SpStorage.Constants.LANG_HINDI:
                bg_about_us.setBackgroundResource(R.drawable.aboutus_hindi);
                break;
            case SpStorage.Constants.LANG_MARATHI:
                bg_about_us.setBackgroundResource(R.drawable.aboutus_marathi);
                break;
        }
        return rootView;
    }


}
