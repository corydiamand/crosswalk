package com.CrossWalk;

import java.text.DateFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;
//import java.text.*;
import android.database.sqlite.*;

public class CrossWalkActivity extends Activity {

	
    /** Called when the activity is first created. */
    //private TextView timeAtStart;
	private Button startTimerButton;
	private Button stopTimerButton;
	static final int TIME_DIALOG_ID = 0;
	
	//on click for start
	private OnClickListener startButtonPress = new OnClickListener()
	{
	public void onClick(View v) {
		TextView timeAtStart = (TextView)findViewById(R.id.timeAtStart);
		String currentDateTimeString =  DateFormat.getDateTimeInstance(DateFormat.FULL, 0).format(new Date());
		timeAtStart.setText(currentDateTimeString);
		}
	};
	
	//on click for stop
	private OnClickListener stopButtonPress = new OnClickListener()
	{
	public void onClick(View g)
		{
		TextView timeAtStop = (TextView)findViewById(R.id.timeAtStop);
		String currentDateTimeString = DateFormat.getDateTimeInstance(DateFormat.FULL, 0).format(new Date());
		timeAtStop.setText(currentDateTimeString);
		}
	}
	;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        //String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
      // timeAtStart = (TextView) findViewById(R.id.timeAtStart);
      //  timeAtStart.setText(currentDateTimeString);
     startTimerButton = (Button) findViewById(R.id.CurrentTime);
     startTimerButton.setOnClickListener(startButtonPress);
     stopTimerButton = (Button) findViewById(R.id.stopTimerButton);
     stopTimerButton.setOnClickListener(stopButtonPress);
     //stopTimerButton = 
    // stopTimerButton = (Button) findViewById(R.id.CurrentTime);
    // stopTimerButton.setOnClickListener(stopButtonPress);


		
		
	}
}