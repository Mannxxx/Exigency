package com.example.exigency;

import android.app.Application;

import com.mmi.LicenceManager;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LicenceManager.getInstance().setRestAPIKey("z3mgdpywf7jhiwi3scy2xpgvmbxsgbpr");
        LicenceManager.getInstance().setMapSDKKey("pck2diyr1hkip2kheujbjb65lg9eqxhf");
    }
}
