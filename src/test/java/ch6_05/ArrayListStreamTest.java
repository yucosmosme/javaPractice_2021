package ch6_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    /*
    *중간 연산과 최종 연산

    중간 연산의 예 - filter(), map(), sorted() 등
    조건에 맞는 요소를 추출(filter)하거나 요소를 변환 함(map)
    최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됨

    문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기
    *  sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
    *
    * filter()는 중간 연산이고, forEach()는 최종 연산임

    고객 클래스 배열에서 고객 이름만 가져오기
      customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
    map()은 중간 연산이고, forEach()는 최종 연산임

    중간 연산과 최종 연산에 대한 구현은 람다식을 활용함

    최종 연산의 예 - forEach(), count(), sum() 등
    스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행 됨
    최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음
    forEach() : 요소를 하나씩 꺼내 옴
    count() : 요소의 개수
    sum() : 요소들의 합
    *
    * */

    public static void main(String[] args) {
        //ArrayList 생성
        //List = 인터페이스, ArrayList = 클래스
        //List 안에 ArrayList, LinkenList...등이 포함되어 있다.
        //그래서 ArrayList 생성시 타입을 List로 지정하면 더 유연한 코딩 가능
        //더 넓은 범위이기 때문에 나중에 데이터 삽입삭제시에 List를 LinkedList로 바뀌어도 문제가 없게 된다.

        List<String> sList = new ArrayList<>();
        sList.add("Taemin");
        sList.add("Minnie");
        sList.add("ggong");

        //생성한 리스트에 대한 stream 호출
        //collection은 다 stream() 호출 가능
        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        //위에서 스트림 만들고 이미 한번 사용했기때문에
        // 그다음 사용할때마다 .stream()으로 새로 생성해야 함.
        //sorted() 중간연산, foreach() 최종연산.
        //괄호안은 람다식으로 구현

        //정렬 후 루프
        sList.stream().sorted().forEach(s -> System.out.println(s + " "));
        System.out.println();

        //루프돌면서 글자 길이개수 출력
        //for는 그냥 루프만 도는건데 map은 그 객체 자체가 가진 get, set 등의 메소드들을 사용할수있음
       sList.stream().map(s->s.length()).forEach(n-> System.out.println(n));
        System.out.println();

        //여섯글자 이상인 것만 팔터링해서 루프
        sList.stream().filter(s->s.length() >=6).forEach(s-> System.out.println(s));

    }
}
