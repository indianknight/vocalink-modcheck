package org.satsom.moduluscheck.domain;

import java.io.Serializable;


/**
 * Base adapter class for all entities. Provides useful implementations. Some
 * implementations serve as default and can be overridden by subclassing
 * entities.
 *
 * @see org.satsom.moduluscheck.domain.Entity
 *
 * @author skushwaha
 */
public abstract class EntityAdapter implements Entity {

    /** Entity key. */
    protected Serializable entityKey;

    /**
     * (non-Javadoc).
     *
     * @see com.clear2pay.bph.opf.domain.Entity#getEntityKey()
     */
    public Serializable getEntityKey() {
        return entityKey;
    }

    /**
     * Sets the primary key identifier for this entity.
     *
     * @param entityKey
     *            the unique key for this entity, the serializable can be an
     *            instance of any type.
     */
    public void setEntityKey(Serializable entityKey) {
        this.entityKey = entityKey;
    }
}
