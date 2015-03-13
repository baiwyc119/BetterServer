package com.hh.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages="com.hh.mapper"/*, sqlSessionFactoryRef="mySessionFactory"*/)
public class MybatisInitialization {
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/BetterSphere?useUnicode=true&characterEncoding=UTF-8");
	        dataSource.setUsername("root");
	        dataSource.setPassword("123456");
	        return dataSource;
	    }
	 
	 @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource);
	        return sessionFactory.getObject();
	    }
}
