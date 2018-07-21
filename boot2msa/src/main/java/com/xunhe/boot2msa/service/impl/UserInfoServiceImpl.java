package com.xunhe.boot2msa.service.impl;


import com.xunhe.boot2msa.dao.UserinfoDao;
import com.xunhe.boot2msa.po.TblUser;
import com.xunhe.boot2msa.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    public UserinfoDao userinfoDao;

    @Override
    public List<TblUser> userinfoSelectAll(TblUser tbluser) {
        return userinfoDao.userinfoSelectAll(tbluser);
    }
}
