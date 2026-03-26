package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age, int grade) {
        System.out.println("name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
