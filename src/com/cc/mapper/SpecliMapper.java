package com.cc.mapper;

import com.cc.po.specilinfo;

import java.util.List;
import java.util.Map;

public interface SpecliMapper {
    //分页查询
    List<specilinfo> findSpecilSplit(Map<String,Object> map);
}
