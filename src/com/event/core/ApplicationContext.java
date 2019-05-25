package com.event.core;

import java.util.HashSet;
import java.util.Set;

/**
 * 运行上下文环境
 */
public class ApplicationContext {
    /**
     * 所有监听器
     */
    private Set<ApplicationListener> listeners;

    public ApplicationContext() {
        this.listeners = new HashSet<>();
    }

    /**
     * 添加事件监听器
     * @param applicationListener
     */
    public void addApplicationListener(ApplicationListener applicationListener) {
        this.listeners.add(applicationListener);
    }

    /**
     * 给每个订阅了的监听器发布事件
     * @param event
     */
    public void publishEvent(EventObject event) {
        listeners.forEach( listener -> listener.onApplicationEvent(event));
    }
}
