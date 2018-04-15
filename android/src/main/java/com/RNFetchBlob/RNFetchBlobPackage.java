package com.RNFetchBlob;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.net.ssl.SSLContext;

import okhttp3.Authenticator;


public class RNFetchBlobPackage implements ReactPackage {


    private Authenticator _authenticator;
    private SSLContext _sslContext;

    public RNFetchBlobPackage(Authenticator authenticator, SSLContext sslContext) {
        _authenticator = authenticator;
        _sslContext = sslContext;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new RNFetchBlob(reactContext, _authenticator, _sslContext));
        return modules;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

}
