package app.some_lie.brings;

import android.app.Activity;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_event);
        tv_ne_name_ui = (TextView)findViewById(R.id.tv_ne_name_ui);
        tv_ne_place_ui = (TextView)findViewById(R.id.tv_ne_place_ui);
        tv_ne_start_ui = (TextView)findViewById(R.id.tv_ne_start_ui);
        tv_ne_end_ui = (TextView)findViewById(R.id.tv_ne_end_ui);
        tv_ne_description_ui = (TextView)findViewById(R.id.tv_ne_description_ui);

        tv_ne_description_ui = (Button)findViewById(R.id.bt_ne_pic_ui);
    }


}
