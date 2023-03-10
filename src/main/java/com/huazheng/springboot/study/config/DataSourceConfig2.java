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
 * @Description: 数据源2 的配置
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = "com.huazheng.springboot.study.dao.db2", sqlSessionFactoryRef = "twoSqlSessionFactory")
public class DataSourceConfig2 {
    // 将这个对象放入Spring容器中
    @Bean(name = "twoDataSource")
    // 读取application.properties中的配置参数映射成为一个对象
    // prefix表示参数的前缀
    @ConfigurationProperties(prefix = "spring.datasource.druid.db2")
    public DataSource getDateSource1() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Bean(name = "twoSqlSessionFactory")
    // 表示这个数据源是默认数据源
    //@Primary
    // @Qualifier表示查找Spring容器中名字为oneDataSource的对象
    public SqlSessionFactory oneSqlSessionFactory(@Qualifier("twoDataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*/*.xml"));
        return bean.getObject();
    }

    @Bean("twoSqlSessionTemplate")
    // 表示这个数据源是默认数据源
    //@Primary
    public SqlSessionTemplate oneSqlSessionTemplate(
            @Qualifier("twoSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }

}