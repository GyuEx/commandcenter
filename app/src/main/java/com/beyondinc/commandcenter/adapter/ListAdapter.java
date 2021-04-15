package com.beyondinc.commandcenter.adapter;

import android.graphics.Color;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter {

    @BindingAdapter("bind:verAdapter")
    public static void verAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter("text_color")
    public static void setTextColor(TextView view, int velue)
    {
        if(velue < 5){
            view.setTextColor(Color.parseColor("#FFFF0000"));
        }
        else
        {
            view.setTextColor(Color.parseColor("#FF000000"));
        }
    }

    @BindingAdapter("text_color_string")
    public static void setTextColorString(TextView view, String velue)
    {
        if(velue.equals("포장완료")){
            view.setTextColor(Color.parseColor("#FFFF0000"));
        }
        else
        {
            view.setTextColor(Color.parseColor("#FF000000"));
        }
    }

    @BindingAdapter("back_color")
    public static void setBackColor(TextView view, String state)
    {
        if(state.equals("배정")) view.setBackgroundColor(Color.parseColor("#FFFF0000"));
        else if(state.equals("접수")) view.setBackgroundColor(Color.parseColor("#FFFFB600"));
        else if(state.equals("취소")) view.setBackgroundColor(Color.parseColor("#FF707070"));
        else if(state.equals("완료")) view.setBackgroundColor(Color.parseColor("#FF005CFF"));
        else if(state.equals("픽업")) view.setBackgroundColor(Color.parseColor("#FF1C8B00"));
    }


}