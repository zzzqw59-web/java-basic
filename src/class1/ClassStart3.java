package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 80;

        Student student3 = new Student(); // x003
        student3.name = "학생3";
        student3.age = 25;
        student3.grade = 100;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 등급: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 등급: " + student2.grade);
        System.out.println("이름: " + student3.name + " 나이: " + student3.age + " 등급: " + student3.grade);
        System.out.println("이름: " + student3.name + " 나이: " + student3.age + " 등급: " + student3.grade);
    }
}
