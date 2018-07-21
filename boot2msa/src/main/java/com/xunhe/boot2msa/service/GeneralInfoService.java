package com.xunhe.boot2msa.service;

import com.xunhe.boot2msa.po.TblGeneralinfo;
import com.xunhe.boot2msa.po.TblResultinfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface GeneralInfoService {
    //select
    public List<TblGeneralinfo> selectTypeInfo(String type);
}

