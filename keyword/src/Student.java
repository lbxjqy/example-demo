/**
 * @description: Student
 * @author: lin
 * @create: 2019/03/11 18:46
 */
public class Student extends  Person {
    private int className;

    public Student(String name, int cn) {
        super(name);
        className = cn;
    }

    @Override
    public int getDescription() {
        return className;
    }

    public void setClasss(int cn) {
        className = cn;
    }
}
