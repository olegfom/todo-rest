package com.apress.todo.todorest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TodoRestApplicationTests {
    @Autowired
    private MockMvc mvc;
    @SuppressWarnings("deprecation")
	@Test
    public void toDoTest() throws Exception {
        this.mvc
        .perform(get("/toDos"))
        .andExpect(status().isOk())
        .andExpect(content()
           .contentType("application/hal+json"));
    }

	@Test
	void contextLoads() {
	}

}
