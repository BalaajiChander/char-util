package org.charr.util;

import org.charr.util.fixture.EmployeeFixture;
import org.charr.util.utility.CharUtility;

import java.util.ArrayList;
import java.util.List;

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


        System.out.println("###########################################################");
        System.out.println("########################### STRINGS   #####################");
        System.out.println("###########################################################");

        List<String> strings = new ArrayList<>();
        strings.add("Dr. DrName");
        strings.add("Jr. JrName");
        strings.add("Sr. SrName");
        strings.add("Rev. RevName");
        strings.add("Dr. ");
        strings.add("Jr. ");
        strings.add("Sr. ");
        strings.add("Rev.");
        strings.add("Namewith9 ");
        strings.add("9startswith ");
        strings.add("");
        strings.add(null);
        strings.add(" leadingspacename");
        strings.add("trailingSpace ");
        strings.add(" leadingAndTralingSpace ");
        strings.add("ab");
        strings.add("itsmorethanthritycharactereslength1");
        strings.add("itsmorethanthritycharactereslenght2");

        System.out.println( "List of Strings more than 30 char : " + charUtility.getListOfStringWithMoreThan30Characters(strings));
        System.out.println("String with min length : " + charUtility.getStringWithMinLengthAcrossData(strings) + ", wiht length " + charUtility.getMinLengthAcrossStrings(strings));
        System.out.println("String with max length : " + charUtility.getStringWithMaxLengthAcrossData(strings) + ", wiht length " + charUtility.getMaxLengthAcrossStrings(strings));


    }
}
