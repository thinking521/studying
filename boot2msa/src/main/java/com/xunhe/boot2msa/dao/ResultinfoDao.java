package com.xunhe.boot2msa.dao;

import com.xunhe.boot2msa.po.TblCalendar;
import com.xunhe.boot2msa.po.TblResultinfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface ResultinfoDao {
    // current date's data
    @Insert("insert into TblResultinfo(create_date,case_id,project_period_id,job_period_id,job_type,job_content,job_lasts,user_name) values(#{create_date},#{case_id},#{project_period_id},#{job_period_id},#{job_type},#{job_content},#{job_lasts},#{user_name})")
    public int insert(TblResultinfo resultinfo);

    @Update("update TblResultinfo set create_date=#{create_date},case_id=#{case_id},project_period_id=#{project_period_id},job_period_id=#{job_period_id},job_type=#{job_type},job_content=#{job_content},job_lasts=#{job_lasts},user_name=#{user_name} where result_id =#{result_id}")
    public int update(TblResultinfo resultinfo);

    @Delete("delete from TblResultinfo where result_id = #{result_id}")
    public int delete(TblResultinfo resultinfo);

    @Select("select * from TblResultinfo where create_date = #{create_date} and user_name = #{user_name}")
    public List<TblResultinfo> select(TblResultinfo resultinfo);

    @SelectProvider(type = ResultinfoDaoProvider.class, method = "resultinfoSelectAll")
    public List<TblResultinfo> resultinfoSelectAll(TblResultinfo tblResultinfo);
    class ResultinfoDaoProvider {
        public String resultinfoSelectAll(TblResultinfo tblResultinfo) {
            return new SQL(){{
                SELECT("*");
                FROM("TblResultinfo");
                WHERE("1=1");
                if(tblResultinfo.getCreate_date()!=null && tblResultinfo.getCreate_date()!=""){
                    AND();
                    WHERE("create_date = #{create_date}");
                }
                if(tblResultinfo.getCase_id()!=null && tblResultinfo.getCase_id()!=""){
                    AND();
                    WHERE("case_id = #{case_id}");
                }
                if(tblResultinfo.getUser_name()!=null && tblResultinfo.getUser_name()!=""){
                    AND();
                    WHERE("user_name = #{user_name}");
                }
                AND();
                WHERE("1=1");
                //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
            }}.toString();
        }
    }


}

