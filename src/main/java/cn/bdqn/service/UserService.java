package cn.bdqn.service;

import cn.bdqn.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void delete(Integer id);

    void update(User user);

    User getUserById(int id);

    void add(User user);
}
