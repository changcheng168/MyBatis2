package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.mapper.CustomerMapper;
import com.cc.po.Customer;
import org.apache.ibatis.session.SqlSession;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        Customer customer = customerMapper.findById(1);
        System.out.println(customer);

    }
}
