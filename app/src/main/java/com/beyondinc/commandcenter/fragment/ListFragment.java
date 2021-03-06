package com.beyondinc.commandcenter.fragment;

import android.content.ClipData;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beyondinc.commandcenter.R;
import com.beyondinc.commandcenter.databinding.FragmentListBinding;
import com.beyondinc.commandcenter.viewmodel.ItemViewModel;

public class ListFragment extends Fragment {

    private FragmentListBinding binding;
    private ItemViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding = DataBindingUtil.bind(view);
        viewModel = new ItemViewModel();
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(requireActivity());
    }
}