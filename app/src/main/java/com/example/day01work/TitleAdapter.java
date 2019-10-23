package com.example.day01work;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleHolder> {
    private List<InfosBean.GgBeanBean> mBeanList;
    private Context mContext;
    public TitleAdapter(List<InfosBean.GgBeanBean> ggBean) {
        mBeanList=ggBean;
    }

    @NonNull
    @Override
    public TitleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.title_item_view,parent,false);
        return new TitleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleHolder holder, int position) {
        holder.title_label.setText(mBeanList.get(position).getGg_title());
        Glide.with(mContext).load(mBeanList.get(position).getGgIma_url()).circleCrop().into(holder.title_url);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MainTwoActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mBeanList.size();
    }

    class TitleHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title_url)
        ImageView title_url;
        @BindView(R.id.title_label)
        TextView title_label;
        public TitleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
