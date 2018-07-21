package com.xunhe.boot2msa.po;

public class TblResultinfo {
    private String result_id;
    private String create_date;
    private String case_id;
    private String project_period_id;
    private String job_period_id;
    private String job_type;
    private String job_content;
    private String job_lasts;
    private String user_name;

    public String getResult_id() {
        return result_id;
    }

    public void setResult_id(String result_id) {
        this.result_id = result_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getProject_period_id() {
        return project_period_id;
    }

    public void setProject_period_id(String project_period_id) {
        this.project_period_id = project_period_id;
    }

    public String getJob_period_id() {
        return job_period_id;
    }

    public void setJob_period_id(String job_period_id) {
        this.job_period_id = job_period_id;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getJob_content() {
        return job_content;
    }

    public void setJob_content(String job_content) {
        this.job_content = job_content;
    }

    public String getJob_lasts() {
        return job_lasts;
    }

    public void setJob_lasts(String job_lasts) {
        this.job_lasts = job_lasts;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public TblResultinfo() {
    }

    public TblResultinfo(String create_date, String case_id, String project_period_id, String job_period_id, String job_type, String job_content, String job_lasts, String user_name) {
        this.create_date = create_date;
        this.case_id = case_id;
        this.project_period_id = project_period_id;
        this.job_period_id = job_period_id;
        this.job_type = job_type;
        this.job_content = job_content;
        this.job_lasts = job_lasts;
        this.user_name = user_name;
    }

    public TblResultinfo(String result_id, String create_date, String case_id, String project_period_id, String job_period_id, String job_type, String job_content, String job_lasts, String user_name) {
        this.result_id = result_id;
        this.create_date = create_date;
        this.case_id = case_id;
        this.project_period_id = project_period_id;
        this.job_period_id = job_period_id;
        this.job_type = job_type;
        this.job_content = job_content;
        this.job_lasts = job_lasts;
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "TblResultinfo{" +
                "result_id='" + result_id + '\'' +
                ", create_date='" + create_date + '\'' +
                ", case_id='" + case_id + '\'' +
                ", project_period_id='" + project_period_id + '\'' +
                ", job_period_id='" + job_period_id + '\'' +
                ", job_type='" + job_type + '\'' +
                ", job_content='" + job_content + '\'' +
                ", job_lasts='" + job_lasts + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
