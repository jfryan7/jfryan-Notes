package ca.ualberta.cs.jfryanToDo;

public class Todo {

	protected String todoItem;
	protected Boolean Archived;
	protected Boolean Checked;
	
	public Todo(String TodoItem) {
		this.todoItem = TodoItem;
		this.Archived = false;
		this.Checked = false;
	}
	
	public String toString(){
		return this.todoItem;
	}
	
	public void changeList() {
		if (Archived == false) {
			this.Archived = true;
		}
		else{
			this.Archived = false;
		}
	}
	
	public void changeChecked() {
		if (Checked == false) {
			this.Checked = true;
		}
		else{
			this.Checked = false;
		}
	}
}
