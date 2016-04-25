package zhy2002.sba2.atomic;

import zhy2002.sba2.atomic.constraint.NumberValueConstraint;
import zhy2002.sba2.atomic.serializer.NumberValueSerializer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Number atomic type.
 */
public class NumberAtomicType extends AtomicType<BigDecimal> {

    public NumberAtomicType( NumberValueSerializer serializer) {
        this(serializer, new ArrayList<>());
    }

    public NumberAtomicType( NumberValueSerializer serializer, List<? extends NumberValueConstraint> constraints) {
        super(serializer, constraints);
    }

    @Override
    public Class<BigDecimal> getJavaClass() {
        return BigDecimal.class;
    }
}