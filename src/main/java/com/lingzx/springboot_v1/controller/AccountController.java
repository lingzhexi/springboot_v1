package com.lingzx.springboot_v1.controller;

import com.lingzx.springboot_v1.entity.Account;
import com.lingzx.springboot_v1.entity.Man;
import com.lingzx.springboot_v1.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述
 *
 * @ClassName: AccountController
 * @Author: lingzx
 * @Date 2019/07/23 23:32:53
 * @Version 1.0
 **/
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;
    @GetMapping("/list")
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id){
        return accountService.findAccountById(id);
    }
    @PutMapping("/{id}")
    public String updateAccount(@PathVariable("id")int id ,
                   @RequestParam(value = "name",required = true)String name,
                   @RequestParam(value = "money" ,required = true)double money){
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountService.update(account);
        if(t==1){
            return account.toString();
        }
        return "error";
    }

    @PostMapping("/add")
    public String postAccount(@RequestParam(value = "name")String name,
                              @RequestParam(value = "money")double moeny){
        Account account = new Account();
        account.setMoney(moeny);
        account.setName(name);
        int t = accountService.add(account);
        return account.toString();
    }

    public static void main(String[] args) {

        Man man = new Man();
        man.setName("脸脸");
        man.setAge(18);
        man.setGender("美少女");
        man.setPhone("18596665196");
        System.out.println(man);
        Man man1 = new Man();
        man1.setName("凌车");
        man1.setPhone("1123");
        man1.setAge(37);
        man1.setGender("傻逼男");
        System.out.println(man1);
    }


}
