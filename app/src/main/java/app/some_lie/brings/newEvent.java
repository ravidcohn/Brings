package app.some_lie.brings;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

/**
 * Created by pinhas on 08/09/2015.
 */
public class newEvent extends Activity {

    private SQLiteDatabase db;

    private TextView tv_ne_name_ui;
    private TextView tv_ne_place_ui;
    private TextView tv_ne_start_ui;
    private TextView tv_ne_end_ui;
    private TextView tv_ne_description_ui;
    private ImageView tv_ne_image_view_ui;
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

        tv_ne_image_view_ui = (ImageView)findViewById(R.id.tv_ne_image_view_ui);

        bt_ne_pic_ui = (Button)findViewById(R.id.bt_ne_pic_ui);
        bt_ne_create_event_ui = (Button)findViewById(R.id.bt_ne_create_event_ui);
        setOnClick();

    }

    private void setOnClick(){

        final Intent new_event = new Intent(this,newEvent.class);

        bt_ne_pic_ui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 0);
            }

        });

        bt_ne_create_event_ui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 1);
            }

        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 0) {
                Uri selectedImage = data.getData();
                String[] filePath = { MediaStore.Images.Media.DATA };
                Cursor c = getContentResolver().query(selectedImage,filePath, null, null, null);
                c.moveToFirst();
                int columnIndex = c.getColumnIndex(filePath[0]);
                String picturePath = c.getString(columnIndex);
                c.close();
                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
                //Log.w("path of image from gallery......******************.........", picturePath + "");
                tv_ne_image_view_ui.setImageBitmap(thumbnail);
            }else if(requestCode == 1){

            }
        }
    }
}




