package ch5_14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    /*
    * 14. 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
    *
    HashMap 클래스 활용하기
    Map 인터페이스를 구현한 클래스와
    가장 많이 사용되는 Map 인터페이스 기반 클래스
    key - value를 쌍으로 관리하는 메서드를 구현함
    검색을 위한 자료구조
    key를 이용하여 값을 저정하고 key를 이용하여 값을 꺼내오는 방식 - hash 알고리즘으로 구현 됨
    key가 되는 객체는 중복될 수 없고 객체의 유일성을 비교를 위한 equals()와 hashCode() 메서드를 구현해야 함
    * key를 다 가져오면 set으로 가져옴(중복불가), value들을 다 가져오면 collection으로 가져옴(중복 가능)
    *
    * TreeMap 클래스
    Map 인터페이스를 구현한 클래스이고 key에 대한 정렬을 구현할 수 있음
    key가 되는 클래스에 Comparable이나 Comparator인터페이스를 구현함으로써 key-value 쌍의 자료를 key값 기준으로 정렬하여 관리 할 수 있음
    * */

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member); //(k, v) 넣음
    }

    public boolean removeMember(int memberId){
        if (hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("no element to remove");
        return false;
    }

    public void showAllMember(){
        //key 세트를 가져와서 루프 돌림 (이렇게 안해도 hashMap 출력하면 다 나옴)
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){ //그 다음값이 없을때까지 루프 돌림
            int key = ir.next(); //그다음값으로 셋팅
            Member member = hashMap.get(key); //키값으로 멤버를 가져옴
            System.out.println(member);

        }
    }
}
