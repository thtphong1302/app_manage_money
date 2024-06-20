package service;

import model.User;

public interface AuthenticationService {
    void register(User user);
    boolean authenticate(String username, String password);
}
