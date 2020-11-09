package com.yaliout.designpatterns.structuralpatterns.proxy;

import java.util.Objects;

/**
 * @author Hu JunJie
 * @date 2020/11/9 9:58
 * @since
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if (Objects.isNull(realImage))
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
