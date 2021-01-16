package com.cn.qingruan.shop.dao;

import com.cn.qingruan.shop.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();
    @Insert("insert into account values(null,#{name},#{money})")
    public void saveAccount(Account account);
}
