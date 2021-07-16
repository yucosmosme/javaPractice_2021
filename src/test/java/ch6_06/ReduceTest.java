package ch6_06;

import java.util.Arrays;
import java.util.function.BinaryOperator;
/*
* 06. 연산 수행에 대한 구현을 할 수 있는 reduce()연산

* reduce() 연산
정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
T reduce(T identify, BinaryOperator<T> accumulator)
*
최종 연산으로 스트림의 요소를 소모하며 연산을 수행
배열의 모든 요소의 합을 구하는 reduce() 연산 구현 예
Arrays.stream(arr).reduce(0, (a,b)->a+b));
*
reduce() 메서드의 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행 할 수 있음
람다식을 직접 구현하거나 람다식이 긴 경우 BinaryOperator를 구현한 클래스를 사용 함

* */

//외부에서 구현한 클래스
class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length ) return s1;
        else return s2;
    }
}

//BinaryOperator를 구현하여 배열에 여러 문자열이 있을 때 길이가 가장 긴 문자열 찾기 예
public class ReduceTest {

    public static void main(String[] args) {
        String greetings[] = {"Hi", "Taem", "I", "Love you<3"};

        // 방법1 reduce() 안에 직접 구현 및 출력(코드 지저분해질수있음)
        System.out.println(
                Arrays.stream(greetings).reduce("", (s1, s2) -> {
                    if (s1.getBytes().length >= s2.getBytes().length ) return s1;
                    else return s2;
                })
        );

        //방법2 외부 클래스에서 구현한거 reduce()안에다가 호출해오기
        //.reduce()안에 클래스를 new 한거 직접 넣으면 코드가 깔끔해짐
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
