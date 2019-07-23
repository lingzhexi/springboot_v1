package com.lingzx.springboot_v1.service;

import com.lingzx.springboot_v1.entity.Account;

import java.util.List;

/**
 * 描述
 *
 * @ClassName: IAccountService
 * @Author: lingzx
 * @Date 2019/07/23 23:11:39
 * @Version 1.0
 **/
public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
