package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;
import java.util.Collection;

public class TodoList {
	
	protected ArrayList<Todo> todoList;
	protected ArrayList<Todo> archivedTodoList;
	
	public TodoList() {
		todoList = new ArrayList<Todo>();
		archivedTodoList = new ArrayList<Todo>();
	}

	//Current List
	
	public Collection<Todo> getTodos() {
		return todoList;
	}

	public void addTodo(Todo todoItem) {
		todoList.add(todoItem);
	}

	public void removeTodo(Todo todoItem) {
		todoList.remove(todoItem);
	}

	//Archived List
	
	public Collection<Todo> getArchivedTodos() {
		return archivedTodoList;
	}

	public void addArchivedTodo(Todo todoItem) {
		archivedTodoList.add(todoItem);
	}

	public void removeArchivedTodo(Todo todoItem) {
		archivedTodoList.remove(todoItem);
	}

	//List change operation
	
	public void changeList(Todo todoItem) {
		if (todoItem.Archived == false) {
			archivedTodoList.add(todoItem);
			todoList.remove(todoItem);
			todoItem.Archived = true;
		}
		else {
			todoList.add(todoItem);
			archivedTodoList.remove(todoItem);
			todoItem.Archived = false;
		}
	}
}











