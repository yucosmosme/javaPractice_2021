package ch5_10;

import java.util.ArrayList;
import java.util.Iterator;

/*
*09. 자바에서 제공되는 자료구조 구현 클래스들 - 컬레션 프레임워크
컬렉션 프레임워크
프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 JDK 라이브러리
java.util 패키지에 구현되어 있음
개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요함

Collection 인터페이스
하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스의
하위에 List와 Set 인터페이스가 있음

List 인터페이스
객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
자료구조 리스트 (배열, 연결리스트)의 구현을 위한 인터페이스
중복을 허용함
hashSet, Vector, LinkedList, Stack, Queue 등...

Set 인터페이스
순서와 관계없이 중복을 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언됨
아이디, 주민번호, 사번등을 관리하는데 유용
저장된 순서와 출력되는 순서는 다를 수 있음
HashSet, TreeSet등...

Map 인터페이스
쌍(pair)로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
객체는 key-value의 쌍으로 이루어짐
key는 중복을 허용하지 않음
HashTable, HashMap, Properties, TreeMap 등이 Map 인터페이스를 구현 함
* */


public class MemberArrayList {

    //특별히 지정 안해주면 10개짜리 리스트로 만들어줌
    private ArrayList<Member> arrayList; //hashSet 선언

    //기본생성자
    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    //사이즈 받는 생성자
    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size); //리스트 사이즈 지정
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){

        //1. for문 방식: 삭제하려는 멤버아이디를 찾기 위해 for 문 돌림
//        for (int i=0; i < arrayList.size(); i++ ){
//            Member member = arrayList.get(i);
//
//            int tempId = member.getMemberId();
//            if (tempId == memberId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }


        //2. iterator방식
        /*
        * Collection 요소를 순회하는 Iterator
        요소의 순회란?
        컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
        순서가 있는 List인터페이스의 경우는 Iterator를 사용 하지 않고 get(i) 메서드를 활용할 수 있음
        Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함

        Iterator 사용하기
        boolean hasNext() : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
        E next() : 다음에 있는 요소를 반환
        * */

        //arrayList를 도는데 그 하나씩을 Member 타입의 ir로 선언. ir 자체는 메모리주소를 가리킴..(?)
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()){
            System.out.println("ir:" + ir);
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
