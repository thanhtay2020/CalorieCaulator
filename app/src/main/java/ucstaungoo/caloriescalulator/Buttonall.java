package ucstaungoo.caloriescalulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Buttonall extends AppCompatActivity {
    private Button weightup, weightdown, weightstable;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonall);

        weightup = findViewById(R.id.weightup);
        weightdown = findViewById(R.id.weightdown);
        weightstable = findViewById(R.id.weightstable);

        weightup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttonall.this,Weight_Up.class);
                startActivity(i);
                //actionBar.setTitle("Weight Up");
            }
        });

        weightdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttonall.this,Weight_Down.class);
                startActivity(i);
            }
        });

        weightstable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttonall.this,Weight_Stable.class);
                startActivity(i);
                //actionBar.setTitle("Weight Up");
            }
        });

    }
}
