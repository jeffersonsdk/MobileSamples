package com.dummyproject;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

import pro.jefferson.sdk.Jefferson;

public class JeffersonSDKModule extends ReactContextBaseJavaModule {

    Context c;

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
        return new Jefferson(c).setServer().watchThread();

    }
}
