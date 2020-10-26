package com.yaliout.designpatterns;

import com.yaliout.designpatterns.creationalpatterns.factory.FactoryInterface;
import org.junit.jupiter.api.Test;

/**
 * @author Hu JunJie
 * @date 2020/10/26 19:36
 * @since
 */
public class FactoryTest {

    @Test
    public void test01() {
        FactoryInterface.getInstance("1");
    }
}
