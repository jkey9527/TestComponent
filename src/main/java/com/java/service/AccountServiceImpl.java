package com.java.service;

import com.java.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("as")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao ad;

    @Override
    public void account(String in, String out, Double money) {
        ad.out(out,money);
        //int a= 10/0;
        ad.in(in,money);
    }
}
