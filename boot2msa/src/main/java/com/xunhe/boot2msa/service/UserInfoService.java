package com.xunhe.boot2msa.service;

import com.xunhe.boot2msa.po.TblResultinfo;
import com.xunhe.boot2msa.po.TblUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface UserInfoService {
    //selectAll
    public List<TblUser> userinfoSelectAll(TblUser tblUser);

}
