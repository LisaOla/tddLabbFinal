import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class StaffSystemTest {

    StaffSystem staff;
    Employee employee;
    Employee employee1;
    Employee employee2;
    Employee employee3;
    Employee employee4;
    @BeforeEach
    public void personalSystemetTest() {

        staff = new StaffSystem();
        employee = new Employee();
        employee1 = new Employee("Nils", "Ericsson", 47, 6000);
        employee2 = new Employee("Tobias", "Gustafson", 50, 5000);
        employee3 = new Employee("Anders", "Andersson", 22, 3000);
        employee4 = new Employee("Mia", "Johansson", 28, 4000);
    }

    @Test
    void addEmployeeTest() {
        staff.addEmployee(employee);
    }

    @Test
    void addNewEmployeeTest() {
        employee = new Employee("Nils", "Ericsson", 47);
        staff.addEmployee(employee);
        assertTrue(employee.getName().equals("Nils"));
        assertTrue(employee.getLastName().equals("Ericsson"));
        assertEquals(47, employee.getAge());

    }

    @Test
    void setNameTest() {
        employee.setName("Kalle");
    }

    @Test
    void getNameTest() {
        employee.setName("Kalle");
        assertTrue(employee.getName().equals("Kalle"));
    }

    @Test
    void setlastNameTest() {
        employee.setLastName("Andersson");
    }

    @Test
    void setAndGetAllEmployeeDetailsTest() {
        employee = new Employee("Nils", "Ericsson", 47, 6000);
        // Ett företags-ID skall genereras automatiskt när en anställd skapas i systemet.
        staff.addEmployee(employee);

        assertTrue(employee.getName().equals("Nils"));
        assertTrue(employee.getLastName().equals("Ericsson"));
        assertEquals(47, employee.getAge());
        assertEquals(1, employee.getCompanyId());
        assertEquals(6000, employee.getMonthlySalary());
    }

    @Test
    void addEmloyeestoList() {
        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        staff.addEmployee(employee3);
        staff.addEmployee(employee4);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;

        assertAll("employee name",
             () -> assertEquals("Nils", employeeArrayListTest.get(0).getName()),
             () -> assertEquals("Gustafson", employeeArrayListTest.get(1).getLastName()),
             ()->  assertEquals(22, employeeArrayListTest.get(2).getAge()),
             ()->  assertEquals(4, employeeArrayListTest.get(3).getCompanyId()),
             ()->  assertEquals(4000, employeeArrayListTest.get(3).getMonthlySalary())
        );


    }
    @Test
    void clearEmployeesList() {
        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        staff.addEmployee(employee3);
        staff.addEmployee(employee4);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;
        staff.clearEmployeesList();

        assertTrue(employeeArrayListTest.isEmpty());


    }
    @Test
    void increaseEmployeesSalariesTest() {
        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        staff.addEmployee(employee3);
        staff.addEmployee(employee4);

        double increasePercentage = 1;
        staff.increaseEmployeesSalaries(increasePercentage);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;
        assertAll("employee salary",
                ()-> assertTrue(increasePercentage <= 1 && increasePercentage >= 0 , "Increase  percentage should be between  0% to 100%"),
                () -> assertEquals(6000 + ( 6000 * increasePercentage) , employeeArrayListTest.get(0).getMonthlySalary()),
                () -> assertEquals(5000 + ( 5000 * increasePercentage) , employeeArrayListTest.get(1).getMonthlySalary()),
                ()->  assertEquals(3000 + ( 3000 * increasePercentage) , employeeArrayListTest.get(2).getMonthlySalary()),
                ()->  assertEquals(4000 + ( 4000 * increasePercentage) , employeeArrayListTest.get(3).getMonthlySalary())

        );

    }


    @Test
    void increaseOneEmployeeSalaryTest() {
        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        staff.addEmployee(employee3);
        staff.addEmployee(employee4);

        double increasePercentage = 0.05;
        int employeeCompanyId = 3;
        staff.increaseOneEmployeesSalary(employeeCompanyId, increasePercentage);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;
        assertAll("employee salary",
                ()-> assertTrue(increasePercentage <= 1 && increasePercentage >= 0 , "Increase  percentage should be between  0% to 100%"),
                () -> assertEquals(3000 + ( 3000 * increasePercentage) , employeeArrayListTest.get(2).getMonthlySalary())
        );

    }

}
