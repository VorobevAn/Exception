package leson7;

public class Employee {
    protected int id;
    public String surname;
    int age;
    private int salary;

    private Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String surname, int age, int salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public void print(int id) {
        System.out.println(id);
    }

    public void print(String name) {
        System.out.println(name);
    }

    public void print(int salary, String in) {
        System.out.println(salary);
    }

    void  appSalary(Employee employee) {
        System.out.println(employee.salary+" "+employee.id);
    }
}


    class EmployeeTest {
        public static void main(String[] args) {
            Employee e1 = new Employee(2, "vasa", 34, 30000);
            Employee e2 = new Employee(3, "Petia", 40, 15200);
            leson4.Employee e3 = new leson4.Employee(4,"jfk",34,5000);
           // e2.print(e2.surname);
            e1.print(e2.getSalary());
           // e1.appSalary(e1);

        }



}

