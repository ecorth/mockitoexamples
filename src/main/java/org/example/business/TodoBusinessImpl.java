package org.example.business;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private ITodoService iTodoService;

    public TodoBusinessImpl(ITodoService iTodoService) {
        this.iTodoService = iTodoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> allTodos = iTodoService.retrieveTodos(user);
        for (String todo: allTodos) {
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
