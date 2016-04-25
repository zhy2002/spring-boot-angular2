package zhy2002.sba2.atomic;

/**
 * A list of atomic values of the same atomic type.
 */
public class AtomicListType {

    private final AtomicType<?> atomicType;
    private final int minLength;
    private final int maxLength;
    private final boolean allowDuplicates;

    public AtomicListType(AtomicType<?> atomicType, int minLength, int maxLength, boolean allowDuplicates) {
        this.atomicType = atomicType;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.allowDuplicates = allowDuplicates;
    }

    public AtomicType<?> getAtomicType() {
        return atomicType;
    }

    public int getMinLength() {
        return minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean isAllowDuplicates() {
        return allowDuplicates;
    }
}
