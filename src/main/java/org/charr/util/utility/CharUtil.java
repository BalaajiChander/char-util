package org.charr.util.utility;

import org.charr.util.model.Employee;

import java.util.List;

public interface CharUtil {

    /**
     * @param inputEmployees
     * @return
     */
    abstract List<Employee> getValidEmployees(final List<Employee> inputEmployees);

    /**
     * @param inputEmployees
     * @return
     */
    abstract List<Employee> getListOfEmployeeWithMoreThan30Characters(final List<Employee> inputEmployees);

    /**
     * @param inputEmployees
     * @return
     */
    abstract Employee getEmployeeWithMinLengthAcrossData(final List<Employee> inputEmployees);

    /**
     * @param inputEmployees
     * @return
     */
    abstract int getMinLengthAcrossData(final List<Employee> inputEmployees);

    /**
     * @param inputEmployees
     * @return
     */
    abstract Employee getEmployeeWithMaxLengthAcrossData(final List<Employee> inputEmployees);

    /**
     * @param inputEmployees
     * @return
     */
    abstract int getMaxLengthAcrossData(final List<Employee> inputEmployees);


    /**
     *
     * @param strings
     * @return
     */
    abstract List<String> getValidString(final List<String> strings);

    /**
     *
     * @param strings
     * @return
     */
    abstract List<String> getListOfStringWithMoreThan30Characters(final List<String> strings);

    /**
     *
     * @param strings
     * @return
     */
    abstract String getStringWithMinLengthAcrossData(final List<String> strings);

    /**
     *
     * @param strings
     * @return
     */
    abstract int getMinLengthAcrossStrings(final List<String> strings);

    /**
     *
     * @param strings
     * @return
     */
    abstract String getStringWithMaxLengthAcrossData(final List<String> strings);

    /**
     *
     * @param strings
     * @return
     */
    abstract int getMaxLengthAcrossStrings(final List<String> strings);
}
