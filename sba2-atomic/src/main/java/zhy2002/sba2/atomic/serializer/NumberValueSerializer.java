package zhy2002.sba2.atomic.serializer;

import java.math.BigDecimal;

/**
 * Serializer for Number.
 */
public class NumberValueSerializer  implements AtomicValueSerializer<BigDecimal> {
    @Override
    public BigDecimal deserialize(String str) {
        return null;
    }

    @Override
    public String serialize(BigDecimal str) {
        return null;
    }
}
