package zhy2002.sba2.atomic.constraint;

/**
 * Base constraint for Bool.
 */
public abstract class BoolValueConstraint implements AtomicValueConstraint<Boolean> {

    public abstract AtomicValueConstraintError validate(Boolean value);
}
