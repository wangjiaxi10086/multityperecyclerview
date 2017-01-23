package com.multitypeitem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import com.multitypeitem.adapter.ItemViewFactory;

import static com.multitypeitem.adapter.MultiTypeRecyclerAdapter.TAG;

/**
 * Created by wanjian on 2017/1/12.
 */

public class ItemView6 extends ItemViewFactory<List<String>, ItemView6.Item5VH> {


    public ItemView6(Context context, List<String> data) {
        super(context, data);
    }

    @Override
    public Item5VH onCreateViewHolder(Context context, ViewGroup parent) {
        Log.d(TAG, "onCreateViewHolder:----------- 5");
        return new ItemView6.Item5VH(LayoutInflater.from(context).inflate(R.layout.item2, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Item5VH holder, final List<String> data) {
        holder.mTextView.setText(Arrays.toString(data.toArray()));

        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh(Arrays.asList("cahnge..."));
            }
        });
    }


    static class Item5VH extends RecyclerView.ViewHolder {
        TextView mTextView;

        public Item5VH(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
