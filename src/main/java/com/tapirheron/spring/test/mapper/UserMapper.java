package com.tapirheron.spring.test.mapper;

import com.tapirheron.spring.dao.BaseMapper;
import com.tapirheron.spring.dao.Mapper;
import com.tapirheron.spring.test.entity.UserEntity;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    boolean addUser(UserEntity userEntity);
    UserEntity executeSql(String sql);
    List<UserEntity> executeQueryList(String sqlQuery);
    boolean executeAddQuery(String sql);
}
