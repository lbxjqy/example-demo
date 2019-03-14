import java.time.LocalDate;
/**
 * @description: employee
 * @author: lin
 * @create: 2019/03/05 19:20
 */
public class Employee {
    private static int id = 0;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        id++;
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setNameL() {
        name = "bo";
    }
}
