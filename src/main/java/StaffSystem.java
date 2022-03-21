import java.util.ArrayList;

public class StaffSystem {
    public ArrayList<Employee> employeesArrayList = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        employeesArrayList.add(employee);

    }

    public void clearEmployeesList() {
        employeesArrayList.clear();
    }

    public void increaseEmployeesSalaries(double increasePercentage) {
        if (increasePercentage >= 0 && increasePercentage <= 1){
            for(int i = 0; i < employeesArrayList.size(); i++){
                double currentSalary = employeesArrayList.get(i).getMonthlySalary();
                employeesArrayList.get(i).setMonthlySalary (currentSalary + (currentSalary * increasePercentage));
            }
        }
    }

    public void increaseOneEmployeesSalary(int employeeCompanyId, double increasePercentage) {
        if (increasePercentage >= 0 && increasePercentage <= 1){
            for(int i = 0; i < employeesArrayList.size(); i++){
                if(employeesArrayList.get(i).getCompanyId() == employeeCompanyId ){
                    double currentSalary = employeesArrayList.get(i).getMonthlySalary();
                    employeesArrayList.get(i).setMonthlySalary (currentSalary + (currentSalary * increasePercentage));

                }
            }
        }
    }
}
