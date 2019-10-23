package com.example.day01work;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public interface ApiService {
    @GET("sys/qm02a.json")
    Observable<InfosBean> RequestInfo();
}
