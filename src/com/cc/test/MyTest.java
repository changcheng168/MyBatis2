package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.mapper.CustomerMapper;
import org.apache.ibatis.session.SqlSession;

public class MyTest {
    //批量删
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        String [] array =new String[]{"3","4"};
        int row =sqlSession.delete("decetBatch",array);
        if (row>0) System.out.println("成功");
        else System.out.println("失败");
    }
}
