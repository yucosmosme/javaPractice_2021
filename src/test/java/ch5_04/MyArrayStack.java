package ch5_04;

import ch5_02.MyArray;

public class MyArrayStack {

    /*
    *   스택(Stack)의 사용 사례
    재귀 알고리즘을 사용하는 경우 스택이 유용하다.

    재귀 알고리즘
    재귀적으로 함수를 호출해야 하는 경우에 임시 데이터를 스택에 넣어준다.
    재귀함수를 빠져 나와 퇴각 검색(backtrack)을 할 때는 스택에 넣어 두었던 임시 데이터를 빼 줘야 한다.
    스택은 이런 일련의 행위를 직관적으로 가능하게 해 준다.
    또한 스택은 재귀 알고리즘을 반복적 형태(iterative)를 통해서 구현할 수 있게 해준다.
    웹 브라우저 방문기록 (뒤로가기)
    실행 취소 (undo)
    역순 문자열 만들기
    수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)
    Ex) 올바른 괄호 문자열(VPS, Valid Parenthesis String) 판단하기
    후위 표기법 계산
    https://gmlwjd9405.github.io/2018/08/03/data-structure-stack.html

*
* 스택: list로 구현
     * */

    MyArray arrayStack;
    int top; //자동으로 0으로 초기화

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    //사이즈 들어오면. 생성자 오버로딩
    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        //스택오버플로우
        if (isFull()){
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop()
    {
        if (isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top); // top이 3번째라면 그 요소 위치는 0부터 시작하니까 top -1 인가?//

    }

    public int peek()
    {
        if (isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1); //이것도 ??
    }

    public int getSize()
    {
        return top;
    }

    public boolean isFull(){
        //스택이 꽉차있으면
        if (top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else return false;
    }

    //스택이 비어있음
    public boolean isEmpty()
    {
        if (top == 0){
            return true;
        }
        else return false;
    }

    public void printAll()
    {
        arrayStack.printAll();
    }

}
