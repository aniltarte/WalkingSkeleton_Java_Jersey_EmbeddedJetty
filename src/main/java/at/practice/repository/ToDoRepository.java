package at.practice.repository;

import at.practice.resource.ToDo;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ToDoRepository {

    public List<ToDo> findAll() {
        return Arrays.asList(new ToDo("first todo"), new ToDo("second todo"));
    }
}
