package com.beyondinc.commandcenter.viewmodel;

import android.graphics.Color;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TableRow;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainsViewModel extends ViewModel {

    public MutableLiveData<Boolean> layer = new MutableLiveData<>();

    String Tag = "MainsViewModel";

    public MainsViewModel(){
        Log.e(Tag,"ViewModel Enable");
        layer.postValue(false);
    }

    public void Layout()
    {
        layer.postValue(true);
    }

}
