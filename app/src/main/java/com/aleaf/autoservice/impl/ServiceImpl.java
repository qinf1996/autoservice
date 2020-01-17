package com.aleaf.autoservice.impl;

import android.util.Log;

import com.aleaf.autoservice.annotation.AutoService;
import com.aleaf.autoservice.services.IServices;

/**
 * Author : qinf
 * Date : 2020/1/17 15:15
 **/
@AutoService(value = IServices.class)
public class ServiceImpl implements IServices {

    private static final String TAG = "ServiceImpl";

    @Override
    public void start() {
        Log.d(TAG, " start ... ");
    }
}
