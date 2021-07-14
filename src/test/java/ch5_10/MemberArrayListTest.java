package ch5_10;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "태민");
        Member memberKim = new Member(1002, "기범");
        Member memberLee3 = new Member(1003, "민호");
        Member memberYou = new Member(1004, "온유");
        Member memberLee2 = new Member(1005, "종현");

        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberLee2);
        memberArrayList.addMember(memberYou);
        memberArrayList.addMember(memberLee3);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberLee.getMemberId());
        memberArrayList.showAllMember();

    }
}
