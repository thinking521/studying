package com.xunhe.boot2msa.service.impl;

import com.xunhe.boot2msa.dao.ResultinfoDao;
import com.xunhe.boot2msa.po.TblResultinfo;
import com.xunhe.boot2msa.service.ResultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



    @Service
    public class ResultInfoServiceImpl implements ResultInfoService {

        @Autowired
        public ResultinfoDao resultinfoDao;

    @Override
    public int resultinfoInserTt(TblResultinfo tblResultinfo) {
        return resultinfoDao.insert (tblResultinfo);
    }

    @Override
    public int resultinfoDelete(TblResultinfo tblResultinfo) {
        return resultinfoDao.delete(tblResultinfo);
    }

    @Override
    public int resultinfoUpdate(TblResultinfo tblResultinfo) {
        return resultinfoDao.update(tblResultinfo);
    }

    @Override
    public List<TblResultinfo> resultinfoSelect(TblResultinfo tblResultinfo) {
        return resultinfoDao.select(tblResultinfo);
    }

    @Override
    public List<TblResultinfo> resultinfoSelectAll(TblResultinfo tblResultinfo) {
        return resultinfoDao.resultinfoSelectAll(tblResultinfo);
    }
    }
