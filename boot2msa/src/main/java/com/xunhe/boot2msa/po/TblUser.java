package com.xunhe.boot2msa.po;

public class TblUser {
    private String id;
    private String user_name;
    private String password;
    private String level;
    private String create_date;
    private String effective_flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEffective_flag() {
        return effective_flag;
    }

    public void setEffective_flag(String effective_flag) {
        this.effective_flag = effective_flag;
    }


    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public TblUser() {
    }

    public TblUser(String id, String user_name, String password, String level, String create_date, String effective_flag) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.level = level;
        this.create_date = create_date;
        this.effective_flag = effective_flag;
    }

    @Override
    public String toString() {
        return "TblUser{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", level='" + level + '\'' +
                ", create_date='" + create_date + '\'' +
                ", effective_flag='" + effective_flag + '\'' +
                '}';
    }
}