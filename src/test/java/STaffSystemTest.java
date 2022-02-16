import org.junit.jupiter.api.Test;

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



}
