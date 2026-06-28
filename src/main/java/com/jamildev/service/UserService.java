package com.jamildev.service;

import com.jamildev.exception.UserException;
import com.jamildev.model.User;

public interface UserService {

    User findUserProfileByJwt(String jwt) throws UserException;

    User findUserByEmail(String email) throws UserException;


}
