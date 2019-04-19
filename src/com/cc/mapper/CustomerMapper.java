package com.cc.mapper;

import com.cc.po.Customer;

import java.util.List;

public interface CustomerMapper {
    //根据ID查
    Customer findById(int id);
    //查全部
    List<Customer> findAll();
    //模糊查
    List<Customer> findByLikeName(String keyword);
    //用if元素来合二为一
    List<Customer> findAllByLikeName(String keyword);
}
