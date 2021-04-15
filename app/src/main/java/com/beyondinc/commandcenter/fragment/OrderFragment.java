package com.beyondinc.commandcenter.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beyondinc.commandcenter.R;
import com.beyondinc.commandcenter.databinding.FragmentOrderBinding;
import com.beyondinc.commandcenter.viewmodel.MainsViewModel;

public class OrderFragment extends Fragment {

    FragmentOrderBinding binding;
    MainsViewModel viewModel;

    public static Fragment fr,listfrag;
    public static FragmentTransaction fragmentTransaction = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding = DataBindingUtil.bind(view);
        viewModel = ViewModelProviders.of(requireActivity()).get(MainsViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(requireActivity());

        fragmentTransaction = getChildFragmentManager().beginTransaction();
        listfrag = new ListFragment();
        fr = listfrag;
        fragmentTransaction.add(R.id.ofL02,fr);
        fragmentTransaction.commitAllowingStateLoss();

    }
}