package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Currently this class only creates a new activity to view the archived todos.
//Needs to access the file/database where the todos are stored so that needs to be 
//implemented first.

public class ViewArchived extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.archived);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_archived, menu);
		return true;
	}

}
