package com.white.mapper;

import com.white.beans.User;
import com.white.common.GeneralMapper;
import org.apache.ibatis.annotations.Param;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends GeneralMapper<User> {

    User selectOrderByUsername(@Param("username") String username);
}
