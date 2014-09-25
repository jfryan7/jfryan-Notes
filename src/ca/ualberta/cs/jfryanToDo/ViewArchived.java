package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewArchived extends Activity {
//
	private ArrayList<Todo> archivedTodos;
	private ArrayAdapter<Todo> todoViewAdapter;
	private TodoList archivedlist = new TodoList();
	private ListView archivedTodosList;
//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.archived);
//	
		archivedTodosList = (ListView) findViewById(R.id.ToDoListView);  
        archivedTodos = (ArrayList<Todo>) archivedlist.getTodos();
        todoViewAdapter = new ArrayAdapter<Todo>(this, android.R.layout.simple_list_item_1, archivedTodos);
		archivedTodosList.setAdapter(todoViewAdapter);
//		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_archived, menu);
		return true;
	}

}
