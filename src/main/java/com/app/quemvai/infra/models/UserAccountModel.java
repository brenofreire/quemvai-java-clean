package com.app.quemvai.infra.models;

import java.time.LocalDate;
import com.app.quemvai.domain.entities.user.Password;
import com.app.quemvai.domain.entities.user.Username;
import com.app.quemvai.infra.models.entities.UserAccountStatus;



public class UserAccountModel {
    private int id;
    private String name;
    private String username;
    private String password;
    private LocalDate createdAt;
    private LocalDate updatedAt;    
    private UserAccountStatus status;

    public UserAccountModel(String name, Username username, Password password) {
        this.name = name;
        this.username = username.toString();
        this.password = password.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
    
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public UserAccountStatus getStatus() {
        return status;
    }
}
