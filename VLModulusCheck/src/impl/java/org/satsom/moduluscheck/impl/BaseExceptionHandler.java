package org.satsom.moduluscheck.impl;

import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.satsom.moduluscheck.spi.ExceptionHandler;
import org.satsom.moduluscheck.spi.ModulusCheckType;

/**
 * The base or default ExceptionHandler implementation that cannot be initialized 
 * and doesn't handles any particular Exceptions but provides behaviors common for 
 * ExceptionHandler(s).
 * 
 * @author skushwaha
 *
 */
public abstract class BaseExceptionHandler implements ExceptionHandler {

	/**
     * Apply given weights for the combination of sortcode plus accountnumber with the
     * index of ModulusWeight (in case of multiple sortcode range found)
     * @param accSortCode
     * @param weights 
     * @param index
     * @return
     */
    protected long applyWeight(String accSortCode, int[] weights, int index) {
        long sum = 0;
        int c = 0;
        String appendSum = StringUtils.EMPTY;
        //ModulusWeight dto = modulusWeights.get(index);
        for (int i = 0; i < accSortCode.length(); i++) {
            c = CharUtils.toIntValue(accSortCode.charAt(i));
/*            if (!ModulusCheckType.DBLAL.equals(dto.getModCheckType())) {
                sum += weights[i] * c;
            } else {
                appendSum += weights[i] * c;
            }
*/        }
        if (!StringUtils.isEmpty(appendSum)) {
            for (int i = 0; i < appendSum.length(); i++) {
                c = CharUtils.toIntValue(appendSum.charAt(i));
                sum += c;
            }
        }
        return sum;
    }
}
