package com.kcs3.login.utils.oauth;

public interface OAuth2Response {
    String getProvider();
    String getEmail();

    String getName();
}
