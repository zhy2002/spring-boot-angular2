package zhy2002.sba2.atomic;

import zhy2002.sba2.atomic.constraint.TimeValueConstraint;
import zhy2002.sba2.atomic.serializer.TimeValueSerializer;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Time atomic type.
 */
public class TimeAtomicType extends AtomicType<LocalDateTime> {

    public TimeAtomicType(TimeValueSerializer serializer) {
        this(serializer, new ArrayList<>());
    }
    public TimeAtomicType(TimeValueSerializer serializer, List<? extends TimeValueConstraint> constraints) {
        super(serializer, constraints);
    }

    @Override
    public Class<LocalDateTime> getJavaClass() {
        return LocalDateTime.class;
    }
}