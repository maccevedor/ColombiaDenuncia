package com.example.appdenuncie;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.Spinner;	
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.view.View;
import android.R.*;


public class Lista extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);
		

		// Initialize the array
	    String[] Empresas = { "Emab", "Proactiva", "AMB" };
	 
	    // Declare the UI components
	     Spinner monthsListView;
	 
	    ArrayAdapter arrayAdapter;
	

	        setContentView(R.layout.activity_lista);
	 
	        // Initialize the UI components
	        monthsListView = (Spinner) findViewById(R.id.spinner);
	        // For this moment, you have ListView where you can display a list.
	        // But how can we put this data set to the list?
	        // This is where you need an Adapter
	 
	        // context - The current context.
	        // resource - The resource ID for a layout file containing a layout 
	                // to use when instantiating views.
	        // From the third parameter, you plugged the data set to adapter
	        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Empresas);
	 
	        // By using setAdapter method, you plugged the ListView with adapter
	        monthsListView.setAdapter(arrayAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista, menu);
		return true;
	}

}