package com.xunhe.boot2msa.service.impl;

import com.xunhe.boot2msa.dao.CalendarDao;
import com.xunhe.boot2msa.po.TblCalendar;
import com.xunhe.boot2msa.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    private CalendarDao calendarDao;

    @Override
    public int calendarInsert(TblCalendar tblCalendar) {
        return calendarDao.calendarInsert(tblCalendar);
    }

    @Override
    public int calendarDelete(int id) {
        return calendarDao.calendarDelete(id);
    }

    @Override
    public int calendarUpdate(TblCalendar tblCalendar) {
        return calendarDao.calendarUpdate(tblCalendar);
    }

    @Override
    public TblCalendar calendarSelectOne(TblCalendar tblCalendar) {
        return calendarDao.calendarSelectOne(tblCalendar);
    }

    @Override
    public List<TblCalendar> calendarSelectAll(int np, int size) {
        return calendarDao.calendarSelectAll((np-1)*size,size);
    }
}
