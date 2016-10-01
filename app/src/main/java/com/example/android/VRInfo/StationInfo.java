package com.example.android.VRInfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StationInfo extends AppCompatActivity {

    String stationShort = "";
    int arriveBefore;

    //Muodosta URL perustuen muuttujiin
    String baseurl = "http://rata.digitraffic.fi/api/v1/live-trains?station=" + stationShort + "&minutes_before_departure=0&minutes_after_departure=0&minutes_before_arrival=" + arriveBefore + "&minutes_after_arrival=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_info);
    }


    //GSON Parsetus

    //Näytä ruudulla
}
