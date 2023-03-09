package com.huazheng.springboot.study.dao.db1;

import com.huazheng.springboot.study.entity.GenTable;

/**
* @author zhanghuazheng
* @description 针对表【gen_table(代码生成表)】的数据库操作Mapper
* @createDate 2023-03-09 21:04:38
* @Entity com.huazheng.springboot.study.entity.GenTable
*/
public interface GenTableMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GenTable record);

    int insertSelective(GenTable record);

    GenTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GenTable record);

    int updateByPrimaryKey(GenTable record);

}
