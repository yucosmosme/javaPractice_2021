package ch3_06;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    /**
     * 다형성(polymorphism) 이란?
     * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
     * 같은 코드에서 여러 다른 실행 결과가 나옴
     * 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
     * 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

     다형성을 사용하는 이유?
     다른 동물을 추가하는 경우
     상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있음
     그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 유지보수가 어려워짐
     * */

    //이런 상속은 클래스간 결합도가 높아져서
    //상위클래스가 바뀌면 하위에도 영향을 미치므로 조심해야함.
    //

}

//상속하고
class Human extends Animal{
    // 메서드오버라이딩함
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }

}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 걷습니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying(){
        System.out.println("독수리가 비행 합니다.");
    }
}

class AnimalTest{

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        //이렇게 추가할수도 있고
//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        //이렇게 배열에 넣고 for문 돌려서 할수도 있음
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList){
            animal.move();
        }
    }

    public void moveAnimal(Animal animal){

        animal.move(); //각 인스턴스별로 상속받은 메서드를 호출 --> 각기 다른 내용을 리턴
    }
}