package com.yaliout.designpatterns.creationalpatterns.prototype;

import com.yaliout.entity.User;

import java.util.Date;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/10/27 14:49
 * @since
 */
public class CloneUser implements Cloneable {

    private String code;

    private List<String> strList;

    private List<Integer> intList;

    private User user;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
