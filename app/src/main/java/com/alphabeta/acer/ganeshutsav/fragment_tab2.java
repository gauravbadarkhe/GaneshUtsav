package com.alphabeta.acer.ganeshutsav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Admin on 21-08-2017.
 */

public class fragment_tab2 extends Fragment {

    Button btn_tanker, btn_lakes, btn_nmc, btn_police;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab2, container, false);

        btn_lakes = (Button) rootView.findViewById(R.id.btn_lakes);
        btn_nmc = (Button) rootView.findViewById(R.id.btn_nmc);
        btn_police = (Button) rootView.findViewById(R.id.btn_police);
        btn_tanker = (Button) rootView.findViewById(R.id.btn_tanker);

        setlanguage();

        return rootView;

    }

    public void setlanguage() {


        switch (SpStorage.getSharedPreferencesString(getActivity(), SpStorage.Constants.KEY_LANGUAGE, "NA")) {

            case SpStorage.Constants.LANG_HINDI:
                btn_lakes.setText("मूर्ति विसर्जन के लिये झील");
                btn_nmc.setText("NMC झोन ऑफिस");
                btn_tanker.setText("मूर्ति विसर्जन के लिए कृत्रिम टैंक");
                btn_police.setText("पोलीस स्टेशन");
                break;
            case SpStorage.Constants.LANG_MARATHI:
                btn_lakes.setText("मूर्ती विरंजन साठी तलाव");
                btn_nmc.setText("NMC झोन ऑफिस");
                btn_tanker.setText("मूर्ती विरंजनसाठी कृत्रिम तलाव");
                btn_police.setText("पोलीस स्टेशन");
                break;
        }
    }


}
