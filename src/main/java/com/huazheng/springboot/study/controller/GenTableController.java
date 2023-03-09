package com.huazheng.springboot.study.controller;

import com.huazheng.springboot.study.entity.GenTable;
import com.huazheng.springboot.study.service.GenTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhanghuazheng
 * @Date 2023-03-09 21:22
 * @Description: TODO
 * @Version 1.0
 */
@RestController
public class GenTableController {

    @Autowired
    private GenTableService genTableService;

    @GetMapping("/query")
    public GenTable queryGentTable(){
        return genTableService.getGenTableList();
    }
}
