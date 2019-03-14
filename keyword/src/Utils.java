import java.util.Random;

/**
 * @description: randomUtils
 * @author: lin
 * @create: 2019/03/06 14:51
 */
public class Utils {

    public static int random() {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println(num);
        System.out.println(Math.random() * 10);
        return new Double(Math.random() * 100).intValue();
    }
}
