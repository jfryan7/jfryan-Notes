package ca.ualberta.cs.jfryanToDo;

public class Todo {

	protected String todoItem;
	
	public Todo(String TodoItem) {
		this.todoItem = TodoItem;
	}

	public String getTodo() {
		return this.todoItem;
	}
	
	public String toString(){
		return getTodo();
	}
	

}
