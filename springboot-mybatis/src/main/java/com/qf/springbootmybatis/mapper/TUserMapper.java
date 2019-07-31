package com.qf.springbootmybatis.mapper;

import com.qf.springbootmybatis.entity.TUser;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}