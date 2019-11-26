package com.ctgdesktop.testctyun.dao;

import com.ctgdesktop.testctyun.entity.User;
import com.ctgdesktop.testctyun.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDao extends UserMapper {
    List<User> findByName(@Param("userName") String username);

    User selectById(@Param("id") Integer id);
}