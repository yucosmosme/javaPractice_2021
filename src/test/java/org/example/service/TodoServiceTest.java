package org.example.service;

import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {

    //외부 시스템에 의존하지 않고 자체 테스트 위해 mock을 사용
    //테스트 할떄마다 db에 데이터 바뀌는데 함부로 변경시키지 않을 수 있음.

    @Mock //직접 사용할
    private TodoRepository todoRepository;

    @InjectMocks //주입받아서 사용할
    private TodoService todoService;

    @Test
    void add(){
        when(this.todoRepository.save(any(TodoModel.class)))
                .then(AdditionalAnswers.returnsFirstArg());

        TodoRequest expected = new TodoRequest();
        expected.setTitle("Test Title");

        TodoModel actual = this.todoService.add(expected);

        //넣은값과 실제로 반환받은 값 일치하는지 확인
        assertEquals(expected.getTitle(), actual.getTitle());
    }

    @Test
    void searchById() {
        TodoModel entity = new TodoModel();
        entity.setId(123L);
        entity.setTitle("Title");
        entity.setOrder(0L);
        entity.setCompleted(false);
        Optional<TodoModel> optional = Optional.of(entity);

        given(this.todoRepository.findById(anyLong()))
                .willReturn(optional);

        TodoModel actual = this.todoService.searchById(123L);

        TodoModel expected = optional.get();

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getTitle(), actual.getTitle());
        assertEquals(expected.getOrder(), actual.getOrder());
        assertEquals(expected.getCompleted(), actual.getCompleted());
    }

    @Test //값이 없는 값 조회시
    public void searchByIdFailed(){
        given(this.todoRepository.findById(anyLong()))
                .willReturn(Optional.empty());

        assertThrows(ResponseStatusException.class, () -> {
            this.todoService.searchById(123L);
        });
    }
}
