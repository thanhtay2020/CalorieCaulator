package ucstaungoo.caloriescalulator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Weight_Stable extends AppCompatActivity {
    private EditText currentweight,height,age;
    private RadioGroup gender;
    private RadioButton rdrbutton;


    private Double weight=0.0,currentweight1,height1;

    private int age1;
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_stable);

        currentweight=findViewById(R.id.currentweight);
        height=findViewById(R.id.height);
        age=findViewById(R.id.age);

        gender=findViewById(R.id.radiosex);


        button=findViewById(R.id.weightstable);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId=gender.getCheckedRadioButtonId();
                rdrbutton=findViewById(selectedId);

                currentweight1=Double.parseDouble(currentweight.getText().toString());
                height1=Double.parseDouble(height.getText().toString());
                age1=Integer.parseInt(age.getText().toString());

                if (rdrbutton.getText().equals("Female")) {
                    weight = 655 + (4.35 * currentweight1) + (4.7 * height1) - (4.7 * age1);
                    //Toast.makeText(getApplicationContext(), weight+" ",Toast.LENGTH_LONG).show();

                } else {
                    weight = 66 + (6.23 * currentweight1) + (12.7 * height1) - (6.8 * age1);

                }

                Toast.makeText(getApplicationContext(), weight+ " ", Toast.LENGTH_LONG).show();
            }

        });

    }
}
