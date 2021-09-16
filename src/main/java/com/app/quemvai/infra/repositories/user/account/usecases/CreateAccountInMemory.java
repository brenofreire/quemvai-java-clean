package com.app.quemvai.infra.repositories.user.account.usecases;

import com.app.quemvai.domain.entities.user.User;
import com.app.quemvai.infra.models.UserAccountModel;
import com.app.quemvai.infra.repositories.user.account.UserAccountRepositoryInterface;
import com.app.quemvai.infra.repositories.user.account.usecases.interfaces.CreateAccountInterface;

public class CreateAccountInMemory implements CreateAccountInterface {
    private User user;
    private UserAccountRepositoryInterface userAccountRepository;
 
    public CreateAccountInMemory(User user, UserAccountRepositoryInterface userAccountRepository) {
        this.user = user;
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccountModel create() {
        UserAccountModel userAccount =  new UserAccountModel(user.personalData.getName(), user.personalData.getUsername(), user.personalData.getPassword());

        this.userAccountRepository.create(userAccount);

        return userAccount;
    }
}
