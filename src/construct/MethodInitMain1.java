package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemeberInit member1 = new MemeberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemeberInit member2 = new MemeberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemeberInit[] members = {member1, member2};

        for (MemeberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }

    }
}
