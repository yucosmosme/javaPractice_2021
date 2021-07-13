package ch5_06;

//T라는 타입으로 쓰겠다고 선언 - 나중에 <>이 자리에 실제로 쓸 자료형을 넣어주면 됨
public class GenericPrinter<T> {

    /*
    * 제네릭 자료형 정의
    클래스에서 사용하는 변수의 자료형이 여러개 일수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고
    추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언
    실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
    컬렉션 프레임워크에서 많이 사용되고 있음
    *
    * 기존의 경우에는 Object 형으로 만들었음.
    * 그럼 어떤 자료형이든지 그거의 상위 자료형이 Object이므로 가능했음.
    * 근데 그렇게 쓰려면 형변환 하고 그래야해서 번거롭다.
    *
    * 자료형 매개변수 T(type parameter) : 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정, static 변수는 사용할 수 없음
    * T라고 안쓰고 다른 이름으로 써도 되긴함
    * 구현시 원하는 자료형으로 선언하면 T가 그 자료형으로 대체되는 원리.
    GenericPrinter : 제네릭 자료형
    E : element, K: key, V : value 등 여러 알파벳을 의미에 따라 사용 가능
    * */

    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
