import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class STaffSystemTest {

    @Test
    void personalSystemetTest() {

        StaffSystem staff = new StaffSystem();

    }

    @Test
    void addEmployeeTest() {
        StaffSystem staff = new StaffSystem();
        Employee employee = new Employee();
        staff.addEmployee(employee);

    }
    @Test
    void addNewEmployeeTest() {
        StaffSystem staff = new StaffSystem();
        Employee employee = new Employee("Nils", "Ericsson", 47);
        staff.addEmployee(employee);
        assertTrue(employee.getName().equals("Nils"));
        assertTrue(employee.getLastName().equals("Ericsson"));
        assertEquals(47, employee.getAge());

    }

    @Test
    void setNameTest() {
        Employee employee = new Employee();
        employee.setName("Kalle");

    }

    @Test
    void getNameTest() {
        Employee employee = new Employee();
        employee.setName("Kalle");
        assertTrue(employee.getName().equals("Kalle"));

    }

    @Test
    void setAndGetAllEmployeeDetailsTest() {
        StaffSystem staff = new StaffSystem();
        Employee employee = new Employee("Nils", "Ericsson", 47, 6000);
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
        StaffSystem staff = new StaffSystem();
        Employee employee1 = new Employee("Nils", "Ericsson", 47, 6000);
        staff.addEmployee(employee1);
        Employee employee2 = new Employee("Tobias", "Gustafson", 50, 5000);
        staff.addEmployee(employee2);
        Employee employee3 = new Employee("Anders", "Andersson", 22, 3000);
        staff.addEmployee(employee3);
        Employee employee4 = new Employee("Mia", "Johansson", 28, 4000);
        staff.addEmployee(employee4);

        ArrayList<Employee> employeeArrayListTest = staff.employeesArrayList;

        assertEquals("Nils", employeeArrayListTest.get(0).getName());
        assertEquals("Gustafson", employeeArrayListTest.get(1).getLastName());
        assertEquals(22, employeeArrayListTest.get(2).getAge());
        assertEquals(4, employeeArrayListTest.get(3).getCompanyId());
        assertEquals(4000, employeeArrayListTest.get(3).getMonthlySalary());

    }


}
