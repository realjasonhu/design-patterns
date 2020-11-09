package com.yaliout.designpatterns.structuralpatterns.composite;

import com.yaliout.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hu JunJie
 * @date 2020/11/9 9:11
 * @since
 */
public class CompositeUser extends User {

    private List<CompositeUser> subUser;

    public CompositeUser(Long id,String code,String name) {
        setId(id);
        setCode(code);
        setName(name);
        this.subUser = new ArrayList<CompositeUser>();
    }

    public void add(CompositeUser user) {
        subUser.add(user);
    }

    public void remove(CompositeUser user) {
        subUser.remove(user);
    }

    @Override
    public String toString() {
        StringBuffer sb  = new StringBuffer("CompositeUser{subUser=");
        subUser.forEach(user -> sb.append("[id=" + user.getId() + ",code=" + user.getCode() + ",name=" + user.getName() + "]"));
        sb.append("}");
        return sb.toString();
    }
}
