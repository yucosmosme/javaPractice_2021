package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor //생성자 자동완성해줌
//아래 코드 그냥 냅두면 생성자 만들라고 에러나는데 위에 어노테이션이 해결해줌
public class TodoService {

    private final TodoRepository todoRepository;

    //리스트에 아이템 추가
    public TodoModel add(TodoRequest request){
        TodoModel todoEntity = new TodoModel();
        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());
        //레포에 저장 (레포지토리에서 제공하는 메서드. 반환값 데이터)
        return this.todoRepository.save(todoEntity);
    }

    //아이디로 찾기
    public TodoModel searchById(Long id){
        //아이디 없으면 에러 처리
        return this.todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //목록 조회
    public List<TodoModel> searchAll(){
        return this.todoRepository.findAll();
    }

    //업뎃
    public TodoModel updateById(Long id, TodoRequest request){
        TodoModel todoEntity = this.searchById(id);
        //타이틀 변경 요청이 있으면
        if (request.getTitle() != null){
            todoEntity.setTitle(request.getTitle());
        }
        if (request.getOrder() != null){
            todoEntity.setOrder(request.getOrder());
        }
        if (request.getCompleted() != null){
            todoEntity.setCompleted(request.getCompleted());
        }
        return this.todoRepository.save(todoEntity);
    }

    //삭제
    public void deleteById(Long id){
        this.todoRepository.deleteById(id);

    }

    public void deleteAll(){
        this.todoRepository.deleteAll();
    }
}
