package com.yaliout.designpatterns.creationalpatterns.factory;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;
import java.util.Objects;

/**
 * @author Hu JunJie
 * @date 2020/10/26 19:06
 * @since
 */
public interface FactoryInterface {

    String getType();

    static FactoryInterface getInstance(String type) {
        Map<String, FactoryInterface> map = ContextUtil.getContext().getBeansOfType(FactoryInterface.class, false, false);
        for (Map.Entry<String, FactoryInterface> entry : map.entrySet()) {
            if (Objects.equals(type, entry.getValue().getType())) {
                return entry.getValue();
            }
        }
        return null;
    }

    class ContextUtil implements ApplicationContextAware {

        private static ApplicationContext context;

        public static ApplicationContext getContext() {
            return context;
        }

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            ContextUtil.context = applicationContext;
        }
    }
}
