package com.xunhe.boot2msa.dao;

import com.xunhe.boot2msa.po.TblUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface UserinfoDao {
    @SelectProvider(type = UserinfoDaoProvider.class, method = "userinfoSelectAll")
    public List<TblUser> userinfoSelectAll(TblUser tblUser);
    class UserinfoDaoProvider {
        public String userinfoSelectAll(TblUser tblUser) {
            return new SQL(){{
                SELECT("*");
                FROM("TblUser");
                WHERE("1=1");
                if(tblUser.getId()!=null && tblUser.getId()!=""){
                    AND();
                    WHERE("id = #{id}");
                }
                if(tblUser.getPassword()!=null && tblUser.getPassword()!=""){
                    AND();
                    WHERE("password = #{password}");
                }
                AND();
                WHERE("1=1");
                //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
            }}.toString();
        }
    }
}

