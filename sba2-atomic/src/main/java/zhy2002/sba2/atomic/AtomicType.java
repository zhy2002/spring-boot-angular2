package zhy2002.sba2.atomic;

import org.springframework.beans.factory.BeanNameAware;
import zhy2002.sba2.atomic.constraint.AtomicValueConstraint;
import zhy2002.sba2.atomic.constraint.AtomicValueConstraintError;
import zhy2002.sba2.atomic.serializer.AtomicValueSerializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Represents a class of simple values.
 * @param <T> the implementation Java type.
 */
public abstract class AtomicType<T> implements BeanNameAware {

    private String name;
    private final AtomicValueSerializer<T> serializer;
    private final List<AtomicValueConstraint<T>> constraints;

    public AtomicType(AtomicValueSerializer<T> serializer, List<? extends AtomicValueConstraint<T>> constraints) {
        this.serializer = serializer;
        this.constraints = Collections.unmodifiableList(constraints);
    }

    public String getName() {
        return name;
    }

    public void setBeanName(String name) {
        this.name = name;
    }

    public T deserialize(String str) {
        return this.serializer.deserialize(str);
    }

    public String serialize(T obj) {
        return this.serializer.serialize(obj);
    }

    public abstract Class<T> getJavaClass();

    public List<AtomicValueConstraintError> validate(T value) {
        List<AtomicValueConstraintError> errors = null;
        for(AtomicValueConstraint<T> constraint : this.constraints) {
            AtomicValueConstraintError error = constraint.validate(value);
            if(error != null) {
                if(errors == null) {
                    errors = new ArrayList<>();
                }
                errors.add(error);
            }
        }
        return errors;
    }

}
