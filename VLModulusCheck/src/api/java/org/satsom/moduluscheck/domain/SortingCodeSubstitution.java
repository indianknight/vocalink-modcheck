package org.satsom.moduluscheck.domain;


public class SortingCodeSubstitution extends EntityAdapter {

	/** original sort code */
    private Long originalSortCode;

    /** substituted sort code */
    private Long substituteSortCode;

    /**
     * Gets the originalSortCode.
     * 
     * @return Returns the originalSortCode.
     */
    public Long getOriginalSortCode() {
        return originalSortCode;
    }

    /**
     *  Sets the originalSortCode.
     * 
     *  @param originalSortCode The originalSortCode to set.
     */
    public void setOriginalSortCode(Long originalSortCode) {
        this.originalSortCode = originalSortCode;
    }

    /**
     * Gets the substituteSortCode.
     * 
     * @return Returns the substituteSortCode.
     */
    public Long getSubstituteSortCode() {
        return substituteSortCode;
    }

    /**
     *  Sets the substituteSortCode.
     * 
     *  @param substituteSortCode The substituteSortCode to set.
     */
    public void setSubstituteSortCode(Long substituteSortCode) {
        this.substituteSortCode = substituteSortCode;
    }

	@Override
	public boolean equalsEntity(Entity other) {
		// TODO Auto-generated method stub
		return false;
	}
}
