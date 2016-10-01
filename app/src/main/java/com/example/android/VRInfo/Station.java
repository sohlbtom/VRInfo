package com.example.android.VRInfo;

/**
 * Created by tommi on 1.10.2016.
 */

public class Station {


    /**
     * passengerTraffic : false
     * type : STATION
     * stationName : Ahonpää
     * stationShortCode : AHO
     * stationUICCode : 1343
     * countryCode : FI
     * longitude : 25.01206612315972
     * latitude : 64.55181651445501
     */

    private boolean passengerTraffic;
    private String type;
    private String stationName;
    private String stationShortCode;
    private int stationUICCode;
    private String countryCode;
    private double longitude;
    private double latitude;

    public boolean isPassengerTraffic() {
        return passengerTraffic;
    }

    public void setPassengerTraffic(boolean passengerTraffic) {
        this.passengerTraffic = passengerTraffic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationShortCode() {
        return stationShortCode;
    }

    public void setStationShortCode(String stationShortCode) {
        this.stationShortCode = stationShortCode;
    }

    public int getStationUICCode() {
        return stationUICCode;
    }

    public void setStationUICCode(int stationUICCode) {
        this.stationUICCode = stationUICCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
