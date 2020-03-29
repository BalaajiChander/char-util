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
}
