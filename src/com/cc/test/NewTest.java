package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.mapper.SpecliMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;

import java.util.HashMap;
import java.util.Map;

public class NewTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(flae:false);
        int pageNum=1;
        int pageSize=5;
        int start=(pageNum-1)*pageSize;
        SpecliMapper specliMapper = ((SqlSession) sqlSession).getMapper(SpecliMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put()
    }
}
