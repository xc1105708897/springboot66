package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.mapper.TUserMapper;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XuCong
 * @Date 2019/7/30
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
