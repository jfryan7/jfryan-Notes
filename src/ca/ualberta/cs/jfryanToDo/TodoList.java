package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;
import java.util.Collection;

//Class that is the list/collection of todo items. Currently has two separate ArrayLists
//for current and archived todos, which each have their own methods that are very similar.
//Future versions should probably refactor some of this code, reducing the amount of
//duplicate code, possibly through the use of making two subclasses or implementing some
//type of list modifier/handler class.

public class TodoList {
	
	protected ArrayList<Todo> todoList;
	protected ArrayList<Todo> archivedTodoList;
	
	public TodoList() {
		todoList = new ArrayList<Todo>();
		archivedTodoList = new ArrayList<Todo>();
	}

	//Current List methods
	
	public Collection<Todo> getAllTodos() {
		return todoList;
	}


	public void addTodo(Todo todoItem) {
		todoList.add(todoItem);
	}

	public void removeTodo(Todo todoItem) {
		todoList.remove(todoItem);
	}

	//Archived List methods
	
	public Collection<Todo> getAllArchivedTodos() {
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











