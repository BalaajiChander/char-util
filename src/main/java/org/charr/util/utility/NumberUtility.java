package org.charr.util.utility;

import java.util.regex.Pattern;

public class NumberUtility implements NumberUtil {

    /**
     * Auto generated default constructor stub
     */
    public NumberUtility() {

    }

    /**
     * @param inputString
     * @return
     */
    @Override
    public boolean containsNumber(String inputString) {
        return Pattern.compile("[0-9]").matcher(inputString).find();
    }

    @Override
    public boolean containsNumberSequence(String inputString) {
        boolean hasNumberSequence = false;
        if (this.containsNumber(inputString)) {
           hasNumberSequence = true;
        }
        return hasNumberSequence;
    }
}
