package Service;

import Data.Employee;
import Data.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class EmployeeManagmentServiceTest {

    @org.junit.jupiter.api.Test
    void filterByType() {
        List<Employee> employeesToTest= new ArrayList<>();
        Employee employee1 = new Employee(3214,"Max","Mustermann", LocalDate.of(1988,10,10), Type.SALES,LocalDate.of(2022,01,01));
        Employee employee2 = new Employee(3214,"adi","Mustermann", LocalDate.of(1988,10,10), Type.TECHNICIAN,LocalDate.of(2009,01,01));
        Employee employee3 = new Employee(3214,"maxi","Mustermann", LocalDate.of(1988,10,10), Type.TECHNICIAN   ,LocalDate.of(2009,01,01));
        Employee employee4 = new Employee(3214,"fratzi","Mustermann", LocalDate.of(1986,9,12), Type.SALES,LocalDate.of(2022,01,01));

        employeesToTest.add(employee1);
        employeesToTest.add(employee2);
        employeesToTest.add(employee3);
        employeesToTest.add(employee4);

        EmployeeManagmentService serviceToTest = new EmployeeManagmentService();
        List<Employee> employeesAfterTest= new ArrayList<>();
        employeesAfterTest.add(employee1);
        employeesAfterTest.add(employee4);

        Assertions.assertEquals(serviceToTest.filterByType(employeesToTest,Type.SALES),employeesAfterTest);

    }



    @Test
    void filterByYear() {
    }

    @Test
    void birthDayToday() {
        List<Employee> employeesToTest= new ArrayList<>();
        Employee employee1 = new Employee(3214,"Max","Mustermann", LocalDate.of(1988,10,10), Type.SALES,LocalDate.of(2022,01,01));
        Employee employee2 = new Employee(3214,"adi","Mustermann", LocalDate.of(1988,10,10), Type.TECHNICIAN,LocalDate.of(2009,01,01));
        Employee employee3 = new Employee(3214,"maxi","Mustermann", LocalDate.of(1988,10,10), Type.TECHNICIAN   ,LocalDate.of(2009,01,01));
        Employee employee4 = new Employee(3214,"fratzi","Mustermann", LocalDate.of(1986,9,12), Type.SALES,LocalDate.of(2022,01,01));

        employeesToTest.add(employee1);
        employeesToTest.add(employee2);
        employeesToTest.add(employee3);
        employeesToTest.add(employee4);
        EmployeeManagmentService serviceToTest = new EmployeeManagmentService();
        List<Employee> employeesAfterTest= new ArrayList<>();
        employeesAfterTest.add(employee4);

        Assertions.assertEquals(serviceToTest.birthDayToday(employeesToTest),employeesAfterTest);


    }

    @Test
    void youngerThan() {
    }
}