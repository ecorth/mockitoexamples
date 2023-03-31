package ort.example.business;

import org.example.business.ITodoService;
import org.example.business.TodoBusinessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class TodoBusinessImplMockitoTest {
    @Test
    public void mokitoTest(){
        ITodoService mockTodoService = mock(ITodoService.class);
        List<String> todos = Arrays.asList("Spring boot bootcamp", "Learn Spring", "Learn to dance");
        when(mockTodoService.retrieveTodos("dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockTodoService);
        List<String> filterTodos = todoBusiness.retrieveTodosRelatedToSpring("dummy");
        Assertions.assertEquals(2, filterTodos.size());
    }
}
