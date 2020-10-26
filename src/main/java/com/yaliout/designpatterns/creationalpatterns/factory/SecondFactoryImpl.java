package com.yaliout.designpatterns.creationalpatterns.factory;

import org.springframework.stereotype.Component;

/**
 * @author Hu JunJie
 * @date 2020/10/26 19:07
 * @since
 */
@Component
public class SecondFactoryImpl extends AbstractFactory {

    @Override
    public String getType() {
        return "2";
    }
}
