package ch5_12;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "태민");
        Member memberKim = new Member(1002, "기범");
        Member memberLee3 = new Member(1003, "민호");
        Member memberYou = new Member(1004, "온유");
        Member memberLee2 = new Member(1005, "종현");

        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberLee2);
        memberHashSet.addMember(memberYou);
        memberHashSet.addMember(memberLee3);

        //hash는 순서 없음. 들어간 순서대로 나오지 않음.
        memberHashSet.showAllMember();

        // id 중복
        Member memberMin = new Member(1001, "민아");
        memberHashSet.addMember(memberMin);

        memberHashSet.showAllMember();

    }
}
