package com.ddd.content.domain.event;

import java.util.EventListener;

public interface ContentEventListener extends EventListener {

    void contentAdd(ContentEvent event);
}
