package org.satsom.moduluscheck.dao;

import java.io.Serializable;
import java.util.Collection;

import org.satsom.moduluscheck.domain.ModulusWeight;
import org.satsom.moduluscheck.domain.SortingCodeSubstitution;

/**
 * 
 * @author skushwaha
 *
 */
public interface ModulusDataAccessObject extends DataAccessObject {
    /**
     * Creates a <code>ModulusWeight</code>.
     *
     * @param   modulus  the <code>ModulusWeight</code> entity object to create
     *
     * @return  key the primary key of the created <code>ModulusWeight</code>
     */
    Serializable create(ModulusWeight modulus);

    /**
     * Updates a <code>ModulusWeight</code>.
     *
     * @param  modulus  the <code>ModulusWeight</code> entity object to update
     */
    void update(ModulusWeight modulus);

    /**
     * Finds a <code>ModulusWeight</code> by its primary key.
     *
     * @param   modulusWeightKey  the primary key of the <code>ModulusWeight</code> to find
     *
     * @return  the <code>ModulusWeight</code> object identified by the primary key, or null if it does not exist
     */
    ModulusWeight findByModulusWeightKey(Serializable modulusWeightKey);

    /**
     * Fetches <code>ModulusWeight</code> s that satisfy the specified filter.
     *
     * @param   filter  an filter that has to be satisfied, if any
     * @param   pageSize    page size to return
     *
     * @return  The Collection of <code>ModulusWeight</code> s that satisfy the filter.
     */
    Collection<ModulusWeight> fetchModulusWeights(String filter, int pageSize);

    /**
     * Fetches a <code>SortingCodeSubstitution</code> by primary key.
     *
     * @param   sortingCodeSubstitutionKey  the primary key of the <code>SortingCodeSubstitution</code>
     *
     * @return  the <code>SortingCodeSubstitution</code> entity with the specified key or null if no such entity exists
     */
    SortingCodeSubstitution findBySortingCodeSubstitutionKey(Serializable sortingCodeSubstitutionKey);

    /**
     * Create a <code>SortingCodeSubstitution</code>.
     *
     * @param   paymentInstruction  the <code>SortingCodeSubstitution</code> object to create
     *
     * @return  the primary key of the created <code>SortingCodeSubstitution</code>
     */
    Serializable create(SortingCodeSubstitution sortingCodeSubstitution);

    /**
     * Updates a <code>SortingCodeSubstitution</code>.
     *
     * @param  sortingCodeSubstitution  the <code>SortingCodeSubstitution</code> entity object to update
     */
    void update(SortingCodeSubstitution sortingCodeSubstitution);

    /**
     * Fetches <code>SortingCodeSubstitution</code> s that satisfy the specified <code>Expression</code>.
     *
     * @param   filter  a filter that has to be satisfied, if any
     * @param   pageSize    page size to return
     *
     * @return  The Collection of <code>SortingCodeSubstitution</code> s that satisfy the filter
     */
    Collection<SortingCodeSubstitution> fetchSortingCodeSubstitutions(String filter, int pageSize);
}
