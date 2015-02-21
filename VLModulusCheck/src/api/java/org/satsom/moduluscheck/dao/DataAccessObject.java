package org.satsom.moduluscheck.dao;

import java.io.Serializable;

import org.satsom.moduluscheck.domain.Entity;
import org.satsom.moduluscheck.spi.DataAccessException;

/**
 * Base marker interface for all Data Access Objects (DAO). The data access
 * object is used to locate an entity object from the repository where this DAO
 * points to.
 *
 * @see org.satsom.moduluscheck.domain.Entity
 * @author skushwaha
 */
public interface DataAccessObject {

    /**
     * Locates and loads the entity from the repository. The implementation can
     * return null if the entity was deleted before this method is called.
     *
     * @param entityClass
     *            the class type of the entity to be loaded
     * @param entityKey
     *            the key of the entity to be loaded
     * @return the entity, or null if it does not exist
     */
    <T extends Entity> T findByEntityKey(Class<T> entityClass, Serializable entityKey);


    /**
     * Locates and loads the entity from the repository. The implementation can
     * return null if the entity was deleted before this method is called.
     *
     * @param entityClass
     *            the class type of the entity to be loaded
     * @param entityName
     *            the name of the entity to be loaded
     * @param entityKey
     *            the key of the entity to be loaded
     * @return the entity, or null if it does not exist
     */

    <T extends Entity> T findByEntityKey(Class<T> entityClass, String entityName, Serializable entityKey);
    

    /**
     * Creates the provided Entity and then synchronizes all changes to
     * attached/cached Entities with underlying persistent source, except
     * for the other Entities where only their DataDictionary attributes
     * were changed.
     * This method does not clear any Entities from the cache.
     *
     * @param entity
     *            the entity to create
     * @return the entity key, the primary key of the newly created entity
     *
     * @throws org.satsom.moduluscheck.spi.DataAccessException
     *             if any error occurs while trying to load the entity
     */
    Serializable create(Entity entity) throws DataAccessException;

    /**
     * Updates the provided Entity and then synchronizes all changes to
     * attached/cached Entities with underlying persistent source, except
     * for the other Entities where only their DataDictionary attributes
     * were changed.
     * This method does not clear any Entities from the cache.
     *
     * @param entity
     *            the entity to update
     *
     * @throws org.satsom.moduluscheck.spi.DataAccessException
     *             if any error occurs while trying to load the entity
     */
    void update(Entity entity) throws DataAccessException;

    /**
     * Updates the provided Entity and then synchronizes all changes to
     * attached/cached Entities with underlying persistent source, except
     * for the other Entities where only their DataDictionary attributes
     * were changed.
     * This method does not clear any Entities from the cache.
     * 
     * @param entity the entity to update
     * @param entityName the entity name
     * @throws DataAccessException if any error occurs while trying to load the entity
     */
    void update(Entity entity, String entityName) throws DataAccessException;

    /**
     * Physically or logically deletes the provided Entity and then synchronizes
     * all changes to attached/cached Entities with underlying persistent source,
     * except for the other Entities where only their DataDictionary attributes
     * were changed.
     * This method does not clear any Entities from the cache.
     *
     * If the given entity implements logically deleteable, it is only logically
     * deleted in the database. In this case, it is simply updated.
     *
     * @param entity
     *            the entity to (logically) delete
     *
     * @throws org.satsom.moduluscheck.spi.DataAccessException
     *             if any error occurs while trying to load the entity
     */
    int delete(Entity entity) throws DataAccessException;

    /**
     * Creates an entity in the repository and synchronizes the cached state to
     * the DBMS the cache is not cleared.
     * 
     * @param entity the entity
     * @param entityName the entity mapping's name
     * @return the entity identifier key
     * @throws org.satsom.moduluscheck.spi.DataAccessException
     *             if any error occurs while trying to load the entity
     */
    Serializable create(Entity entity, String entityName);
}
