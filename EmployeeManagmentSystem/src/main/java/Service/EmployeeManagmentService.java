package Service;

import Data.Employee;
import Data.Type;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagmentService {

    public List<Employee> filterByType(List<Employee> employees, Type type){
        return employees.stream()
                .filter(employee -> employee.type().equals(type))
                .collect(Collectors.toList());
    }

    public List<Employee> filterByYear(List<Employee> employees,int yearsOfWork){
        return employees.stream()
                .filter(employee -> (LocalDate.now().getYear()-employee.entryDate().getYear())==yearsOfWork)
                .collect(Collectors.toList());
    }
    public List<Employee> birthDayToday(List<Employee> employees){
        Month month = LocalDate.now().getMonth();
        int day = LocalDate.now().getDayOfMonth();
        return employees.stream()
                .filter(employee -> employee.birthDate().getMonth().equals(month)&&employee.birthDate().getDayOfMonth()==day)
                .collect(Collectors.toList());
    }

    public List<Employee> youngerThan(List<Employee> employees,int year){
        return employees.stream()
                .filter(employee -> LocalDate.now().getYear()-employee.birthDate().getYear()<=year)
                .collect(Collectors.toList());
    }
}
