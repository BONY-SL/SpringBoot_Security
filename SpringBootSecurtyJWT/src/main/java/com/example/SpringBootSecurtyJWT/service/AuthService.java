package com.example.SpringBootSecurtyJWT.service;


import com.example.SpringBootSecurtyJWT.controller.AuthenticationRequest;
import com.example.SpringBootSecurtyJWT.controller.AuthenticationResponse;
import com.example.SpringBootSecurtyJWT.controller.RegisterRequest;
import com.example.SpringBootSecurtyJWT.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {


    private final UserRepository userRepository;



    public AuthenticationResponse register(RegisterRequest request){

        return null;

    }

    public AuthenticationResponse authenticate(AuthenticationRequest request){
        return null;
    }


}
