package com.cc.test;

import com.cc.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest{
    @Test
    public  void fCById() throws Exception{
        String re= "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(re);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Customer customer=sqlSession.selectOne("fCById",2);
        System.out.println(customer.toString());
        sqlSession.close();
    }
    @Test
    public  void fCByName() throws Exception{
        String resource= "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Customer customers=sqlSession.selectOne("fCByName","j");
        System.out.println(customers);
        sqlSession.close();
    }

    @Test
    public  void addC() throws Exception{
        String resource= "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Customer customer=new Customer();
        customer.setUsername("cc");
        customer.setJobs("student");
        customer.setPhone("888888");
        int rows=sqlSession.insert("addC",customer);
        if (rows>0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public  void upC() throws Exception{
        String resource= "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Customer customer=new Customer();
        customer.setId(4);
        customer.setUsername("changcheng");
        customer.setJobs("student");
        customer.setPhone("8888880");
        int rows=sqlSession.insert("upC",customer);
        if (rows>0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }




}
