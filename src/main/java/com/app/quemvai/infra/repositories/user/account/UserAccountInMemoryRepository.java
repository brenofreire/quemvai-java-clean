package com.app.quemvai.infra.repositories.user.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.quemvai.infra.models.UserAccountModel;

public class UserAccountInMemoryRepository implements UserAccountRepositoryInterface {
    List<UserAccountModel> userAccounts = new ArrayList<UserAccountModel>();    

    @Override
    public void create(UserAccountModel userAccount) {
        this.userAccounts.add(userAccount);
    }
    
    @Override
    public Optional<UserAccountModel> getUserAccountByUsername(String username) {
        return this.userAccounts.stream().filter(userAccount -> userAccount.getUsername() == username).findFirst();
    }
}
