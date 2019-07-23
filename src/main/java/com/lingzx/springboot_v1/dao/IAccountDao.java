package com.lingzx.springboot_v1.dao;

import com.lingzx.springboot_v1.entity.Account;

import java.util.List;

/**
 * 描述
 *
 * @ClassName: IAcountDao
 * @Author: lingzx
 * @Date 2019/07/23 22:40:53
 * @Version 1.0
 **/
public interface IAccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
