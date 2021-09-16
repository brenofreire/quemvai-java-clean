package com.app.quemvai.infra.repositories.user.account.usecases;

import com.app.quemvai.infra.models.UserAccountModel;
import com.app.quemvai.infra.repositories.user.account.UserAccountRepositoryInterface;
import com.app.quemvai.infra.repositories.user.account.usecases.interfaces.UpdateAccountInteface;

public class UpdateAccountInMemory implements UpdateAccountInteface {

    @Override
    public UserAccountModel update(UserAccountModel userAccountModel, UserAccountRepositoryInterface userAccountRepository) {
        UserAccountModel userAccount = userAccountRepository.getUserAccountByUsername(userAccountModel.getUsername()).get();

        return userAccount;
    }
}
