package zhy2002.sba2.atomic.provider;

/**
 * Provider of a constant.
 */
public class ConstantValueProvider<T> implements ValueProvider<T> {

    private T value;

    public ConstantValueProvider(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return this.value;
    }
}
