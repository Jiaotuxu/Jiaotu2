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

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentHolder> {
    private List<InfosBean.HxListBeansBean> mBeanList;
    private Context mContext;
    public ContentAdapter(List<InfosBean.HxListBeansBean> hxListBeans) {
        mBeanList=hxListBeans;
    }

    @NonNull
    @Override
    public ContentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.content_item_view,parent,false);
        return new ContentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentHolder holder, int position) {
        holder.content_Instructions.setText(mBeanList.get(position).getShop_content());
        holder.content_Title.setText(mBeanList.get(position).getShop_title());
        Glide.with(mContext).load(mBeanList.get(position).getShop_image_url()).into(holder.content_url);
    }

    @Override
    public int getItemCount() {
        return mBeanList.size();
    }

    class ContentHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.content_url)
        ImageView content_url;
        @BindView(R.id.content_Instructions)
        TextView content_Instructions;
        @BindView(R.id.content_Title)
        TextView content_Title;
        public ContentHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
