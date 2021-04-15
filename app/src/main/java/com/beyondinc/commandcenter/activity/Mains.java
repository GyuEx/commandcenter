package com.beyondinc.commandcenter.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.beyondinc.commandcenter.R;
import com.beyondinc.commandcenter.fragment.OrderFragment;
import com.beyondinc.commandcenter.util.Fun;
import com.beyondinc.commandcenter.util.Vars;
import com.beyondinc.commandcenter.viewmodel.MainsViewModel;
import com.beyondinc.commandcenter.databinding.ActivityMainBinding;

public class Mains extends AppCompatActivity implements Fun {

    ActivityMainBinding binding;
    MainsViewModel viewModel;

    public static Fragment fr,oderfrag;
    public static FragmentTransaction fragmentTransaction = null;

    private String Tag = "Mains Activity";

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Tag,"Destory");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vars.mContext = this;
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainsViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);

        Log.e(Tag,"On Create // " + Vars.isLogin);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        oderfrag = new OrderFragment();
        fr = oderfrag;
        fragmentTransaction.add(R.id.mL01,fr);
        fragmentTransaction.commitAllowingStateLoss();

//        Thread thread = new ListViewThread();
//        thread.setDaemon(true);
//        thread.start();

    }
}