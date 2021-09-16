package com.app.quemvai.domain.usecases.factories;

import java.util.ArrayList;
import java.util.List;

import com.app.quemvai.domain.entities.user.Password;
import com.app.quemvai.domain.entities.user.PersonalData;
import com.app.quemvai.domain.entities.user.User;
import com.app.quemvai.domain.entities.user.Username;
import com.app.quemvai.domain.usecases.validations.PasswordBaseValidator;
import com.app.quemvai.domain.usecases.validations.UsernameBaseValidator;
import com.app.quemvai.domain.usecases.validations.ValidationException;
import com.app.quemvai.domain.usecases.validations.ValidatorInterface;


public class UserFactory {
    private User user;

    public UserFactory(String name, String username, String password) throws ValidationException {
        try {            
            List<ValidatorInterface> usernameValidations = new ArrayList<ValidatorInterface>();
            usernameValidations.add(new UsernameBaseValidator());
    
            List<ValidatorInterface> passwordValidations = new ArrayList<ValidatorInterface>();
            passwordValidations.add(new PasswordBaseValidator());
            
            Username workerUsername = new Username(username, usernameValidations);
            Password workerPassword = new Password(password, passwordValidations);    
            PersonalData personalData = new PersonalData(workerUsername, workerPassword, name);

            this.user = new User(personalData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public User create() {
        return this.user;
    }
}
