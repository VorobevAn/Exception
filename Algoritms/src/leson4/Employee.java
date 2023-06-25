package leson4;

// id, surname, age, salary,
//department
public class Employee {
    int id;
    String surname;
    int age;
    int salary;

    public Employee(int id, String surname, int age, int salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "vasa", 34, 30000);
        Employee e2 = new Employee(3, "Petia", 40, 15200);
        EmployeeTest em = new EmployeeTest();
        System.out.println(em.appSalary(e1.salary));
        System.out.println(em.appSalary(e2.salary));
    }

    int appSalary(int salary) {
        salary *= 2;
        return salary;
    }

}


