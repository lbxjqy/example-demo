import javax.xml.crypto.Data;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;

public class Welcome {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("1111");
//        String input;
//
//        do{
//            System.out.println("2");
//            input = in.next();
//        }
//        while(input.equals("N"));



//        String message = String.format("Hello, %s. Next year you'll be %d", "lin",66);
//        System.out.println(message);
//
//        System.out.println(String.format("%tc", new Date()));

//        for(int i = 0;i <= 10;i++) {
//            System.out.println(i);
//        }
//        Scanner i = new Scanner(System.in);
//        int choice = i.nextInt();
//        switch (choice) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("How many numbers do you need to draw?");
//        int k = in.nextInt();
//        System.out.println("what is the highet number you can draw?");
//        int n = in.nextInt();
//
//        BigInteger lotteryOdds = BigInteger.valueOf(1);
//        for(int i = 1;i <=k ;i++) {
//            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
//        }
//        System.out.println("your odds are 1 in " + lotteryOdds + ".Good luck!");

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        for(int i : list) System.out.println(i);

//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        list2.add("2");
//        list2.add("1");
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        System.out.println(list1);
//        System.out.println(list1.contains("1"));

//        int[] smallPrimes = {2, 3, 4, 5, 1};
//
//        int[] luckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
//        int a = 128;
//        int b = 128;
//        System.out.println(Objects.equals(a+1221, b+1221));
//
//
//        for(int i: luckyNumbers) System.out.println(i);
//
//        Arrays.sort(smallPrimes);
//
//        for(int i: smallPrimes) System.out.println(i);

//        if(args.length == 0 || args[0].equals("-h")) System.out.println("Hello");
//        else if (args[0].equals("-g")) System.out.println("GoodBye");


//        Scanner in = new Scanner(System.in);
//        System.out.println("How many");
//        int k = in.nextInt();
//        System.out.println("what is the highest number you can draw?");
//        int n = in.nextInt();
//        int[] numbers = new int[n];
//        for(int i = 0;i < numbers.length;i++) {
//            numbers[i] = i+1;
//        }
//        int[] result = new int[k];
//        for(int i = 0;i < result.length;i++) {
//            int r = (int) (Math.random() * n);
//            result[i] = numbers[r];
//            numbers[r] = numbers[n - 1];
//            n--;
//        }
//
//        Arrays.sort(result);
//        System.out.println("bet the following combination. It'll make you rich");
//        for(int r: result) System.out.println(r);
//        System.out.println(new Date().toString());
//        System.out.println(LocalDate.now());

        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
//        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for(Employee e: staff) {
            e.raiseSalary(5);
        }

        for(Employee e: staff) {
            System.out.println("name =" + e.getName() + " salary =" + e.getSalary() + " hireDay = " + e.getHireDay() + "id = " + e.getId());
        }
    }
}


