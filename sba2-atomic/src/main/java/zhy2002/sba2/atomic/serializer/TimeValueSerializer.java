package zhy2002.sba2.atomic.serializer;

import java.time.LocalDateTime;

/**
 * Serializer for Time.
 */
public class TimeValueSerializer implements AtomicValueSerializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(String str) {
        return null;
    }

    @Override
    public String serialize(LocalDateTime str) {
        return null;
    }
}
