package com.xunhe.boot2msa.controller;


import com.alibaba.fastjson.JSON;

import com.xunhe.boot2msa.po.TblResultinfo;
import com.xunhe.boot2msa.service.ResultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@RestController
public class ResultinfoController {

    @Autowired
    private ResultInfoService resultInfoService;
    //insert
    @RequestMapping("/resultinfoInsert")
    public Object resultinfoInsert(HttpServletRequest request){

//        String result_id=request.getParameter("result_id");
        String create_date=request.getParameter("create_date");
        String case_id=request.getParameter("case_id");
        String project_period_id=request.getParameter("project_period_id");
        String job_type=request.getParameter("job_type");
        String job_period_id=request.getParameter("job_period_id");
        String job_content=request.getParameter("job_content");
        String job_lasts=request.getParameter("job_lasts");
        String user_name=request.getParameter("user_name");
        TblResultinfo tTblResultinfo;
        //处理
        try {
            tTblResultinfo=new TblResultinfo(
            create_date,
            case_id,
            project_period_id,
            job_period_id,
            job_type,
            job_content,
            job_lasts,
            user_name);
            System.out.println(tTblResultinfo);
            //返回
            return resultInfoService.resultinfoInserTt(tTblResultinfo);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    //delete
    @RequestMapping("/resultinfoDelete")
    public Object resultinfoDelete(HttpServletRequest request){
        //接受
        String result_id=request.getParameter("result_id");
        TblResultinfo tTblResultinfo = new TblResultinfo();
        tTblResultinfo.setResult_id(result_id);
        //调用并返回
        return resultInfoService.resultinfoDelete(tTblResultinfo);
    }

    //update
    @RequestMapping("/resultinfoUpdate")
    public Object resultinfoUpdate(HttpServletRequest request){
        //接受
        String result_id=request.getParameter("result_id");
        String create_date=request.getParameter("create_date");
        String case_id=request.getParameter("case_id");
        String project_period_id=request.getParameter("project_period_id");
        String job_type=request.getParameter("job_type");
        String job_period_id=request.getParameter("job_period_id");
        String job_content=request.getParameter("job_content");
        String job_lasts=request.getParameter("job_lasts");
        String user_name=request.getParameter("user_name");
        TblResultinfo tblResultinfo;
        //处理
        try {
            tblResultinfo=new TblResultinfo(
                    result_id,
                    create_date,
                    case_id,
                    project_period_id,
                    job_period_id,
                    job_type,
                    job_content,
                    job_lasts,
                    user_name);
            System.out.println(tblResultinfo);
            //返回
            return resultInfoService.resultinfoUpdate(tblResultinfo);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("/resultinfoSelect")
    public Object resultinfoSelect(HttpServletRequest request){
        //接受
        String create_date=request.getParameter("create_date");
        String user_name=request.getParameter("user_name");

        TblResultinfo tblResultinfo;
        //处理
        try {
            tblResultinfo=new TblResultinfo();
            tblResultinfo.setCreate_date(create_date);
            tblResultinfo.setUser_name(user_name);
            //返回
            return resultInfoService.resultinfoSelect(tblResultinfo);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("/resultinfoSelectAll")
    public Object resultinfoSelectAll(HttpServletRequest request){
        //接受
        String create_date=request.getParameter("create_date");
        String case_id=request.getParameter("case_id");
        String user_name=request.getParameter("user_name");

        TblResultinfo tblResultinfo;
        //处理
        try {
            tblResultinfo=new TblResultinfo();
            tblResultinfo.setCreate_date(create_date);
            tblResultinfo.setCase_id(case_id);
            tblResultinfo.setUser_name(user_name);
            //返回
            return resultInfoService.resultinfoSelectAll(tblResultinfo);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
