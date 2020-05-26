package ucstaungoo.caloriescalulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,txtCate;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle=(TextView)findViewById(R.id.txttitle);
        tvdescription=(TextView)findViewById(R.id.txtdesc);
        txtCate=(TextView)findViewById(R.id.txtCate);
        img=(ImageView)findViewById(R.id.bookthunbail);
        Intent intent=getIntent();
        String title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        int inage=intent.getExtras().getInt("Thunbail");



        tvtitle.setText(title);
        tvdescription.setText(Description);
        img.setImageResource(inage);
    }
}
