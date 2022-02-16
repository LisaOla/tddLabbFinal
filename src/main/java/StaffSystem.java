import java.util.ArrayList;

public class StaffSystem {
    public ArrayList<Employee> employeesArrayList = new ArrayList<Employee>();
    int autoIncrementId =0;

    public void addEmployee(Employee employee) {
        autoIncrementId++;
        employee.setCompanyId(autoIncrementId);
        employeesArrayList.add(employee);



    }
}
