package com.xunhe.boot2msa.controller;


import com.xunhe.boot2msa.po.TblUser;
import com.xunhe.boot2msa.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserinfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public Object login(HttpServletRequest request){
        //接受
        String user_name=request.getParameter("user_name");
        String password=request.getParameter("password");

        TblUser tblUser;
        //处理
        try {
            tblUser=new TblUser();
            tblUser.setPassword("");
            tblUser.setUser_name(user_name);
            List list = (List)userInfoService.userinfoSelectAll(tblUser);
            if (list.size()>0)
            {
                tblUser.setPassword(password);
                tblUser.setUser_name(user_name);
                List listAll = (List)userInfoService.userinfoSelectAll(tblUser);
                if (listAll.size()>0)
                {
                    return 0;
                }
                else
                {
                    return -2;
                }
            }
            else
            {
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("/userSelect")
    public Object userSelect(HttpServletRequest request){
        TblUser tblUser;
        //处理
        try {
            tblUser=new TblUser();
            tblUser.setPassword("");
            tblUser.setUser_name("");
            return userInfoService.userinfoSelectAll(tblUser);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
