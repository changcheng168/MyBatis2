package com.cc.mapper;

import com.cc.po.Customer;
import com.sun.xml.internal.ws.api.message.Attachment;

import java.util.List;

public interface CustomerMapper {
    //批量插
    public List<Customer> insert(String customer);
        //批量改
        public List<Customer> updateBatch(String customer);
        //批量删
    public List<Customer> deleteBatch(String customer);
    }
}
