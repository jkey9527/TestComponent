package com.java.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("ad")
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Autowired
    public void setSuperDataSource(DataSource dataSource){
        super.setDataSource(dataSource);
    }

    public void in(String name, Double money) {
        getJdbcTemplate().update("update accounts set money=money+? where name=?",money,name);
    }

    public void out(String name, Double money) {
        getJdbcTemplate().update("update accounts set money=money-? where name=?",money,name);
    }
}
