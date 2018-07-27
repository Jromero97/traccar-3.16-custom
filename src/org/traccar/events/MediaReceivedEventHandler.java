package org.traccar.events;

import java.util.Collections;
import java.util.Map;

import org.traccar.BaseEventHandler;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class MediaReceivedEventHandler extends BaseEventHandler {

    @Override
    protected Map<Event, Position> analyzePosition(Position position) {
        Object mediaImageFile = position.getAttributes().get(Position.KEY_IMAGE);
        Object mediaAudioFile = position.getAttributes().get(Position.KEY_AUDIO);

        if (mediaImageFile != null) {
            Event event = new Event(Event.TYPE_MEDIA_RECEIVED, position.getDeviceId(), position.getId());
            event.set(Position.KEY_IMAGE, (String) mediaImageFile);
            return Collections.singletonMap(event, position);
        }

        if (mediaAudioFile != null) {
            Event event = new Event(Event.TYPE_MEDIA_RECEIVED, position.getDeviceId(), position.getId());
            event.set(Position.KEY_AUDIO, (String) mediaAudioFile);
            return Collections.singletonMap(event, position);
        }
        return null;
    }
}
