package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.TUser;

/**
 * @author XuCong
 * @Date 2019/7/30
 */
public interface IUserService {

    TUser getById(Integer id);
}
