package com.example.android.VRInfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String url = "http://rata.digitraffic.fi/api/v1/metadata/stations";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Haetaan asematieto Urlista api/v1/stations

    //GSON Parsetus

    //Näytä ruudulla

    //Klikkauksesta avaa uusi aktiviteetti/ikkuna - Välitä Asematieto
}
