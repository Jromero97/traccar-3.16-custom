package org.traccar.events;

import java.util.Collections;
import java.util.Map;

import org.traccar.BaseEventHandler;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class AudioReceivedEventHandler extends BaseEventHandler {

    @Override
    protected Map<Event, Position> analyzePosition(Position position) {
        Object audioReceived = position.getAttributes().get(Position.KEY_AUDIO);

        if (audioReceived != null) {
            Event event = new Event(Event.TYPE_AUDIO_RECEIVED, position.getDeviceId(), position.getId());
            event.set(Position.KEY_AUDIO, (String) audioReceived);
            return Collections.singletonMap(event, position);
        }
        return null;
    }
}
