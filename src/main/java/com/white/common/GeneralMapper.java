package com.white.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface GeneralMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
