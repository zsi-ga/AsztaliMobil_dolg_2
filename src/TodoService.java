/*
* File: TodoService.java
* Author: Zsiga Gergely
* Copyright: 2024, Zsiga Gergely
* Group: Szoft/II/1/E
* Date: 2024-01-15
* Github: https://github.com/zsi-ga/AsztaliMobil_dolg_2.git
* Licenc: GNU GPL
*/

import hu.szit.Convert;
import java.util.ArrayList;

public class TodoService {

    DataService dataService;

    public TodoService() {
        dataService = new DataService();
        listTodos();
    }

    public void listTodos() {
        String todos = dataService.getToDos();
        ArrayList<ToDo> todoList = Convert.toListObject(todos, ToDo.class);
        for (ToDo todo : todoList) {
            System.out.println("ID: " + todo.getId());
            System.out.println("UserID: " + todo.getUserId());
            System.out.println("Title: " + todo.getTitle());
            System.out.println("Completed: " + todo.isCompleted());
            System.out.println();
        }
    }

    public void addToDo() {
        ToDo todo = new ToDo();
        String json = Convert.toJson(todo);

        String result = dataService.addToDo(json);
        System.out.println(result);
    }
}
