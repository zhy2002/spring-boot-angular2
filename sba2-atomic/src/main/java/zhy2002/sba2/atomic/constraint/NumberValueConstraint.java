package zhy2002.sba2.atomic.constraint;

import java.math.BigDecimal;

/**
 * Base constraint for Number.
 */
public abstract class NumberValueConstraint implements AtomicValueConstraint<BigDecimal> {

    public abstract AtomicValueConstraintError validate(BigDecimal value);
}
