package org.launchcode.hellospring.model.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.hellospring.model.Event;
import org.launchcode.hellospring.model.Tag;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}