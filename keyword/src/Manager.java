import javax.annotation.Resource;

/**
 * @description: Manager
 * @author: lin
 * @create: 2019/03/08 11:59
 */
public final class Manager extends Employee {
    private double bonus = 1;

    @Resource
    service service;


    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    public double getSalary() {
//        System.out.println(service.randomInt());
        return super.getSalary() + bonus;
    }
}
