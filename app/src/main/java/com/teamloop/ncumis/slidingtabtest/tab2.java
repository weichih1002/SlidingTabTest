package com.teamloop.ncumis.slidingtabtest;


import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tab2 extends Activity {
    private ListView listView;
    private ArrayAdapter<String> listAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2_list);

        listView = (ListView)findViewById(R.id.list2);
        listAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        listAdapter.add("安安");
        listAdapter.add("你好");
        listAdapter.add("掰掰");
        listView.setAdapter(listAdapter);
    }
}