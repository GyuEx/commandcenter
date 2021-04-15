package com.beyondinc.commandcenter.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beyondinc.commandcenter.databinding.ItemBinding;
import com.beyondinc.commandcenter.viewmodel.ItemViewModel;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ItemViewModel viewModel;

    public RecyclerAdapter(ItemViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bind(viewModel, position);
        }
    }


    @Override
    public int getItemCount() {
        return viewModel.getItems() == null ? 0 : viewModel.getItems().size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;

        public ItemViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ItemViewModel viewModel, int pos) {
            binding.setViewmodel(viewModel);
            binding.setPos(pos);
            binding.executePendingBindings();
        }
    }
}