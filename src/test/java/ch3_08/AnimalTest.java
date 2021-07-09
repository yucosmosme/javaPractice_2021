package ch3_08;

import java.util.ArrayList;

class Animal{

    /*
    * 다운 캐스팅(downcasting)
    업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
    하위 클래스로의 형 변환은 명시적으로 해야 함
    *
    * 다운케스팅할때는 instanceof를 이용하여 인스턴스의 형 체크해야 함
    원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함
    *
    * 다운캐스팅은 코드가 지져분해지므로 웬만하면 그냥 다형성대로 해라
    * */

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal{
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{

    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}


class Eagle extends Animal{
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        //여기서 타입을 자기꺼로 안하고 상위클래스인 Animal로 선언해줬었음 --> 이걸 원래 자기꺼로 다운캐스팅을 할거임 밑에서.
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        //다운캐스팅 만든거 호출
        test.testDownCasting(animalList);

    }

    public void testDownCasting(ArrayList<Animal> list) {

        for(int i =0; i<list.size(); i++) {
            Animal animal = list.get(i);

            //인스턴스가 Human 타입이면 변수도 Human 타입으로 다운캐스팅
            if ( animal instanceof Human) {
                Human human = (Human)animal;
                human.readBooks();
            }
            else if( animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if( animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
            else {
                System.out.println("error");
            }

        }
    }



    public void moveAnimal(Animal animal) {
        animal.move();

    }




}