package com.xunhe.boot2msa.service;

import com.xunhe.boot2msa.po.TblResultinfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface ResultInfoService {
    //insert
    public int resultinfoInserTt(TblResultinfo resultinfo);
    //delete
    public int resultinfoDelete(TblResultinfo resultinfo);
    //update
    public int resultinfoUpdate(TblResultinfo resultinfo);

    //select
    public List<TblResultinfo> resultinfoSelect(TblResultinfo resultinfo);

    //selectAll
    public List<TblResultinfo> resultinfoSelectAll(TblResultinfo resultinfo);

    @SpringBootApplication
    class Boot2msaApplication {

        public static void main(String[] args) {
            SpringApplication.run(Boot2msaApplication.class, args);
        }
    }
}
