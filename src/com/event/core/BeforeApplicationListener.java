package com.event.core;

/**
 * 自定义处理事件
 */
public class BeforeApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(EventObject event) {
        System.out.println("before listener:" + event.getSource());
    }
}
