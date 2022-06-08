package cn.bdqn.service.impl;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }


}
