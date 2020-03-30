package org.charr.util.utility;

import org.charr.util.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CharUtility implements CharUtil {

    /**
     * Auto generated default constructor stub
     */
    public CharUtility() {
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public List<Employee> getValidEmployees(List<Employee> inputEmployees) {

        final Predicate<Employee> isNotNull = employee -> null != employee.getFirstName();
        final Predicate<Employee> isEmpty = employee -> employee.getFirstName().isEmpty();
        final Predicate<Employee> startsOrEndsWithEmpty = employee -> employee.getFirstName().startsWith(" ") && employee.getFirstName().endsWith(" ");
        final Predicate<Employee> startsWithDigit = employee -> Character.isDigit(employee.getFirstName().charAt(0));
        final Predicate<Employee> startsWithSpecialChar = employee -> Pattern.compile("(^\\p{Punct})").matcher(String.valueOf(employee.getFirstName().charAt(0))).find();
        final Predicate<Employee> isOnlyDigits = employee -> employee.getFirstName().matches("[0-9]+");

        return inputEmployees.stream()
                .filter(isNotNull)
                .filter(isEmpty.negate())
                .filter(startsOrEndsWithEmpty.negate())
                .filter(startsWithDigit.negate())
                .filter(isOnlyDigits.negate())
                .filter(startsWithSpecialChar.negate())
                .collect(Collectors.toList());
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public List<Employee> getListOfEmployeeWithMoreThan30Characters(List<Employee> inputEmployees) {
        return this.getValidEmployees(inputEmployees).stream().filter(employee -> employee.getFirstName().length() > 30).collect(Collectors.toList());
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public Employee getEmployeeWithMinLengthAcrossData(List<Employee> inputEmployees) {
        Optional<Employee> min = this.getValidEmployees(inputEmployees).stream().min(Comparator.comparing(employee -> employee.getFirstName().length()));
        return min.isPresent() ? min.get() : new Employee();
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public int getMinLengthAcrossData(List<Employee> inputEmployees) {
        return this.getEmployeeWithMinLengthAcrossData(inputEmployees).getFirstName().length();
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public Employee getEmployeeWithMaxLengthAcrossData(List<Employee> inputEmployees) {
        Optional<Employee> max = this.getValidEmployees(inputEmployees).stream().max(Comparator.comparing(employee -> employee.getFirstName().length()));
        return max.isPresent() ? max.get() : new Employee();
    }

    /**
     * @param inputEmployees
     * @return
     */
    @Override
    public int getMaxLengthAcrossData(List<Employee> inputEmployees) {
        return this.getEmployeeWithMaxLengthAcrossData(inputEmployees).getFirstName().length();
    }
}
