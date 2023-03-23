package com.example.jpatraining.api;




import com.example.jpatraining.model.Todo;

import com.example.jpatraining.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoRessource {
    @Autowired
    public TodoService todoService ;


    @PostMapping("/add")
    public Todo addtodo (@RequestBody Todo todo ){
        return todoService.addtodo(todo);
    }

    @GetMapping
    public List<Todo> getalltodo(){
        return todoService.getalltodo();
    }
    @GetMapping("/{todoId}")
    public Todo gettodo(@PathVariable("todoId") int todoId){
        return todoService.getTodo(todoId);
    }
    @PutMapping("/{todoId}")
    public Todo updatetodo(@PathVariable ("todoId") int todoId ,@RequestBody Todo todo){
        return todoService.updateTodo(todoId , todo);
    }
    @DeleteMapping("/{todoId}")
    public void deletetodo(@PathVariable ("todoId") int todoId){
        todoService.deleteTodo(todoId);}
}
