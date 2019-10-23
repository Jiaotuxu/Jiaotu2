package com.example.day01work;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class MainModle {
    public void RequestData(final MainCallBack callBack){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://106.13.63.54:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService service = retrofit.create(ApiService.class);
        service.RequestInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<InfosBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(InfosBean infosBean) {
                        if (callBack!=null) {
                            callBack.Sceeuss(infosBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (callBack!=null) {
                            callBack.Loser(e);
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    };
}
