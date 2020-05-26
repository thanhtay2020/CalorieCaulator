package ucstaungoo.caloriescalulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class drink extends AppCompatActivity {

    List<Book> listbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);



        listbook=new ArrayList<>();
        listbook.add(new Book("ေဖ်ာ္ရည္(အသီး)","Categrories Book","Description Book",R.drawable.aa));
        listbook.add(new Book("ေဖ်ာ္ရည္(အမွုန္.)","Categrories Book","Description Book",R.drawable.b));
        listbook.add(new Book("အေအးဘူး(သံဘူး)","Categrories Book","Description Book",R.drawable.c));
        listbook.add(new Book("ယမကာ","Categrories Book","Description Book",R.drawable.d));


        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyler);
        RecyclerViewAdapter nyAdapter=new RecyclerViewAdapter(this,listbook);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(nyAdapter);
    }
}
