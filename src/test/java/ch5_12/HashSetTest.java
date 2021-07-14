package ch5_12;

import java.util.HashSet;

public class HashSetTest {

    /*
    * 12. 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용
    HashSet 클래스
    Set 인터페이스를 구현한 클래스와
    멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 함
    동일성 구현을 위해 필요에 따라 equals()와 hashCode()메서드를 재정의함
    *
    * HashSet이란?
    HashSet은 Set 인터페이스의 구현 클래스입니다. 그렇기에 Set의 성질을 그대로 상속받습니다. Set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있습니다. 또한 저장 순서가 유지되지 않습니다. 만약 요소의 저장 순서를 유지해야 한다면 JDK 1.4부터 제공하는 LinkedHashSet 클래스를 사용하면 됩니다. Set 인터페이스를 구현한 클래스로는 HashSet과 TreeSet이 있는데 HashSet의 경우 정렬을 해주지 않고 TreeSet의 경우 자동정렬을 해준다는 차이점이 있습니다. Set의 가장 큰 장점은 중복을 자동으로 제거해준다는 점입니다. 만약 한 편의점에서 오늘 방문한 손님의 총숫자를 계산하고 싶을 경우도 있을 것입니다. 이럴 경우 오늘 하루 동안 편의점을 여러 번 방문한 손님은 한 번으로 체크해주어야 정확한 손님의 숫자가 나올것입니다. 이럴 때 Set이 유용하게 쓰입니다. Set이 생긴 모양은 아래와 같습니다.
    *
    * Set은 위 그림과 같이 주머니 형태로 되어 있습니다. 비선형 구조이기에 순서가 없으며 그렇기에 인덱스도 존재하지 않습니다. 그렇기에 값을 추가하거나 삭제할 때에는 내가 추가 혹은 삭제하고자 하는 값이 Set 내부에 있는지 검색 한 뒤 추가나 삭제를 해야 하므로 속도가 List구조에 비해 느립니다.



    중복을 걸러내는 과정
    HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다. 문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String객체는 동일한 객체로 간주되고 다른 문자열을 갖는 String객체는 다른 객체로 간주되는데, 그 이유는 String클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우 hashCode()의 리턴 값을 같게, equals()의 리턴 값은 true가 나오도록 했기 때문입니다.
    * */

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        //add될때 원래 있는 데이터와 동일하면 add하지 않음
        hashSet.add(new String("김유신"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("김유신")); // add하지 않음

        System.out.println(hashSet);
    }
}
