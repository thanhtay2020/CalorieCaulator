package ucstaungoo.caloriescalulator;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Button_All_Fragment extends Fragment {

    private Button weightup, weightdown, weightstable;

    public Button_All_Fragment() {
        // Required empty public constructor
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_button__all_,container,false);
        weightup=view.findViewById(R.id.weightup);
        weightdown=view.findViewById(R.id.weightdown);
        weightstable=view.findViewById(R.id.weightstable);

        weightup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Weight_Up.class);
                startActivity(i);
            }
        });

       weightdown.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(getActivity(),Weight_Down.class);
               startActivity(i);
           }
       });

       weightstable.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(getActivity(),Weight_Stable.class);
               startActivity(i);
           }
       });


        return view;
    }
}

