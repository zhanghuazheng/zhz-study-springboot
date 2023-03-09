package com.huazheng.springboot.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author zhanghuazheng
 * @Date 2023-03-09 14:29
 * @Description: 数据源1的配置
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = "com.huazheng.springboot.study.dao.db1", sqlSessionFactoryRef = "oneSqlSessionFactory")
public class DataSourceConfig1 {
    // 将这个对象放入Spring容器中
    @Bean(name = "oneDataSource")
    // 表示这个数据源是默认数据源
    @Primary
    // 读取application.properties中的配置参数映射成为一个对象
    // prefix表示参数的前缀
    @ConfigurationProperties(prefix = "spring.datasource.druid.db1")
    public DataSource getDateSource1() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Bean(name = "oneSqlSessionFactory")
    // 表示这个数据源是默认数据源
    @Primary
    // @Qualifier表示查找Spring容器中名字为oneDataSource的对象
    public SqlSessionFactory oneSqlSessionFactory(@Qualifier("oneDataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper.db1/*.xml"));
        return bean.getObject();
    }

    @Bean("oneSqlSessionTemplate")
    // 表示这个数据源是默认数据源
    @Primary
    public SqlSessionTemplate oneSqlSessionTemplate(
            @Qualifier("oneSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }

}
