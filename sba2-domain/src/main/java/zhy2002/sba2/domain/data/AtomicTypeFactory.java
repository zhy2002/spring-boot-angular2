package zhy2002.sba2.domain.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhy2002.sba2.atomic.AtomicType;

/**
 * A factory class used to get atomic types.
 */
public class AtomicTypeFactory {

    private final ApplicationContext atomicTypeContext;

    public AtomicTypeFactory() {
        atomicTypeContext = new ClassPathXmlApplicationContext("classpath:atomic-context.xml");
    }

    AtomicType<?> getAtomicType(String name) {
        return atomicTypeContext.getBean(name, AtomicType.class);
    }
}
