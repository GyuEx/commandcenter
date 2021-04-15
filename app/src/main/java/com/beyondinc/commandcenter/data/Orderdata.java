package com.beyondinc.commandcenter.data;

import android.graphics.Color;

public class Orderdata {

    int id,col,delay;
    String usetime,resttime,pay;
    String title,adress,poi;
    String rider,work,paywon;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDelay() {
        return delay;
    }
    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getUsetime() {
        return usetime;
    }
    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    public String getResttime() {
        return resttime;
    }
    public void setResttime(String resttime) {
        this.resttime = resttime;
    }

    public String getPay() {
        return pay;
    }
    public void setPay(String pay) {
        this.pay = pay;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPoi() {
        return poi;
    }
    public void setPoi(String poi) {this.poi = poi;}


    public String getRider() {
        return rider;
    }
    public void setRider(String rider) {
        this.rider = rider;
    }

    public String getWork() {return work;}
    public void setWork(String work) {this.work = work; }

    public String getPaywon() {
        return paywon;
    }
    public void setPaywon(String paywon) {
        this.paywon = paywon;
    }
}
