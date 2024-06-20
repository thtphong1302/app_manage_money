package service.impl;

import model.User;
import service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public void register(User user) {

    }

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }
}
