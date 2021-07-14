package ch5_13;

import java.util.TreeSet;

public class TreeSetTest {
    /*
    13. 정렬을 위해 Comparable과 Comparator 인터페이스 구현하기

    TreeSet 클래스 활용하기
    객체의 정렬에 사용하는 클래스
    Set 인터페이스를 구현하여 중복을 허용하지 않고,
    오름차순이나 내림차순으로 객체를 정렬할 수 있음.
    (HashSet은 요소 추가할 때 equals()로 동일 여부 체크했는데
    TreeSet은 한개한개씩 비교해보고 어디에 들어갈지 구현. 동일하면 못들어감)
    => 내부적으로 이진검색트리(binary search tree)로 구현됨
    이진검색트리에 저장하기 위해 각 객체를 비교해야 함
    비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
    String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음

    TreeSet이란?
    JDK 1.2부터 제공되고 있는 TreeSet은 HashSet과 마찬가지로
    Set 인터페이스를 구현한 클래스로써 객체를 중복해서 저장할 수 없고
    저장 순서가 유지되지 않는다는 Set의 성질을 그대로 가지고 있습니다.
    하지만 HashSet과는 달리 TreeSet은 이진 탐색 트리(BinarySearchTree) 구조로 이루어져 있습니다.
    이진 탐색 트리는 추가와 삭제에는 시간이 조금 더 걸리지만
    정렬, 검색에 높은 성능을 보이는 자료구조입니다.
    그렇기에 HashSet보다 데이터의 추가와 삭제는 시간이 더 걸리지만
    검색과 정렬에는 유리합니다.
    TreeSet은 데이터를 저장할 시 이진탐색트리(BinarySearchTree)의 형태로 데이터를 저장하기에
    기본적으로 nature ordering를 지원하며 생성자의 매개변수로 Comparator객체를 입력하여
    정렬 방법을 임의로 지정해 줄 수도 있습니다.
    */

    public static void main(String[] args) {
        //선언 시 크기를 지정해줄 수는 없습니다.
        TreeSet<String> treeSet = new TreeSet<String>();

        //TreeSet에 값을 추가하려면 add(value) 메소드를 사용하면 됩니다.
        // 입력되는 값이 TreeSet 내부에 존재하지 않는다면
        // 그 값을 추가한 뒤 true를 반환하고 내부에 값이 존재한다면 false를 반환합니다.
        treeSet.add("태미니");
        treeSet.add("미니");
        treeSet.add("꿍이");

        //String타입이라서 안에 있는 애들이 알파벳 순서대로 정렬됨.
        //String은 comparable을 implement하기 때문에 정렬되는 것.
        System.out.println(treeSet);
        for (String str : treeSet){
            System.out.println(str);
        }
    }
}
