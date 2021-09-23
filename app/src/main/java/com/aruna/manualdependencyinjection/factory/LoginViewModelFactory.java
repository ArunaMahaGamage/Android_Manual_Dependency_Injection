package com.aruna.manualdependencyinjection.factory;

import com.aruna.manualdependencyinjection.factory.Factory;
import com.aruna.manualdependencyinjection.repository.UserRepository;
import com.aruna.manualdependencyinjection.viewmodel.LoginViewModel;

// Factory for LoginViewModel.
// Since LoginViewModel depends on UserRepository, in order to create instances of
// LoginViewModel, you need an instance of UserRepository that you pass as a parameter.
public class LoginViewModelFactory implements Factory {

    private final UserRepository userRepository;

    public LoginViewModelFactory(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginViewModel create() {
        return new LoginViewModel(userRepository);
    }
}
