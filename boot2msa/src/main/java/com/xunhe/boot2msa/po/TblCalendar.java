package com.xunhe.boot2msa.po;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class TblCalendar {
    //0定义字段111
    private int id;
    private String title;
    private String content;
    private int ifOK;
    private int importance;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date finishDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIfOK() {
        return ifOK;
    }

    public void setIfOK(int ifOK) {
        this.ifOK = ifOK;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public TblCalendar() {
    }

    public TblCalendar(String title, String content, int ifOK, int importance, Date finishDate) {
        this.title = title;
        this.content = content;
        this.ifOK = ifOK;
        this.importance = importance;
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "TblCalendar{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", ifOK=" + ifOK +
                ", importance=" + importance +
                ", finishDate=" + finishDate +
                '}';
    }
}
