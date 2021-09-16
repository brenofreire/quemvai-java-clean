package com.app.quemvai.domain.entities.user;

import java.util.List;

import com.app.quemvai.domain.usecases.validations.PersonalDataPropertyValidator;
import com.app.quemvai.domain.usecases.validations.ValidationException;
import com.app.quemvai.domain.usecases.validations.ValidatorInterface;



public class Username {
    private String username;

    public Username(String username, List<ValidatorInterface> validations) throws ValidationException {
        new PersonalDataPropertyValidator(username, validations);

        this.username = username;
    }

    @Override
    public String toString() {
        return this.username;
    }
}