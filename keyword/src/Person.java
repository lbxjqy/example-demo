/**
 * @description: Person
 * @author: lin
 * @create: 2019/03/11 17:27
 */
public abstract class Person {

    private String name;
    public Person(String n) {
        name = n;
    }
    public abstract int getDescription();

    public String getName() {
        return name;
    }
}
