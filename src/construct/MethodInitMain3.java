package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemeberInit member1 = new MemeberInit();
        member1.initMember("user1", 15, 90);

        MemeberInit member2 = new MemeberInit();
        member2.initMember( "user2", 16, 80);

        MemeberInit[] members = {member1, member2};

        for (MemeberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }

    }
}
