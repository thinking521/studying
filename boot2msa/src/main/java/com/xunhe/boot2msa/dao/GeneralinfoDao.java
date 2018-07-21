package com.xunhe.boot2msa.dao;

import com.xunhe.boot2msa.po.TblGeneralinfo;
import com.xunhe.boot2msa.po.TblResultinfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface GeneralinfoDao {
    @Select("select * from tblgeneralInfo where type = #{type}")
    public List<TblGeneralinfo> selectTypeInfo(String type);
}

