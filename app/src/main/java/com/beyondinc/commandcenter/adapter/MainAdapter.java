package com.beyondinc.commandcenter.adapter;

import android.graphics.Color;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.beyondinc.commandcenter.util.Vars;

public class MainAdapter {

    @BindingAdapter("text_color_mainbtn1")
    public static void setTextColor1(TextView view, int velue)
    {
        if(velue == 1) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else view.setTextColor(Color.parseColor("#FF808080"));
    }
    @BindingAdapter("text_color_mainbtn2")
    public static void setTextColor2(TextView view, int velue)
    {
        if(velue == 2) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else view.setTextColor(Color.parseColor("#FF808080"));
    }
    @BindingAdapter("text_color_mainbtn3")
    public static void setTextColor3(TextView view, int velue)
    {
        if(velue == 3) view.setTextColor(Color.parseColor("#FFFFFFFF"));
        else view.setTextColor(Color.parseColor("#FF808080"));
    }
    @BindingAdapter("layout")
    public static void setLayout(LinearLayout view, int height) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();

        if(height == 1) {
            layoutParams.weight = 1;
            view.setLayoutParams(layoutParams);
        }
        else{
            layoutParams.weight = 0;
            view.setLayoutParams(layoutParams);
        }
    }
}