package app.some_lie.brings;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

/**
 * Created by pinhas on 09/09/2015.
 */
public class tab extends FragmentActivity {
    private FragmentTabHost mTabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_tab);


        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);


        mTabHost.addTab(mTabHost.newTabSpec("Main").setIndicator("Main"),
                mainTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Attending").setIndicator("Attending"),
                attendingTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("To Do").setIndicator("To Do"),
                todoTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Chat").setIndicator("Chat"),
                chatTab.class, null);
/*
        TabHost tabHost = getTabHost();

        // Tab for Main
        TabHost.TabSpec mTab = tabHost.newTabSpec("Main");
        // setting Title and Icon for the Tab
        mTab.setIndicator("Main");
        Intent mainIntent = new Intent(this, mainTab.class);
        mTab.setContent(mainIntent);

        // Tab for Attending
        TabHost.TabSpec attTab = tabHost.newTabSpec("Attending");
        attTab.setIndicator("Attending");
        Intent attendingIntent = new Intent(this, attendingTab.class);
        attTab.setContent(attendingIntent);

        // Tab for To Do
        TabHost.TabSpec tdoTab = tabHost.newTabSpec("To Do");
        tdoTab.setIndicator("To Do");
        Intent todoIntent = new Intent(this, todoTab.class);
        tdoTab.setContent(todoIntent);


        // Tab for To Do
        TabHost.TabSpec cTab = tabHost.newTabSpec("Chat");
        cTab.setIndicator("Chat");
        Intent chatIntent = new Intent(this, chatTab.class);
        cTab.setContent(chatIntent);


        // Adding all TabSpec to TabHost
        tabHost.addTab(mTab); // Adding Main tab
        tabHost.addTab(attTab); // Adding Attending tab
        tabHost.addTab(tdoTab); // Adding To Do tab
        tabHost.addTab(cTab); // Adding Chat tab
        */
    }
}