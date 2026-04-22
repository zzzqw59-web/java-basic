package lecture;

public class StudentMain {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "인천광역시";
        studentLee.studentID = 100;

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "서울특별시";
        studentKim.studentID = 101;

        studentLee.showStudent();
        studentKim.showStudent();
    }
}
