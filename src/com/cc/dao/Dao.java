package com.cc.dao;

import com.cc.po.Customer;

import java.util.List;

public interface Dao {
    int fCById(int id);
    public List<Customer> fCByName(Integer pageNo, Integer pageSize);
    public int addC(Customer customer);
    public int upC(Customer customer);
    public int deC(int id);
}
