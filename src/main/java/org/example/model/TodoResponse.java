package org.example.model;

//모든 필드 값을 파라미터로 받는 생성자 생성
import lombok.AllArgsConstructor;
import lombok.Data;
//파라미터가 없는 기본 생성자 생성
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoModel todoEntity){
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        //url은 임의로 작성함 (원래 이러케 하면 안됨)
        this.url = "http://localhost:8080/" + this.id;
    }
}
