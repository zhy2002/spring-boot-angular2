package zhy2002.sba2.atomic.constraint;

/**
 * Base constraint for ObjectId.
 */
public abstract class ObjectIdValueConstraint implements AtomicValueConstraint<Long> {
    @Override
    public abstract AtomicValueConstraintError validate(Long value);
}
