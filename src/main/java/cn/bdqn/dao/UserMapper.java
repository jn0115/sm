package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> list();

    void delete(Integer id);

    void update(User user);
    @Select("select * from User where id=#{id}")
    User getUserById(int id);

    void add(User user);
}
