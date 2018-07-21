package com.xunhe.boot2msa.controller;


import com.xunhe.boot2msa.po.TblResultinfo;
import com.xunhe.boot2msa.service.GeneralInfoService;
import com.xunhe.boot2msa.service.ResultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GeneralinfoController {

    @Autowired
    private GeneralInfoService generalInfoService;

    @RequestMapping("/typeinfoSelect")
    public Object typeinfoSelect(HttpServletRequest request){
        //处理
        String type=request.getParameter("type");
        if (type.equals("1"))
        {
            type = "案件ID";
        }
        else if (type.equals("2"))
        {
            type = "工程阶段";
        }
        else if (type.equals("3"))
        {
            type = "工作阶段";
        }

        try {
            //返回
            return generalInfoService.selectTypeInfo(type);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
