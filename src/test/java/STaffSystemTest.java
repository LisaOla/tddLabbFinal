import org.junit.jupiter.api.Test;


public class STaffSystemTest {

    @Test
    void personalSystemetTest() {

        StaffSystem staff = new StaffSystem();

    }

    @Test
    void addEmployeeTest() {
        StaffSystem staff = new StaffSystem();
        Employee employee = new Employee();
        staff.add(employee);

    }

}
