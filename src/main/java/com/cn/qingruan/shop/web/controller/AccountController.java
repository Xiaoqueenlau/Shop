package com.cn.qingruan.shop.web.controller;

import com.cn.qingruan.shop.domain.Account;
import com.cn.qingruan.shop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("controller");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        accountService.saveAccount(account);
        resp.sendRedirect(req.getContextPath()+"/account/findAll");

    }
}
