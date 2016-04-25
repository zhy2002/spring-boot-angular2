package zhy2002.sba2.atomic;

import zhy2002.sba2.atomic.constraint.ObjectIdValueConstraint;
import zhy2002.sba2.atomic.serializer.ObjectIdValueSerializer;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectId atomic type.
 */
public class ObjectIdAtomicType extends AtomicType<Long> {

    public ObjectIdAtomicType(ObjectIdValueSerializer serializer) {
        this(serializer, new ArrayList<>());
    }

    public ObjectIdAtomicType(ObjectIdValueSerializer serializer, List<? extends ObjectIdValueConstraint> constraints) {
        super(serializer, constraints);
    }

    @Override
    public Class<Long> getJavaClass() {
        return Long.class;
    }
}