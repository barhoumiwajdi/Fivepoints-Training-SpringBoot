package com.example.jpatraining.service;

import com.example.jpatraining.Exception.CustomerNotFoundException;
import com.example.jpatraining.dao.TodoDAO;
import com.example.jpatraining.model.Customer;
import com.example.jpatraining.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;


@Component
public class TodoService {

    @Autowired
private TodoDAO tododao ;



    public Todo addtodo(Todo todo){
    return  tododao.save(todo);
    }

    public List<Todo> getalltodo(){
        return tododao.findAll();
    }

    public Todo getTodo(int todoId){
        Optional<Todo> OptionalTodo = this.tododao.findById(todoId);
        if(OptionalTodo.isPresent())
        {
            return OptionalTodo.get();
        }
        else
        {
            throw new CustomerNotFoundException("todo not found........ ");
        }
    }
    public Todo updateTodo (int todoId , Todo  todo ){
        todo.setIdTodo(todoId) ;
        return tododao.save(todo);
    }
    public void deleteTodo(int todoId) {
        tododao.deleteById(todoId);
    }
}
