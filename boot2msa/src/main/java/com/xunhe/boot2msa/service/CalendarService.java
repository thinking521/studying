package com.xunhe.boot2msa.service;

import com.xunhe.boot2msa.po.TblCalendar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CalendarService {
    //insert
    public int calendarInsert(TblCalendar tblCalendar);
    //delete
    public int calendarDelete(int id);
    //update
    public int calendarUpdate(TblCalendar tblCalendar);
    //selectOne
    public TblCalendar calendarSelectOne(TblCalendar tblCalendar);
    //selectAll
    public List<TblCalendar> calendarSelectAll(int np, int size);

}
