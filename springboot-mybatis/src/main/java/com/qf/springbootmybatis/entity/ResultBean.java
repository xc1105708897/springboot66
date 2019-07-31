package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author XuCong
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String respCode;
    private T data;
}
