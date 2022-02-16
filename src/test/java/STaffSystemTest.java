import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class STaffSystemTest {

    StaffSystem staff;
    Employee employee;
    @BeforeEach
    public void personalSystemetTest() {

        staff = new StaffSystem();
        employee = new Employee();
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
        Employee employee1 = new Employee("Nils", "Ericsson", 47, 6000);
        staff.addEmployee(employee1);
        Employee employee2 = new Employee("Tobias", "Gustafson", 50, 5000);
        staff.addEmployee(employee2);
        Employee employee3 = new Employee("Anders", "Andersson", 22, 3000);
        staff.addEmployee(employee3);
        Employee employee4 = new Employee("Mia", "Johansson", 28, 4000);
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
        Employee employee1 = new Employee("Nils", "Ericsson", 47, 6000);
        staff.addEmployee(employee1);
        Employee employee2 = new Employee("Tobias", "Gustafson", 50, 5000);
        staff.addEmployee(employee2);
        Employee employee3 = new Employee("Anders", "Andersson", 22, 3000);
        staff.addEmployee(employee3);
        Employee employee4 = new Employee("Mia", "Johansson", 28, 4000);
        staff.addEmployee(employee4);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;
        staff.clearEmployeesList();

        assertTrue(employeeArrayListTest.isEmpty());


    }
    @Test
    void increaseEmployeesSalariesTest() {
        Employee employee1 = new Employee("Nils", "Ericsson", 47, 6000);
        staff.addEmployee(employee1);
        Employee employee2 = new Employee("Tobias", "Gustafson", 50, 5000);
        staff.addEmployee(employee2);
        Employee employee3 = new Employee("Anders", "Andersson", 22, 3000);
        staff.addEmployee(employee3);
        Employee employee4 = new Employee("Mia", "Johansson", 28, 4000);
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


}
