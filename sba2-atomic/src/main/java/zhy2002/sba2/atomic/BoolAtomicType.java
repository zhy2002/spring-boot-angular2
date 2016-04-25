package zhy2002.sba2.atomic;
import zhy2002.sba2.atomic.constraint.BoolValueConstraint;
import zhy2002.sba2.atomic.serializer.BoolValueSerializer;

import java.util.ArrayList;
import java.util.List;

/**
 * Bool atomic type.
 */
public class BoolAtomicType extends AtomicType<Boolean> {

    public BoolAtomicType(BoolValueSerializer serializer) {
        this(serializer, new ArrayList<>());
    }

    public BoolAtomicType(BoolValueSerializer serializer, List<? extends BoolValueConstraint> constraints) {
        super(serializer, constraints);
    }

    @Override
    public Class<Boolean> getJavaClass() {
        return Boolean.class;
    }
}
