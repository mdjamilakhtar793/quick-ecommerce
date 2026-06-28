package com.jamildev.service;

import com.jamildev.exception.SellerException;
import com.jamildev.exception.UserException;
import com.jamildev.request.LoginRequest;
import com.jamildev.request.SignupRequest;
import com.jamildev.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;

    String createUser(SignupRequest req) throws SellerException;

    AuthResponse signin(LoginRequest req) throws SellerException;

}
