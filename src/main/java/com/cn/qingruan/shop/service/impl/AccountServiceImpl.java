package com.cn.qingruan.shop.service.impl;

import com.cn.qingruan.shop.dao.AccountDao;
import com.cn.qingruan.shop.domain.Account;
import com.cn.qingruan.shop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao ;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("save");
    }
}
