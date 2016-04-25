package zhy2002.sba2.atomic.constraint;

/**
 * Validate if a value satisfies this constraint.
 */
public interface AtomicValueConstraint<T> {

    AtomicValueConstraintError validate(T value);
}
