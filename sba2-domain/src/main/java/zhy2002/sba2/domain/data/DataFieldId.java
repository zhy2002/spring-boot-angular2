package zhy2002.sba2.domain.data;

import javax.persistence.Embeddable;

/**
 * Created by ZHY on 26/04/2016.
 */
@Embeddable
public class DataFieldId {
    private Long id;
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}

