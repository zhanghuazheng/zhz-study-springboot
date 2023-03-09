package com.huazheng.springboot.study.service;

import com.huazheng.springboot.study.dao.db1.GenTableMapper;
import com.huazheng.springboot.study.entity.GenTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author zhanghuazheng
 * @Date 2023-03-09 21:08
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class GenTableService {
    @Resource
    private GenTableMapper genTableMapper;

    public GenTable getGenTableList() {
        return genTableMapper.selectByPrimaryKey(1L);
    }
}
