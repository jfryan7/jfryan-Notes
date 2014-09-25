/*
 *ToDo list: A todo list app, can archive or email todos.
 *
 *Copyright 2014 Jeffrey Ryan, jfryan@ualberta.ca
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 * 
 */


package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	private EditText todoText;
	private ArrayList<Todo> todos;
	private ArrayAdapter<Todo> todoViewAdapter;
	private TodoList currentlist = new TodoList();
	private ListView oldTodosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_todos);
        oldTodosList = (ListView) findViewById(R.id.ToDoListView);  
        todos = (ArrayList<Todo>) currentlist.getTodos();
        todoViewAdapter = new ArrayAdapter<Todo>(this, android.R.layout.simple_list_item_1, todos);
		oldTodosList.setAdapter(todoViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    
	public void save(View view) {
 
		todoText = (EditText) findViewById(R.id.AddEditText);
		String text = todoText.getText().toString();
		if(!text.isEmpty() && text.trim().length() > 0){
			Todo todo = new Todo(text.trim());
			currentlist.addTodo(todo);
			todoViewAdapter.notifyDataSetChanged();
		}
		todoText.setText("");
	
//		dataManager.saveTweets(tweets);
	}    
    
	public void viewArchived (MenuItem menu){
    	Toast.makeText(this, "View Archived", Toast.LENGTH_SHORT).show();  
    	Intent intent = new Intent(MainActivity.this, ViewArchived.class);
    	startActivity(intent);
    	
    }
      
}










