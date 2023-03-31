package ort.example.business.stub;

import org.example.business.ITodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ITodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Spring boot bootcamp", "Learn Spring", "Learn to dance");
    }
}
