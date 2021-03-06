public class Employee {
    String name;
    String lastName;
    int age;
    int companyId;
    private static int autoIncrementId = 0;
    double monthlySalary;


    public Employee() {

    }

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(String name, String lastName, int age, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.companyId = autoIncrementId + 1;
        this.monthlySalary = monthlySalary;
        ++autoIncrementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCompanyId() {
        return companyId;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
