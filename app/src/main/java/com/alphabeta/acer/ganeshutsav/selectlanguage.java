package com.alphabeta.acer.ganeshutsav;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yarolegovich.lovelydialog.LovelyChoiceDialog;

public class selectlanguage extends AppCompatActivity implements View.OnClickListener {


    Button btn_hindi, btn_marathi, btn_english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectlanguage);

        initButtons();

        new LovelyChoiceDialog(this)
                .setTopColorRes(R.color.blue_bg)
                .setTitle("Select your language")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setMessage(null)
                .setItems(new String[]{"English", "हिंदी", "मराठी"}, new LovelyChoiceDialog.OnItemSelectedListener<String>() {
                    @Override
                    public void onItemSelected(int position, String item) {
                        Log.d("selectlanguage", "onItemSelected: " + position);
                        switch (position) {
                            case 0:
                                setlanguage(SpStorage.Constants.LANG_ENG);
                                break;
                            case 1:
                                setlanguage(SpStorage.Constants.LANG_HINDI);
                                break;
                            case 2:
                                setlanguage(SpStorage.Constants.LANG_MARATHI);
                                break;
                        }
                    }
                })
                .show();
    }


    void initButtons() {

        btn_hindi = (Button) findViewById(R.id.btn_hindi);
        btn_marathi = (Button) findViewById(R.id.btn_marathi);
        btn_english = (Button) findViewById(R.id.btn_english);

        btn_hindi.setOnClickListener(this);
        btn_english.setOnClickListener(this);
        btn_marathi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_hindi:

                break;
            case R.id.btn_marathi:

                break;
            case R.id.btn_english:


                break;
        }
    }

    //    SET THE LANGIAGE
    private void setlanguage(String language) {
        SpStorage.putSharedPreferencesString(this, SpStorage.Constants.KEY_LANGUAGE, language);
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
        finish();
    }
}
