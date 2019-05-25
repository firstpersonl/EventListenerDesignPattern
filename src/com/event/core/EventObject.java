package com.event.core;

/**
 * 事件
 */
public class EventObject extends java.util.EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObject(Object source, EventEnum eventType) {
        super(source);
        this.eventType = eventType;
    }

    /**
     * 事件类型
     */
    private EventEnum eventType;

    public EventEnum getEventType() {
        return eventType;
    }
}
