package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;
import java.util.Collection;

public class TodoList {
	
	protected ArrayList<Todo> todoList;
	
	public TodoList() {
		todoList = new ArrayList<Todo>();
	}

	public Collection<Todo> getTodos() {
		return todoList;
	}

	public void addTodo(Todo todoItem) {
		todoList.add(todoItem);
	}

	public void removeTodo(Todo todoItem) {
		todoList.remove(todoItem);
	}

}
