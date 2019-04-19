package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.mapper.CustomerMapper;
import com.cc.po.Customer;
import org.apache.ibatis.session.SqlSession;
import sun.util.resources.cldr.chr.CalendarData_chr_US;

import java.sql.SQLOutput;
import java.util.List;

public class IfTest {
    public static void main(String[] args) {
        SqlSession sqlSessionA = MybatisUtils.getSqlSession(false);
        CustomerMapper customerMapper = sqlSessionA.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findById(1);
        System.out.println(customer);
        //关闭sqlsession
        MybatisUtils.closeSqlSession(sqlSessionA);
        System.out.println("****************************");

        SqlSession sqlSession1B = MybatisUtils.getSqlSession(false);
        CustomerMapper customerMapperB = sqlSession.getMapper(CustomerMapper.class);
        /*List<Customer> all = customerMapper.findAll();*/
        String keyword="曹";
        List<Customer> byLikeName = customerMapper.findByLikeName(keyword);
        for (Customer customer1 : byLikeName){
            System.out.println(customer);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    ;
    }
}
