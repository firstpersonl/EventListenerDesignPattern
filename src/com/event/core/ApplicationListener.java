package com.event.core;

import java.util.EventListener;

/**
 * 事件监听器
 */
public interface ApplicationListener extends EventListener {

    /**
     * 事件监听器处理事件
     * @param event
     */
    void onApplicationEvent(EventObject event);
}
