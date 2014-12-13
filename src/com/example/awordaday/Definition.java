package com.example.awordaday;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.widget.TextView;


public class Definition extends Activity {
	
	// this should be in another class
	String[] def = {"Being, existence, true essence,(sat, being + abstract formative tva). In Yoga the quality of purity or goodness. Sattvic; pure, true."};
	TextView txtdefinition;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// get the day of the year, use this to pull correct word/definition.
		Time now = new Time();
        now.setToNow();
        int x = now.yearDay;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_definition);
		txtdefinition = (TextView) findViewById(R.id.textDefinition);
		final int index = getIntent().getIntExtra("place", 0);
		txtdefinition.setText(def[index]);
	}
	
	
	
	
	
	
	
}
