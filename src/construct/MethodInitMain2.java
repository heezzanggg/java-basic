package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {

        MemberInit[] members = new MemberInit[2];

        members[0] = initMember("user1", 15, 90);
        members[1] = initMember("user2", 16, 80);

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }

    }

    static MemberInit initMember(String name, int age, int grade) {
        MemberInit member = new MemberInit();
        member.name = name;
        member.age = age;
        member.grade = grade;

        return member;
    }
}
