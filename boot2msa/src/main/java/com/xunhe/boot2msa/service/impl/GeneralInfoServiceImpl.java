package com.xunhe.boot2msa.service.impl;

import com.xunhe.boot2msa.dao.GeneralinfoDao;
import com.xunhe.boot2msa.po.TblGeneralinfo;
import com.xunhe.boot2msa.service.GeneralInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GeneralInfoServiceImpl implements GeneralInfoService {

    @Autowired
    public GeneralinfoDao generalinfoDao;

    @Override
    public List<TblGeneralinfo> selectTypeInfo(String type) {
        return generalinfoDao.selectTypeInfo(type);
    }
}