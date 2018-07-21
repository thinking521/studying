package com.xunhe.boot2msa.controller;


import com.alibaba.fastjson.JSON;
import com.xunhe.boot2msa.po.TblCalendar;
import com.xunhe.boot2msa.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;

import java.text.SimpleDateFormat;

@RestController
public class CalendarController {


    @Autowired
    private CalendarService calendarService;
    //insert
    @RequestMapping("/calendarInsert")
    public Object calendarInsert(HttpServletRequest request){
        //接受
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        String ifOK=request.getParameter("ifOK");
        String importance=request.getParameter("importance");
        String finishDate=request.getParameter("finishDate");
        TblCalendar tblCalendar;
        //处理
        try {
            tblCalendar=new TblCalendar(
                    title,
                    content,
                    Integer.parseInt(ifOK),
                    Integer.parseInt(importance),
                    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(finishDate));
            System.out.println(tblCalendar);
            //返回
            return calendarService.calendarInsert(tblCalendar);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    //delete
    @RequestMapping("/calendarDelete")
    public Object calendarDelete(HttpServletRequest request){
        //接受
        String id=request.getParameter("id");
        //调用并返回
        return calendarService.calendarDelete(Integer.parseInt(id));
    }
    //update
    @RequestMapping("/calendarUpdate")
    public Object calendarUpdate(HttpServletRequest request){
        //接受
        String title=request.getParameter("title");
        String id=request.getParameter("id");
        TblCalendar tblCalendar;
        //处理
        try {
            tblCalendar=new TblCalendar();
            tblCalendar.setId(Integer.parseInt(id));
            tblCalendar.setTitle(title);
            //返回
            return calendarService.calendarUpdate(tblCalendar);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    //selectOne
    //selectAll
    @RequestMapping("/test")
    public String test(){
        return  "a";
    }


    //    @RequestMapping("/test")
//    public ModelAndView findProjectPage() {
//        ModelAndView modelAndView = new ModelAndView("/a.html");
//        return modelAndView;
//    }
    @RequestMapping("/calendarSelectAll")
    public Object caledarSelectAll(HttpServletRequest request){
        String np=request.getParameter("np");
        String size=request.getParameter("size");
        return JSON.toJSONString(calendarService.calendarSelectAll(Integer.parseInt(np),Integer.parseInt(size)));
    }

    @RequestMapping("/caledarSelectOne")
    public Object caledarSelectOne(HttpServletRequest request){
        String title=request.getParameter("title");
        TblCalendar tblCalendar=new TblCalendar();
        tblCalendar.setTitle(title);
        return calendarService.calendarSelectOne(tblCalendar);
    }
}
