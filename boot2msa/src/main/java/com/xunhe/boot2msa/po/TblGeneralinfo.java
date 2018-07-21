package com.xunhe.boot2msa.po;

public class TblGeneralinfo {
    private String type;
    private String typeno;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeno() {
        return typeno;
    }

    public void setTypeno(String typeno) {
        this.typeno = typeno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TblGeneralinfo() {
    }

    public TblGeneralinfo(String type, String typeno, String name) {
        this.type = type;
        this.typeno = typeno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TblGeneralinfo{" +
                "type='" + type + '\'' +
                ", typeno='" + typeno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
