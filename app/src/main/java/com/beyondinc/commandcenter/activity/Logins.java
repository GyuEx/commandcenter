package com.beyondinc.commandcenter.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.beyondinc.commandcenter.R;
import com.beyondinc.commandcenter.util.Vars;
import com.beyondinc.commandcenter.viewmodel.LoginsViewModel;
import com.beyondinc.commandcenter.databinding.ActivityLoginsBinding;

public class Logins extends AppCompatActivity {

    ActivityLoginsBinding binding;
    LoginsViewModel viewModel;

    private String Tag = "Logins Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vars.mContext = this;
        binding = DataBindingUtil.setContentView(this,R.layout.activity_logins);
        viewModel = ViewModelProviders.of(this).get(LoginsViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Tag,"Destory");
    }

    public void closeLogins(){
        finish();
    }
}