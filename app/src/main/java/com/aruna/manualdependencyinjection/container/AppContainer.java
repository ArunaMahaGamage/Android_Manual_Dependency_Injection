package com.aruna.manualdependencyinjection.container;

import com.aruna.manualdependencyinjection.api.LoginService;
import com.aruna.manualdependencyinjection.factory.LoginViewModelFactory;
import com.aruna.manualdependencyinjection.repository.UserLocalDataSource;
import com.aruna.manualdependencyinjection.repository.UserRemoteDataSource;
import com.aruna.manualdependencyinjection.repository.UserRepository;

import retrofit2.Retrofit;

// Container of objects shared across the whole app
public class AppContainer {

    // Since you want to expose userRepository out of the container, you need to satisfy
    // its dependencies as you did before

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://example.com")
            .build();
    private LoginService service = retrofit.create(LoginService.class);

    private UserRemoteDataSource remoteDataSource = new UserRemoteDataSource(retrofit);
    private UserLocalDataSource localDataSource = new UserLocalDataSource();

    // userRepository is not private; it'll be exposed
    public UserRepository userRepository = new UserRepository(localDataSource, remoteDataSource);

    public LoginViewModelFactory loginViewModelFactory = new LoginViewModelFactory(userRepository);
}
