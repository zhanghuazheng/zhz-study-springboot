package com.huazheng.springboot.study.service;

import com.huazheng.springboot.study.SpringbootStudyApplicationTests;
import com.huazheng.springboot.study.entity.GenTable;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zhanghuazheng
 * @Date 2023-03-09 21:13
 * @Description: TODO
 * @Version 1.0
 */

@Slf4j
public class GenTableServiceTest extends SpringbootStudyApplicationTests {

    @Autowired
    private GenTableService genTableService;

    @Test
    void getGenTableList() {
        GenTable genTableList = genTableService.getGenTableList();
        log.info("查询结果genTableList={}",genTableList);
    }
}