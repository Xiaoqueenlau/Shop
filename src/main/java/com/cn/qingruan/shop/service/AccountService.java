package com.cn.qingruan.shop.service;

import com.cn.qingruan.shop.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
