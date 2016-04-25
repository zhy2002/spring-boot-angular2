package zhy2002.sba2.atomic.constraint;

import java.time.LocalDateTime;

/**
 * Base constraint for Time.
 */
public abstract class TimeValueConstraint implements AtomicValueConstraint<LocalDateTime> {

    public abstract AtomicValueConstraintError validate(LocalDateTime value);
}
