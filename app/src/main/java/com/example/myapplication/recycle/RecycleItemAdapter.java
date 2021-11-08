package com.example.myapplication.recycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class RecycleItemAdapter extends RecyclerView.Adapter<RecycleItemAdapter.ViewHolder> {
    private List<Item> iItemList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemContent;
        public ViewHolder(View view) {
            super(view);
            itemContent = view.findViewById(R.id.item_context);
        }
    }
    public RecycleItemAdapter(List<Item> itemList) {
        iItemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.activity_recycle_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = iItemList.get(position);
        holder.itemContent.setText(item.getText());
    }

    @Override
    public int getItemCount() {
        return iItemList.size();
    }

    public void setFilter(List<Item> filterItem) {
        iItemList = filterItem;
        notifyDataSetChanged();
    }


}
