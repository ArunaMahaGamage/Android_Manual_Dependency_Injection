package com.aruna.manualdependencyinjection.viewmodel;

import com.aruna.manualdependencyinjection.repository.UserRepository;

public class LoginViewModel {
    private UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
