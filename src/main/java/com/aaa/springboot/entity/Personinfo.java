package com.aaa.springboot.entity;

public class Personinfo {
    private  String personname;
    private Integer personage;
    private String personaddress;

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public Integer getPersonage() {
        return personage;
    }

    public void setPersonage(Integer personage) {
        this.personage = personage;
    }

    public String getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(String personaddress) {
        this.personaddress = personaddress;
    }

    @Override
    public String toString() {
        return "Personinfo{" +
                "personname='" + personname + '\'' +
                ", personage=" + personage +
                ", personaddress='" + personaddress + '\'' +
                '}';
    }
}
