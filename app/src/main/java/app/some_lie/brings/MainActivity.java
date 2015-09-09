package app.some_lie.brings;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibAdd;
    private TextView tvSearch;
    private SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSearch = (TextView)findViewById(R.id.tvSearch);
        ibAdd = (ImageButton)findViewById(R.id.ibAdd);
        setOnClick();

        tvSearch.setText("Search  ");
        setList();
    }

    private void setOnClick(){

        final Intent new_event = new Intent(this,newEvent.class);

        ibAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(new_event, 0);
            }

        });

        tvSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setList() {//TODO
        final ListView listview = (ListView) findViewById(R.id.listView);
        listview.setClickable(true);
    }

}
