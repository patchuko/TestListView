package com.example.testlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuDetaille extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detaille);
        
        if(getIntent() != null )
        {
        	Bundle extras = getIntent().getExtras();
        	int rowId = extras != null ? extras.getInt("RowId") : -1;
        	
        	TextView maTextVue = (TextView) findViewById(R.id.textDetaille);
        	String sRowID;
        	sRowID = String.format("RowID = %d", rowId);
        	maTextVue.setText( sRowID );
        }
	}
}
