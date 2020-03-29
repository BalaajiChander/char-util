package org.charr.util;

import org.charr.util.fixture.EmployeeFixture;
import org.charr.util.utility.CharUtility;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CharUtility charUtility = new CharUtility();
        System.out.println(charUtility.getEmployeeWithMaxLengthAcrossData(EmployeeFixture.employees).getFirstName());
        System.out.println(charUtility.getEmployeeWithMinLengthAcrossData(EmployeeFixture.employees).getFirstName());
        charUtility.getListOfEmployeeWithMoreThan30Characters(EmployeeFixture.employees).stream().forEach(employee -> System.out.println(employee.getFirstName()));
        System.out.println(charUtility.getMaxLengthAcrossData(EmployeeFixture.employees));
        System.out.println(charUtility.getMinLengthAcrossData(EmployeeFixture.employees));

    }
}
