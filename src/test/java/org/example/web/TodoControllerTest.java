package org.example.web;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.service.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

//컨트롤러에서 alt + insert에서 test에서
//테스트를 원하는 메서드를 고르면 여기 경로에 자동으로 추가된다.
//서비스와 컨트롤러를 따로따로 테스트함
@WebMvcTest(TodoController.class)
class TodoControllerTest {

    @Autowired
    MockMvc mvc;

    private TodoModel expected;

    @MockBean
    TodoService todoService;

    @BeforeEach
    void setup(){
        this.expected = new TodoModel();
        this.expected.setId(123L);
        this.expected.setTitle("Test Title");
        this.expected.setOrder(0L);
        this.expected.setCompleted(false);
    }

    @Test
    void create() throws Exception {
        when(this.todoService.add(any(TodoRequest.class)))
                .then((i) -> {
                    TodoRequest request = i.getArgument(0, TodoRequest.class);
                    return new TodoModel(
                            this.expected.getId(),
                            request.getTitle(), //타이틀만 받아옴
                            this.expected.getOrder(),
                            this.expected.getCompleted()
                    );
                });
        TodoRequest request = new TodoRequest();
        request.setTitle("Any Title");

        //오브젝트 타입을 Body에 넣어주기위해 mapper 씀.
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(request);

        this.mvc.perform(post("/").contentType(MediaType.APPLICATION_JSON)
        .content(content))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Any Title"));
    }

    @Test
    void readOne() {
    }
}