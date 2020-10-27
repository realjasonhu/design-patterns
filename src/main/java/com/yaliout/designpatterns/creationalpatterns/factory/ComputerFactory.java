package com.yaliout.designpatterns.creationalpatterns.factory;

/**
 * 工厂模式：
 * @author Hu JunJie
 * @date 2020/10/27 9:45
 * @since
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(ComputerFactory.getComputer("PC","1","2","3").toString());
    }
}
