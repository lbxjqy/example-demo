import java.time.LocalDate;

/**
 * @description: TestEmployee
 * @author: lin
 * @create: 2019/03/05 19:45
 */
public class TestEmployee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private final int age;
    private static int nextId = 0;

    public TestEmployee(String n, double s, int year, int month, int day, int age, int id) {
        nextId = id;
        this.age = age;
        name = name;
        salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public TestEmployee(String n, double s, LocalDate localDate,int age, int id) {
        nextId = id;
        this.age = age;
        name = name;
        salary = salary;
        hireDay = localDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int getAge() {
        return age;
    }

    public int getNextId() {
        return nextId;
    }
}
