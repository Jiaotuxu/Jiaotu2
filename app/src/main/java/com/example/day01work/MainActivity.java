package com.example.day01work;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.title_recyc)
    RecyclerView mTitleRecyc;
    @BindView(R.id.content_recyc)
    RecyclerView mContentRecyc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        mTitleRecyc.setLayoutManager(new GridLayoutManager(this,4));
        mContentRecyc.setLayoutManager(new LinearLayoutManager(this));
        MainPersenter persenter = new MainPersenter(this);
        persenter.RequestData();
    }

    @Override
    public void Sceeuss(InfosBean infosBean) {
        List<InfosBean.GgBeanBean> ggBean = infosBean.getGgBean();
        Log.i("One-PunchMan", "Sceeuss: "+ggBean);
        List<InfosBean.HxListBeansBean> hxListBeans = infosBean.getHxListBeans();
        Log.i("One-PunchMan", "Sceeuss: "+hxListBeans);
        TitleAdapter titleAdapter = new TitleAdapter(ggBean);
        mTitleRecyc.setAdapter(titleAdapter);
        ContentAdapter contentAdapter = new ContentAdapter(hxListBeans);
        mContentRecyc.setAdapter(contentAdapter);
        EventBus.getDefault().postSticky(new TransferData(ggBean,hxListBeans));
    }

    @Override
    public void Loser(Throwable e) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
