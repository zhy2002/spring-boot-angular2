package zhy2002.sba2.atomic.constraint;

/**
 * Base constraint for Text.
 */
public abstract class TextValueConstraint implements AtomicValueConstraint<String> {

    public abstract AtomicValueConstraintError validate(String value);
}
