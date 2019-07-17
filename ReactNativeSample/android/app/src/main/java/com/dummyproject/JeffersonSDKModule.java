package com.dummyproject;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

import pro.jefferson.sdk.Jefferson;

public class JeffersonSDKModule extends ReactContextBaseJavaModule {

    Context c;
    public Jefferson j;
    public JeffersonSDKModule(ReactApplicationContext context) {
        super(context);
        this.c = context;
    }

    @Nonnull
    @Override
    public String getName() {
        return "JeffersonSDK";
    }

    @ReactMethod
    public Jefferson start() {
        j= new Jefferson(c).setServer().watchThread();
        return j;
    }
    @ReactMethod
    public void sendEvent(String s){
        j.getServer().send(s);
    }
}
