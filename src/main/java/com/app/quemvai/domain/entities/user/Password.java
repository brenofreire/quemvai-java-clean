package com.app.quemvai.domain.entities.user;

import java.util.List;

import com.app.quemvai.domain.usecases.validations.PersonalDataPropertyValidator;
import com.app.quemvai.domain.usecases.validations.ValidationException;
import com.app.quemvai.domain.usecases.validations.ValidatorInterface;

public class Password {
    private String password;

    public Password(String password, List<ValidatorInterface> validations) throws ValidationException {
        new PersonalDataPropertyValidator(password, validations);

        this.password = password;
    }

    @Override
    public String toString() {
        return this.password;
    }
}
