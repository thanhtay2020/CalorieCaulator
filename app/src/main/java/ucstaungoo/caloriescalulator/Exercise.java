package ucstaungoo.caloriescalulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Exercise extends AppCompatActivity {

    List<Book> listbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);



        listbook=new ArrayList<>();
        listbook.add(new Book("အသား(ဟင္းလ်ာမ်ား)","Categrories Book","Description Book",R.drawable.aa));
        listbook.add(new Book("အသုပ္မ်ား","Categrories Book","Description Book",R.drawable.b));
        listbook.add(new Book("အေျကာ္မ်ား","Categrories Book","Description Book",R.drawable.c));
        listbook.add(new Book("အရည္ေသာက္(ဟင္းရည္မ်ား)","Categrories Book","Description Book",R.drawable.d));
        listbook.add(new Book("တိုစရာမ်ား","Categrories Book","Description Book",R.drawable.e));

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyler);
        RecyclerViewAdapter nyAdapter=new RecyclerViewAdapter(this,listbook);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(nyAdapter);
    }
}
