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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String getLastName() {
        return lastName;
    }



    public int getAge() {
        return age;
    }



}
