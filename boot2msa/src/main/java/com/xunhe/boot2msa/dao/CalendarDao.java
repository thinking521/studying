package com.xunhe.boot2msa.dao;

import com.xunhe.boot2msa.po.TblCalendar;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface CalendarDao {
    //isnert
    @Insert("insert into tblCalendar(title,content,ifOK,importance,finishDate) values(#{title},#{content},#{ifOK},#{importance},#{finishDate})")
    public int calendarInsert(TblCalendar tblCalendar);
    //delte
    @Delete("delete from tblCalendar where id = #{id}")
    public int calendarDelete(int id);
    //update
    @Update("update tblCalendar set title=#{title} where id =#{id}")
    public int calendarUpdate(TblCalendar tblCalendar);
//    //selectOne
//    @Select("select * from tblCalendar where title=#{title}")
//    public TblCalendar calendarSelectOne(TblCalendar tblCalendar);
    //selectOne
    @SelectProvider(type = CalendarDaoProvider.class, method = "calendarSelectOne")
    public TblCalendar calendarSelectOne(TblCalendar tblCalendar);
    class CalendarDaoProvider {
        public String calendarSelectOne(TblCalendar tblCalendar) {
            return new SQL(){{
//                SELECT("id,title,content,ifOK,importance");
                SELECT("*");
                FROM("tblCalendar");
                WHERE("1=1");
//                OR();
                AND();
                if(tblCalendar.getId()!=0){
                    WHERE("id = #{id}");
                }
//                OR();
                AND();
                if(tblCalendar.getTitle()!=null){
                    WHERE("title = #{title}");
                }
                WHERE("1=1");
                //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
            }}.toString();
        }
    }


    //selectAll
    @Select("select * from tblCalendar order by id desc limit #{np},#{size}")
    public List<TblCalendar> calendarSelectAll(@Param("np") int np, @Param("size") int size);
}
