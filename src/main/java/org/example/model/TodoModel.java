package org.example.model;

//모든 필드 값을 파라미터로 받는 생성자 생성
import lombok.AllArgsConstructor;
import lombok.Data;
//파라미터가 없는 기본 생성자 생성
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity // 정보 객체 ex. 학생이라는 entity는 학번, 이름, 학점 등의 속성을 갖는다.
@NoArgsConstructor
@AllArgsConstructor
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "todoOrder", nullable = false) //db에 order가 예약어라서 별도로 이름 todoOrder라고 지정해줌
    private Long order;

    @Column(nullable = false)
    private Boolean completed; //테스트 완료 의미
}
