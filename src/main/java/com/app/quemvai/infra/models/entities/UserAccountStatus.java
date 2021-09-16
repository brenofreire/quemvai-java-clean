package com.app.quemvai.infra.models.entities;

public enum UserAccountStatus {
    INACTIVE(1),
    ACTIVE(1),
    TEMPORARY(2);

    public final int userAccountStatus;
    
    UserAccountStatus(int userAccountStatus) {
        this.userAccountStatus = userAccountStatus;
    }
}
