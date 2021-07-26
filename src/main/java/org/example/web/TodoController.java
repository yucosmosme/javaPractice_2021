package org.example.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j //sout으로 출력하는것보다 로그로 남기는게 더 좋음
@RestController //컨트롤러라는거 알려줌
@CrossOrigin //크로스 오리진 에러
@AllArgsConstructor //생성자 자동 생성
@RequestMapping("/") //base url 셋팅
public class TodoController {

    private final TodoService service;

    @PostMapping //POST로 맵핑
    //데이터 추가하기
    public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request){
        log.info("Create");

        //post 보낼때 값이 없을 떄 처리 : 제목은 필수로 넘거야 하고 나머지는 없어도 됨
        if (ObjectUtils.isEmpty(request.getTitle())) //제목없으면
            return ResponseEntity.badRequest().build(); //badRequest 되돌림

        if (ObjectUtils.isEmpty(request.getOrder())) //오더값없으면
            request.setOrder(0L); //기본값으로 셋팅

        if(ObjectUtils.isEmpty(request.getCompleted()))
            request.setCompleted(false); //기본값 false로 셋팅

        //add해줌
        TodoModel result = this.service.add(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(@PathVariable Long id){
        log.info("Read One");
        TodoModel result = this.service.searchById(id);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        log.info("Read ALl");
        List<TodoModel> list = this.service.searchAll();

        //배열.stream() :
        //.map(): 스트림 내 요소들을 하나씩 특정 값으로 변환해줍니다. 이 때 값을 변환하기 위한 람다를 인자로 받습니다.
        List<TodoResponse> response = list.stream().map(TodoResponse::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @PatchMapping("{id}")
    //(고치려는 id, 고칠 내용)
    public ResponseEntity<TodoResponse> update(@PathVariable Long id, @RequestBody TodoRequest request){
        log.info("Update");
        TodoModel result = this.service.updateById(id, request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    /*
    * 제네릭타입<?> : 제한 없음
    모든 클래스나 인터페이스 타입이 올 수 있다.*/
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(@PathVariable Long id){
        log.info("Delete");
        this.service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        log.info("Delete All");
        this.service.deleteAll();
        return ResponseEntity.ok().build();
    }

}
