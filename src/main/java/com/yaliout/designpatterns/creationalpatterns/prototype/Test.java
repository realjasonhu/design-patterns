package com.yaliout.designpatterns.creationalpatterns.prototype;

import com.yaliout.entity.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO {@link Object#clone()} 深拷贝与浅拷贝研究
 * Long,String,Date 作为对象的属性，并不是浅拷贝，体现在copy了一个对象后，并不会同步修改
 * List,Map 作为对象的属性，是浅拷贝
 *
 * @author Hu JunJie
 * @date 2020/10/27 14:55
 * @since
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, ParseException {
        CloneUser user0 = new CloneUser();
        List<Integer> intList = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
        user0.setIntList(intList);
        List<String> strList = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
        }};
        user0.setStrList(strList);

        User user = new User();
        user.setCode("1");
        user0.setUser(user);

        user0.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-02"));

        CloneUser user1 = (CloneUser) user0.clone();

        List<Integer> intList1 = user0.getIntList();
        intList1.add(4);
        user1.setIntList(intList1);

        System.out.println(user0.getIntList());
        System.out.println(user1.getIntList());

        List<String> strList1 = user0.getStrList();
        strList1.add("d");
        user0.setStrList(strList1);
        System.out.println(user0.getStrList());
        System.out.println(user1.getStrList());

        user0.getUser().setCode("2");

        System.out.println(user0.getUser().getCode());
        System.out.println(user1.getUser().getCode());

        user0.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));

        System.out.println(user0.getDate());
        System.out.println(user1.getDate());
    }
}
