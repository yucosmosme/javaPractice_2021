package ch5_13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    //기본생성자
    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()){
            System.out.println("ir:" + ir);
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
