package com.example.geek;

public class WeatherRVModel {
    private  String time;
    private  String temperatrue;
    private  String windSpeed;
    private  String imgid;


    public WeatherRVModel(String time, String temperatrue, String windSpeed, String imgid) {
        this.time = time;
        this.temperatrue = temperatrue;
        this.windSpeed = windSpeed;
        this.imgid = imgid;
    }

    public  String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public  String getTemperatrue() {
        return temperatrue;
    }

    public void setTemperatrue(String temperatrue) {
        this.temperatrue = temperatrue;
    }



    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
    public String getWindSpeed(){
        return windSpeed;
    }
    public  String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }
}
