package com.exploreca.tourfinder;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

import com.exploreca.tourfinder.model.Tour;

import java.util.List;

public class MainActivity extends ListActivity {
	
	public static final String LOGTAG="EXPLORECA";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
	/*	ArrayAdapter<Tour> adapter = new ArrayAdapter<Tour>(this,
				android.R.layout.simple_list_item_1, tours);
		setListAdapter(adapter);
		*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
