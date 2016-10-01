package com.example.android.VRInfo;

import java.util.List;

/**
 * Created by tommi on 1.10.2016.
 */

public class TrainPerStation {


    /**
     * trainNumber : 392
     * departureDate : 2016-09-27
     * operatorUICCode : 10
     * operatorShortCode : vr
     * trainType : HDM
     * trainCategory : Long-distance
     * commuterLineID :
     * runningCurrently : false
     * cancelled : false
     * version : 135418351955
     * timeTableRows : [{"stationShortCode":"KR","stationUICCode":60,"countryCode":"FI","type":"DEPARTURE","trainStopping":true,"commercialStop":true,"commercialTrack":"1","cancelled":false,"scheduledTime":"2016-09-27T15:39:00.000Z","actualTime":"2016-09-27T15:39:28.000Z","differenceInMinutes":0,"causes":[]}]
     */

    private int trainNumber;
    private String departureDate;
    private int operatorUICCode;
    private String operatorShortCode;
    private String trainType;
    private String trainCategory;
    private String commuterLineID;
    private boolean runningCurrently;
    private boolean cancelled;
    private long version;
    /**
     * stationShortCode : KR
     * stationUICCode : 60
     * countryCode : FI
     * type : DEPARTURE
     * trainStopping : true
     * commercialStop : true
     * commercialTrack : 1
     * cancelled : false
     * scheduledTime : 2016-09-27T15:39:00.000Z
     * actualTime : 2016-09-27T15:39:28.000Z
     * differenceInMinutes : 0
     * causes : []
     */

    private List<TimeTableRowsBean> timeTableRows;

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public int getOperatorUICCode() {
        return operatorUICCode;
    }

    public void setOperatorUICCode(int operatorUICCode) {
        this.operatorUICCode = operatorUICCode;
    }

    public String getOperatorShortCode() {
        return operatorShortCode;
    }

    public void setOperatorShortCode(String operatorShortCode) {
        this.operatorShortCode = operatorShortCode;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getTrainCategory() {
        return trainCategory;
    }

    public void setTrainCategory(String trainCategory) {
        this.trainCategory = trainCategory;
    }

    public String getCommuterLineID() {
        return commuterLineID;
    }

    public void setCommuterLineID(String commuterLineID) {
        this.commuterLineID = commuterLineID;
    }

    public boolean isRunningCurrently() {
        return runningCurrently;
    }

    public void setRunningCurrently(boolean runningCurrently) {
        this.runningCurrently = runningCurrently;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public List<TimeTableRowsBean> getTimeTableRows() {
        return timeTableRows;
    }

    public void setTimeTableRows(List<TimeTableRowsBean> timeTableRows) {
        this.timeTableRows = timeTableRows;
    }

    public static class TimeTableRowsBean {
        private String stationShortCode;
        private int stationUICCode;
        private String countryCode;
        private String type;
        private boolean trainStopping;
        private boolean commercialStop;
        private String commercialTrack;
        private boolean cancelled;
        private String scheduledTime;
        private String actualTime;
        private int differenceInMinutes;
        private List<?> causes;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isTrainStopping() {
            return trainStopping;
        }

        public void setTrainStopping(boolean trainStopping) {
            this.trainStopping = trainStopping;
        }

        public boolean isCommercialStop() {
            return commercialStop;
        }

        public void setCommercialStop(boolean commercialStop) {
            this.commercialStop = commercialStop;
        }

        public String getCommercialTrack() {
            return commercialTrack;
        }

        public void setCommercialTrack(String commercialTrack) {
            this.commercialTrack = commercialTrack;
        }

        public boolean isCancelled() {
            return cancelled;
        }

        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }

        public String getScheduledTime() {
            return scheduledTime;
        }

        public void setScheduledTime(String scheduledTime) {
            this.scheduledTime = scheduledTime;
        }

        public String getActualTime() {
            return actualTime;
        }

        public void setActualTime(String actualTime) {
            this.actualTime = actualTime;
        }

        public int getDifferenceInMinutes() {
            return differenceInMinutes;
        }

        public void setDifferenceInMinutes(int differenceInMinutes) {
            this.differenceInMinutes = differenceInMinutes;
        }

        public List<?> getCauses() {
            return causes;
        }

        public void setCauses(List<?> causes) {
            this.causes = causes;
        }
    }
}
