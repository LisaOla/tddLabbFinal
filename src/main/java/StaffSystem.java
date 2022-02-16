
public class StaffSystem {
    int autoIncrementId =0;

    public void addEmployee(Employee employee) {
        autoIncrementId++;
        employee.setCompanyId(autoIncrementId);
    }
}
