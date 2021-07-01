package org.example.model;

//모든 필드 값을 파라미터로 받는 생성자 생성
import lombok.AllArgsConstructor;
import lombok.Data;
//파라미터가 없는 기본 생성자 생성
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoRequest {

    private String title;
    private Long order;
    private Boolean completed;
}
