package com.aruna.manualdependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aruna.manualdependencyinjection.container.AppContainer;
import com.aruna.manualdependencyinjection.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {


    private AppContainer appContainer;
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gets LoginViewModelFactory from the application instance of AppContainer
        // to create a new LoginViewModel instance
        appContainer = ((MyApplication) getApplication()).appContainer;
        loginViewModel = appContainer.loginViewModelFactory.create();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /*
    * Conclusion
    * Dependency injection is a good technique for creating scalable and testable Android apps.
    *
    * Use containers as a way to share instances of classes in different parts of your app and
    * as a centralized place to create instances of classes using factories.
    * */
}