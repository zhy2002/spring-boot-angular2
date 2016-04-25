package zhy2002.sba2.atomic.serializer;


/**
 * Serialize and deserialize an atomic value.
 */
public interface AtomicValueSerializer<T> {
    T deserialize(String str);
    String serialize(T str);
}
