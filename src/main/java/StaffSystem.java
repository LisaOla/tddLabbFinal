import java.util.ArrayList;

public class StaffSystem {
    public ArrayList<Employee> employeesArrayList = new ArrayList<Employee>();
    int autoIncrementId =0;

    public void addEmployee(Employee employee) {
        autoIncrementId++;
        employee.setCompanyId(autoIncrementId);
        employeesArrayList.add(employee);

    }

    public void clearEmployeesList() {
        employeesArrayList.clear();
    }

    public void increaseEmployeesSalaries(double increasePercentage) {
        if (increasePercentage > 0 && increasePercentage <= 100){
            for(int i = 0; i < employeesArrayList.size(); i++){
                double currentSalary = employeesArrayList.get(i).getMonthlySalary();
                employeesArrayList.get(i).setMonthlySalary (currentSalary + (currentSalary * increasePercentage));
            }
        }
    }
}
