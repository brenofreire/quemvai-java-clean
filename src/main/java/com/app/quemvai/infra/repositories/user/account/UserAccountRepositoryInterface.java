package com.app.quemvai.infra.repositories.user.account;

import java.util.Optional;

import com.app.quemvai.infra.models.UserAccountModel;


public interface UserAccountRepositoryInterface {
    void create(UserAccountModel userAccount);

    Optional<UserAccountModel> getUserAccountByUsername(String username);
}