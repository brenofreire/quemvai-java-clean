package com.app.quemvai.infra.repositories.user.account.usecases.interfaces;

import com.app.quemvai.infra.models.UserAccountModel;
import com.app.quemvai.infra.repositories.user.account.UserAccountRepositoryInterface;

public interface UpdateAccountInteface {
    UserAccountModel update(UserAccountModel userAccountModel, UserAccountRepositoryInterface userAccountRepository);
}
