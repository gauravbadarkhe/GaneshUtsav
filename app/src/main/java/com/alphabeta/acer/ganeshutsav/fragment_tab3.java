package com.alphabeta.acer.ganeshutsav;

/**
 * Created by Admin on 21-08-2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment_tab3 extends Fragment {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab3, container, false);

        btn_1 = (Button) rootView.findViewById(R.id.btn_1);
        btn_2 = (Button) rootView.findViewById(R.id.btn_2);
        btn_3 = (Button) rootView.findViewById(R.id.btn_3);
        btn_4 = (Button) rootView.findViewById(R.id.btn_4);
        btn_5 = (Button) rootView.findViewById(R.id.btn_5);
        btn_6 = (Button) rootView.findViewById(R.id.btn_6);
        btn_7 = (Button) rootView.findViewById(R.id.btn_7);
        btn_8 = (Button) rootView.findViewById(R.id.btn_8);
        btn_9 = (Button) rootView.findViewById(R.id.btn_9);
        btn_10 = (Button) rootView.findViewById(R.id.btn_10);

        setLanguage();
        return rootView;
    }


    public void setLanguage() {

        switch (SpStorage.getSharedPreferencesString(getActivity(), SpStorage.Constants.KEY_LANGUAGE, "NA")) {
            case SpStorage.Constants.LANG_ENG:
                break;
            default:
                btn_1.setText("लष्मीनागर झोन १ अधिकारी - श्री बोकारे");
                btn_2.setText("धरमपेठ झोन २ अधिकारी - श्री टेमभेकर");
                btn_3.setText("हनुमान नगर झोन ३ अधिकारी - श्री कलोडे");
                btn_4.setText("धंतोली झोन ४ अधिकारी - श्री गायकवाड ");
                btn_5.setText("नेहरू नगर झोन 5 अधिकारी - श्री गोरे");
                btn_6.setText("गांधीबाग झोन ६ अधिकारी - श्री बामबोडे");
                btn_7.setText("सतरंजीपूर झोन 7 अधिकारी - श्री राजुरकर");
                btn_8.setText("लकडगंज झोन 8 अधिकारी - श्री अत्राम");
                btn_9.setText("आशी नगर झोन ९ अधिकारी - श्री रंगारी ");
                btn_10.setText("मंगलवारी झोन १० अधिकारी - श्री पाटील");
                break;

        }
    }


}
