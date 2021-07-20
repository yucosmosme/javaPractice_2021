package ch6_17;

import java.io.*;

//얘를 직렬화하므로 Serializable을 명시해줘야 직렬화 가능. 아니면 오류남.
class Person implements Serializable{

    String name;
    String job;
//    transient String job; //소켓 등 직렬화할수 없는거나, 직렬화하지 않으려는 거에 transient를 붙여주면 직렬화 안됨.

    public Person(){}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}


/*
* Externalizable 인터페이스
writerExternal()과 readExternal()메서드를 구현해야 함
프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
* 대부분 Serializable을 많이 씀... Serializable 못쓰면 Externalizable을 쓴다.
* */
//class Person implements Externalizable{
//
//    String name;
//    String job;
//
//    public Person() {}
//
//    public Person(String name, String job) {
//        this.name = name;
//        this.job = job;
//    }
//
//    public String toString()
//    {
//        return name + "," + job;
//    }
//
//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeUTF(name);
//        //out.writeUTF(job);
//
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name = in.readUTF();
//        //job = in.readUTF();
//    }
//
//}


class SerializationTest implements Serializable {

    /*
    * 17. 직렬화 (serialization)
    serialization 이란?
    인스턴스의 상태를 그대로 파일 저장하거나 네트웍으로 전송하고 (serialization) 이를 다시 복원(deserializatio) 하는 방식
    자바에서는 보조 스트림을 활용하여 직렬화를 제공함

    자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
    JVM(Java Virtual Machine 이하 JVM)의 메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술

    ObjectInputStream(InputStream in)
    InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성합니다.

    ObjectOutputStream(OutputStream out)
    OutputStream을 생성자의 매개변수로 받아 ObjectOutputStream을 생성합니다.

    *Serializable 인터페이스
    직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
    구현 코드가 없는 marker interface
    transient : 직렬화 하지 않으려는 멤버 변수에 사용함 (Socket등 직렬화 할 수 없는 객체)
    */

    public static void main(String[] args) throws ClassNotFoundException {
        Person personAhn = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        //파일 쓰기
        try(FileOutputStream fos = new FileOutputStream("src/test/java/ch6_17/serial.out");

            //InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성합니다.
            //java.io.ObjectOutputStream를 사용하여 직렬화를 진행합니다.
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personAhn);
            oos.writeObject(personKim);

        }catch(IOException e) {
            e.printStackTrace();
        }

        //파일 읽기
        try(FileInputStream fis = new FileInputStream("src/test/java/ch6_17/serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person p1 = (Person)ois.readObject(); //반환값을 Object로 받아오므로 Person으로 캐스팅
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e2){
            e2.printStackTrace();
        }

    }

}
