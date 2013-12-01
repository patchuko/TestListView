package com.example.testlistview;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuPrincipal extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        
        String[] sMesBulles = new String[] { "Chacha", "Juju", "Petit Chou"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_row, R.id.text1, sMesBulles);
        setListAdapter(adapter);
    }


   @Override
   protected void onListItemClick( ListView l, View v, int position, long id ) {
	   super.onListItemClick( l, v, position, id);
	   Intent i = new Intent(this, MenuDetaille.class );
	   i.putExtra("RowId", id);
	   startActivity(i);
   }

	
    
    
}
