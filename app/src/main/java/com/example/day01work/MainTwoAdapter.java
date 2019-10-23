package com.example.day01work;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class MainTwoAdapter extends RecyclerView.Adapter<MainTwoAdapter.MyHolder> {
    private List<InfosBean.GgBeanBean> mBeans;
    private Context mContext;

    public MainTwoAdapter(List<InfosBean.GgBeanBean> beans) {
        mBeans = beans;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.maintwo_item_view, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.MainTwo_title.setText(mBeans.get(position).getGg_title());
        Glide.with(mContext).load(mBeans.get(position).getGgIma_url()).into(holder.MainTwo_pic);

    }

    @Override
    public int getItemCount() {
        return mBeans.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.MainTwo_pic)
        ImageView MainTwo_pic;
        @BindView(R.id.MainTwo_title)
        TextView MainTwo_title;
        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
