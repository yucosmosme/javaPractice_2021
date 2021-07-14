package ch5_13;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet memberTreeSet  = new MemberTreeSet();

        Member memberLee = new Member(1001, "태민");
        Member memberKim = new Member(1002, "기범");
        Member memberLee3 = new Member(1003, "민호");
        Member memberYou = new Member(1004, "온유");
        Member memberLee2 = new Member(1005, "종현");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberLee2);
        memberTreeSet.addMember(memberYou);
        memberTreeSet.addMember(memberLee3);

        //hash는 순서 없음. 들어간 순서대로 나오지 않음.
        memberTreeSet.showAllMember();

        // id 중복
        Member memberMin = new Member(1001, "민아");
        memberTreeSet.addMember(memberMin);

        memberTreeSet.showAllMember();

    }
}
