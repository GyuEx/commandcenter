package com.beyondinc.commandcenter.viewmodel;

import android.graphics.Color;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TableRow;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.beyondinc.commandcenter.util.Vars;

public class MainsViewModel extends ViewModel {

    public MutableLiveData<Integer> layer = new MutableLiveData<>();

    String Tag = "MainsViewModel";

    public MainsViewModel(){
        Log.e(Tag,"ViewModel Enable");
        layer.postValue(0);
    }

    public void setLayoutBtn1()
    {
        if(layer.getValue() == 1)
        {
            layer.postValue(0);
        }
        else
        {
            layer.postValue(1);
        }
    }
    public void setLayoutBtn2()
    {
        layer.postValue(2);
    }
    public void setLayoutBtn3()
    {
        layer.postValue(3);
    }

}
