package ort.example.business;

import org.example.business.ITodoService;
import org.example.business.TodoBusinessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ort.example.business.stub.TodoServiceStub;

import java.util.List;

public class TodoBusinessImplStubTest {
    @Test
    public void testRetrivedTodosRelatedSpring_usingAStub(){
        ITodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        Assertions.assertEquals(2, filterTodos.size());
    }

}
