package com.hoaxify.ws.User.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.hoaxify.ws.User.User;
import com.hoaxify.ws.User.UserRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        User inDB = userRepository.findByEmail(value);
        
        if(inDB != null) {
            return false;
        }
        return true;
    }
}
