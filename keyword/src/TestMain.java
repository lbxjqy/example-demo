import javax.xml.crypto.Data;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * @description: Main
 * @author: lin
 * @create: 2019/03/05 19:42
 */
public class TestMain {
    public static void main(String[] args) {

//        TestEmployee testEmployee = new TestEmployee("lin",50000,LocalDate.of(1996,6,13),2,3);
//        System.out.println(Utils.random());
//
//        System.out.println(String.format("%tc", new Date()));
//
//        System.out.println(NumberFormat.getInstance());

//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//
//        System.out.println(numberFormat.format(0.1));
//
//        NumberFormat numberFormat1 = NumberFormat.getPercentInstance();
//
//        System.out.println(numberFormat1.format(0.1));
//
//        int x = 1;
//        int y = 2;
//        swap(x, y);
//        System.out.println(x);
//
//
//        Employee employee = new Employee("l",4.5,2019,6,13);
//        employee.setNameL();
//        System.out.println(employee.getName());

//        Manager manager = new Manager("lin",4.5,2019,6,13);
//        System.out.println(manager.getSalary());
//        System.out.println(manager.getSalary());
//        Student student = new Student("lin",2);
//        System.out.println(student.getDescription());
//
//        Person[] people = new Person[2];
//        people[0] = new Student("lin",2);
//        people[1] = new Student("bo",4);
//
//        for(Person p: people) {
//            System.out.println(p.getName() + "," + p.getDescription());
//        }
//
//        ArrayList<Employee> arrayList = new ArrayList<>();
//        arrayList.add(new Employee("l",4.5,2019,6,13));
//        arrayList.add(new Employee("b",4.5,2019,6,13));
//
//        for(Employee employee: arrayList) {
//            employee.raiseSalary(5);
//        }


//        System.out.println(true ? 1:0.5);

//        int x = Integer.parseInt("sr");
//        System.out.println(x);

//        System.out.printf("M Xs", new Object[]{ new Integer(5), "widgets"});

        ArrayList arrayList = new ArrayList<Integer>(100);
        arrayList.add(5);
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        System.out.println(arrayList.size());

    }

    public static void swap(int x, int y) {
        int j = x;
        x = y;
        x = j;
    }
}
