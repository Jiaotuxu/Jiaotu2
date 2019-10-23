package com.example.day01work;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainTwoActivity extends AppCompatActivity {

    @BindView(R.id.Maintwo_recyc)
    RecyclerView mMaintwoRecyc;
    private List<InfosBean.HxListBeansBean> mBeanList;
    private List<InfosBean.GgBeanBean> mBeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        ButterKnife.bind(this);
        mMaintwoRecyc.setLayoutManager(new LinearLayoutManager(this));
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getData(TransferData data) {
        mBeanList = data.mBeanList;
        mBeans = data.mBeans;
        Log.i("One-PunchMan", "getData: ." + mBeans);
        Log.i("One-PunchMan", "getData: " + mBeanList);
//        mergeBean();
        MainTwoAdapter mainTwoAdapter = new MainTwoAdapter(mBeans);
        mMaintwoRecyc.setAdapter(mainTwoAdapter);
    }

//    private void mergeBean() {
//        Observable<TransferData> transferDataObservable = Observable.create(new ObservableOnSubscribe<TransferData>() {
//            @Override
//            public void subscribe(ObservableEmitter<TransferData> emitter) throws Exception {
//                emitter.onNext((TransferData) mBeanList);
//            }
//        }).subscribeOn(Schedulers.io());
//        Observable<TransferData> dataObservable = Observable.create(new ObservableOnSubscribe<TransferData>() {
//
//            @Override
//            public void subscribe(ObservableEmitter<TransferData> emitter) throws Exception {
//                emitter.onNext((TransferData) mBeans);
//            }
//        });
//        Observable.zip(transferDataObservable, dataObservable, new BiFunction<TransferData, TransferData, Object>() {
//            @Override
//            public Object apply(TransferData data, TransferData data2) throws Exception {
//
//                return null;
//            }
//        });
//    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
