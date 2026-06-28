package com.jamildev.service.impl;


import com.jamildev.config.JwtProvider;
import com.jamildev.exception.UserException;
import com.jamildev.model.User;
import com.jamildev.repository.PasswordResetTokenRepository;
import com.jamildev.repository.UserRepository;
import com.jamildev.service.UserService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {


    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;
    private final PasswordResetTokenRepository passwordResetTokenRepository;
    private final JavaMailSender javaMailSender;

    public UserServiceImplementation(
            UserRepository userRepository,
            JwtProvider jwtProvider,
            PasswordEncoder passwordEncoder,
            PasswordResetTokenRepository passwordResetTokenRepository,
            JavaMailSender javaMailSender) {

        this.userRepository = userRepository;
        this.jwtProvider = jwtProvider;
        this.passwordEncoder = passwordEncoder;
        this.passwordResetTokenRepository = passwordResetTokenRepository;
        this.javaMailSender = javaMailSender;

    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromJwtToken(jwt);


        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UserException("user not exist with email " + email);
        }
        return user;
    }


    @Override
    public User findUserByEmail(String username) throws UserException {

        User user = userRepository.findByEmail(username);

        if (user != null) {

            return user;
        }

        throw new UserException("user not exist with username " + username);
    }


}
