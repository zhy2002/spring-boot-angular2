package zhy2002.sba2.atomic;

import zhy2002.sba2.atomic.constraint.TextValueConstraint;
import zhy2002.sba2.atomic.serializer.TextValueSerializer;

import java.util.ArrayList;
import java.util.List;

/**
 * Text atomic type.
 */
public class TextAtomicType extends AtomicType<String> {

    public TextAtomicType(TextValueSerializer serializer) {
        this(serializer, new ArrayList<>());
    }
    public TextAtomicType(TextValueSerializer serializer, List<? extends TextValueConstraint> constraints) {
        super(serializer, constraints);
    }

    @Override
    public Class<String> getJavaClass() {
        return String.class;
    }
}