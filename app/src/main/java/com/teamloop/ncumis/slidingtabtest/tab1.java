package com.teamloop.ncumis.slidingtabtest;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class tab1 extends Activity {
    private ListView listView;
    private ArrayAdapter<String> listAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1_list);

        listView = (ListView)findViewById(R.id.list1);
        listAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        listAdapter.add("偉志");
        listAdapter.add("志偉");
        listAdapter.add("志志偉");
        listView.setAdapter(listAdapter);
    }
}