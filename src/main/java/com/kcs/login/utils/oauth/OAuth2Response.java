package com.kcs.login.utils.oauth;

public interface OAuth2Response {
    String getProvider();
    String getEmail();

    String getName();
}
