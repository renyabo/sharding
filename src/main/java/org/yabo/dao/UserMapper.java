package org.yabo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.yabo.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User user);

    User queryById(String id);

    List<User> queryByIds(List<String> ids);
}
