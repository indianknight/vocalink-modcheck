package org.satsom.moduluscheck.spi;

/**
 * ExceptionHandler interface provides contract to handle Vocalink Modulus Check Exceptions 
 * ModulusWeight data provided by Vocalink contains range of sortcode and applicable exceptions 
 * starting from 1 till 14. 
 * 
 * @author skushwaha
 *
 */
public interface ExceptionHandler {
	
	/**
	 * Handles Exception and returns the outcome as true or false when this sortcode 
	 * is valid for this accountNumber.
	 * 
	 * @param sortcode
	 * @param accountNumber
	 * @param checkSum
	 * @return
	 */
	boolean handleException(String sortcode, String accountNumber, long checkSum);
}
