package com.lingzx.springboot_v1.service.impl;

import com.lingzx.springboot_v1.dao.IAccountDao;
import com.lingzx.springboot_v1.entity.Account;
import com.lingzx.springboot_v1.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述
 *
 * @ClassName: AccountServiceImpl
 * @Author: lingzx
 * @Date 2019/07/23 23:12:26
 * @Version 1.0
 **/
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}
