package ch5_14;

import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "태민");
        Member memberKim = new Member(1002, "기범");
        Member memberLee3 = new Member(1003, "민호");
        Member memberYou = new Member(1004, "온유");
        Member memberLee2 = new Member(1005, "종현");

//        memberHashMap.addMember(memberKim);
//        memberHashMap.addMember(memberLee);
//        memberHashMap.addMember(memberLee2);
//        memberHashMap.addMember(memberYou);
//        memberHashMap.addMember(memberLee3);

        //hash는 순서 없음. 들어간 순서대로 나오지 않음.
        memberHashMap.showAllMember();

        //여기서 바로 넣고싶을때
        HashMap<Integer, Member> hashMap = new HashMap<>();
        hashMap.put(memberKim.getMemberId(), memberKim);
        System.out.println(hashMap);
    }
}
