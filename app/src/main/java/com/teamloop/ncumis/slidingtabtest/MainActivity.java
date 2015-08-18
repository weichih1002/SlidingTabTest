package com.teamloop.ncumis.slidingtabtest;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    private static final String name = "NAME";
    private static final String message = "MESSAGE";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab1Spec = tabHost.newTabSpec(name);
        tab1Spec.setIndicator(name);
        Intent tab1Intent = new Intent(this, tab1.class);
        tab1Spec.setContent(tab1Intent);

        TabHost.TabSpec tab2Spec = tabHost.newTabSpec(message);
        tab2Spec.setIndicator(message);
        Intent tab2Intent = new Intent(this, tab2.class);
        tab2Spec.setContent(tab2Intent);

        tabHost.addTab(tab1Spec);
        tabHost.addTab(tab2Spec);

    }
}