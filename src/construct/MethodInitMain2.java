package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemeberInit member1 = new MemeberInit();
        initMember(member1,"user1", 15, 90);

        MemeberInit member2 = new MemeberInit();
        initMember(member2, "user2", 16, 80);

        MemeberInit[] members = {member1, member2};

        for (MemeberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }

    }

    public static void initMember(MemeberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
