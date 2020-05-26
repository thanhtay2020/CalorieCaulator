package ucstaungoo.caloriescalulator;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Weight_Down extends AppCompatActivity {
    final Context context=this;
    private EditText currentweight,height,age,goalweight;
    private RadioGroup gender;
    private RadioButton rdrbutton;


    private Double weight=0.0,currentweight1,height1,goalweight1;

    private int age1;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_down);

        currentweight=findViewById(R.id.currentweight);
        height=findViewById(R.id.height);
        age=findViewById(R.id.age);

        gender=findViewById(R.id.radiosex);
        goalweight=findViewById(R.id.goalweight);

        button=findViewById(R.id.weightdown);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gender.check(R.id.male);
                int selectedId=gender.getCheckedRadioButtonId();
                rdrbutton=findViewById(selectedId);

                //radio=rdrbutton.getText()+" ";

                currentweight1=Double.parseDouble(currentweight.getText().toString());
                height1=Double.parseDouble(height.getText().toString());
                age1=Integer.parseInt(age.getText().toString());
                goalweight1=Double.parseDouble(goalweight.getText().toString());

                if(goalweight1<currentweight1) {

                    if (rdrbutton.getText().equals("Female")) {
                        weight = 655 + (4.35 * currentweight1) + (4.7 * height1) - (4.7 * age1);
                        //Toast.makeText(getApplicationContext(), weight+" ",Toast.LENGTH_LONG).show();

                    } else {
                        weight = 66 + (6.23 * currentweight1) + (12.7 * height1) - (6.8 * age1);


                    }


                    Toast.makeText(getApplicationContext(), weight + " ", Toast.LENGTH_LONG).show();
                }
                else
                {
                    AlertDialog.Builder alert=new AlertDialog.Builder(context);
                    alert.setTitle("Title");

                    alert.setMessage("Correct form");
                    alert.setCancelable(false);
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //weight_up.this.finish();
                            dialog.cancel();

                        }

                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();


                    //Toast.makeText(getApplicationContext(), "Correct form", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
