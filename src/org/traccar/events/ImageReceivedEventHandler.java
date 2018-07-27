package org.traccar.events;

import java.util.Collections;
import java.util.Map;

import org.traccar.BaseEventHandler;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ImageReceivedEventHandler extends BaseEventHandler {

    @Override
    protected Map<Event, Position> analyzePosition(Position position) {
        Object imageReceived = position.getAttributes().get(Position.KEY_IMAGE);

        if (imageReceived != null) {
            Event event = new Event(Event.TYPE_IMAGE_RECEIVED, position.getDeviceId(), position.getId());
            event.set(Position.KEY_IMAGE, (String) imageReceived);
            return Collections.singletonMap(event, position);
        }
        return null;
    }
}
