package app.some_lie.brings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

/**
 * Created by pinhas on 08/09/2015.
 */
public class newEvent extends Activity {

    private TextView tv_ne_name_ui;
    private TextView tv_ne_place_ui;
    private TextView tv_ne_start_ui;
    private TextView tv_ne_end_ui;
    private TextView tv_ne_description_ui;
    private Button bt_ne_pic_ui;
    private Button bt_ne_create_event_ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_event);
        tv_ne_name_ui = (TextView)findViewById(R.id.tv_ne_name_ui);
        tv_ne_place_ui = (TextView)findViewById(R.id.tv_ne_place_ui);
        tv_ne_start_ui = (TextView)findViewById(R.id.tv_ne_start_ui);
        tv_ne_end_ui = (TextView)findViewById(R.id.tv_ne_end_ui);
        tv_ne_description_ui = (TextView)findViewById(R.id.tv_ne_description_ui);
        bt_ne_pic_ui = (Button)findViewById(R.id.bt_ne_pic_ui);
        bt_ne_create_event_ui = (Button)findViewById(R.id.bt_ne_create_event_ui);

        final Intent tabs = new Intent(this,tab.class);
        bt_ne_create_event_ui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(tabs);
            }

        });


    }


}
