public class Employee {
    String name;
    String lastName;
    int age;


    public Employee() {

    }

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(String nils, String ericsson, int i, int i1) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Nils";
    }



    public String getLastName() {
        return "Ericsson";
    }



    public int getAge() {
        return 47;
    }


    public int getCompanyId() {
        return 1;
    }

    public int getMonthlySalary() {
        return 6000;
    }
}
