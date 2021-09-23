package com.aruna.manualdependencyinjection;

import android.app.Application;

import com.aruna.manualdependencyinjection.container.AppContainer;

public class MyApplication extends Application {

    // Instance of AppContainer that will be used by all the Activities of the app
    public AppContainer appContainer = new AppContainer();
}
