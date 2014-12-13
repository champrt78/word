package com.example.awordaday;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Word extends Activity {

	Button btnDef;
	// also need an array for the words..
	public void onCreate(Bundle savedInstanceState) {

		final int position = 0;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word);

		// get the day of the year, use this to pull correct word/definition.
		// either pass this int or just use it here and there
		//Time now = new Time();
		//now.setToNow();
		//int x = now.yearDay;
		btnDef = (Button) findViewById(R.id.btnDef);

		btnDef.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent definition = new Intent(Word.this, Definition.class);
				definition.putExtra("definition", position);
				startActivity(definition);

			}
		});

	} // end onCreate

}
