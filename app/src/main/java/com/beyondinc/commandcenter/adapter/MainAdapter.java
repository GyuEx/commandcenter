package com.beyondinc.commandcenter.adapter;

import android.graphics.Color;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class MainAdapter {

    @BindingAdapter("text_color_mainbtn1")
    public static void setTextColor1(TextView view, int velue)
    {
        if(velue == 1) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else Color.parseColor("#FF808080");
    }
    @BindingAdapter("text_color_mainbtn2")
    public static void setTextColor2(TextView view, int velue)
    {
        if(velue == 2) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else Color.parseColor("#FF808080");
    }
    @BindingAdapter("text_color_mainbtn3")
    public static void setTextColor3(TextView view, int velue)
    {
        if(velue == 3) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else Color.parseColor("#FF808080");
    }
}