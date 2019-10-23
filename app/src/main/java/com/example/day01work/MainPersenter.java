package com.example.day01work;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class MainPersenter {
    public MainView mMainView;

    public MainPersenter(MainView mainView) {
        this.mMainView = mainView;
    }
    public void RequestData(){
        MainModle modle = new MainModle();
        modle.RequestData(new MainCallBack() {
            @Override
            public void Sceeuss(InfosBean infosBean) {
                if (mMainView!=null) {
                    mMainView.Sceeuss(infosBean);
                }
            }

            @Override
            public void Loser(Throwable e) {
                if (mMainView!=null) {
                    mMainView.Loser(e);
                }
            }
        });
    };
}
