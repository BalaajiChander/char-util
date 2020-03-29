package org.charr.util.fixture;

import org.charr.util.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFixture {

    public static List<Employee> employees = new ArrayList<>();

    static {
        Employee employee1 = new Employee();
        employee1.setFirstName("Dr. Name1");

        Employee employee2 = new Employee();
        employee2.setFirstName("Jr. Name2");

        Employee employee3 = new Employee();
        employee3.setFirstName("Sr. Name3");

        Employee employee4 = new Employee();
        employee4.setFirstName("Dr");

        Employee employee5 = new Employee();
        employee5.setFirstName("Jr.");

        Employee employee6 = new Employee();
        employee6.setFirstName("Sr.");

        Employee employee7 = new Employee();
        employee7.setFirstName("Rev.");

        Employee employee8 = new Employee();
        employee8.setFirstName("123");

        Employee employee9 = new Employee();
        employee9.setFirstName("456");

        Employee employee10 = new Employee();
        employee10.setFirstName("");

        Employee employee11 = new Employee();
        employee11.setFirstName("");

        Employee employee12 = new Employee();
        employee12.setFirstName(null);

        Employee employee13 = new Employee();
        employee13.setFirstName("1Name");


        Employee employee14 = new Employee();
        employee14.setFirstName("Name#@");


        Employee employee15 = new Employee();
        employee15.setFirstName("@#$%");

        Employee employee16 = new Employee();
        employee16.setFirstName(null);

        Employee employee17 = new Employee();
        employee17.setFirstName("   ");

        Employee employee18 = new Employee();
        employee18.setFirstName(" namewithmorethan30characterslength1 ");

        Employee employee19 = new Employee();
        employee19.setFirstName(" namewithmorethan30characterslength2 ");
    }

    /**
     * Auto generated default constructor stub
     */
    public EmployeeFixture() {
    }
}
