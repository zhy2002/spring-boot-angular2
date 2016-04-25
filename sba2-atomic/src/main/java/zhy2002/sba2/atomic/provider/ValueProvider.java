package zhy2002.sba2.atomic.provider;

/**
 * An interface that decouples a value and the value obtaining logic.
 */
public interface ValueProvider<T> {
    T getValue();
}
