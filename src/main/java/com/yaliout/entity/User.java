package com.yaliout.entity;

/**
 * @author Hu JunJie
 * @date 2020/10/26 16:36
 * @since
 */
public class User
{
    private Long id;

    private String code;

    private String name;

    private String sex;

    private String weChat;

    private String phoneNumber;

    public void setId(Long id)
    {
        this.id = id;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public void setWeChat(String weChat)
    {
        this.weChat = weChat;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
