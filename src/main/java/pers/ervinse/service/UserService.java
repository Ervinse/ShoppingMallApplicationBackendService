package pers.ervinse.service;

import pers.ervinse.domain.User;

public interface UserService {

    Boolean login(User user);

    boolean register(User user);

    String getDescription(String name);
}
