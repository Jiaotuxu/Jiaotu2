package com.example.day01work;

import java.util.List;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class TransferData {
    public List<InfosBean.GgBeanBean> mBeans;
    public List<InfosBean.HxListBeansBean> mBeanList;

    public TransferData(List<InfosBean.GgBeanBean> beans, List<InfosBean.HxListBeansBean> beanList) {
        mBeans = beans;
        mBeanList = beanList;
    }
}
