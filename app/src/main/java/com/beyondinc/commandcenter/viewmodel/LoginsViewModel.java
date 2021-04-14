package com.beyondinc.commandcenter.viewmodel;

import android.content.Intent;

import androidx.lifecycle.ViewModel;

import com.beyondinc.commandcenter.activity.Logins;
import com.beyondinc.commandcenter.activity.Mains;
import com.beyondinc.commandcenter.util.Vars;

public class LoginsViewModel extends ViewModel {

    public LoginsViewModel(){

    }

    public void Logins(){
        Vars.isLogin = true;
        Intent intent = new Intent(Vars.mContext, Mains.class);
        Vars.mContext.startActivity(intent);
        ((Logins)Vars.mContext).finish();
    }
}
