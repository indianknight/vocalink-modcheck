package org.satsom.moduluscheck.domain;

import java.io.Serializable;

/**
 * Marker interface for all entities in the system. Provides common methods that
 * span and must be implemented by all the entities in the system. 
 * 
 * @author skushwaha
 */
public interface Entity extends Serializable{

    /**
     * Returns the primary key identifier for this entity. All entities can be
     * uniquely identified using this key. This key should be used for all
     * variations of entity keys e.g. composite keys, surrogate keys etc.. This
     * is also a database sepcific key(a sequence) and may represent the unique
     * key in the database.
     *
     * @return the unique key for this entity, the serializable can be an
     *         instance of any type.
     */
    Serializable getEntityKey();

    /**
     * Returns true if both entities are same. This deviates from the equals
     * method, in that it first checks for their entity keys. If entity keys for
     * this and other entity are available, they are first compared for
     * equality.
     *
     * @param other
     *            other entity to compare to
     * @return true if passed entity and this entity are same, false otherwise
     */
    boolean equalsEntity(Entity other);
}