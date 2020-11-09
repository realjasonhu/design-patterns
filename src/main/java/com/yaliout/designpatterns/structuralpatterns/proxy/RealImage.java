package com.yaliout.designpatterns.structuralpatterns.proxy;

/**
 * @author Hu JunJie
 * @date 2020/11/9 9:55
 * @since
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }
}
