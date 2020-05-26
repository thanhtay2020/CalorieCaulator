package ucstaungoo.caloriescalulator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import me.itangqi.waveloadingview.WaveLoadingView;

public class circle extends Fragment {
    ImageView btn1,btn2,btn3,btn4,btn5;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_circle,container,false);
        btn1=view.findViewById(R.id.btnone);
        btn2=view.findViewById(R.id.btntwo);
        btn3=view.findViewById(R.id.btnthree);
        btn4=view.findViewById(R.id.btnfour);
        btn5=view.findViewById(R.id.btnfive);



        WaveLoadingView waveLoadingView=(WaveLoadingView)view.findViewById(R.id.waveloadingview);
        waveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);

        waveLoadingView.setCenterTitleColor(Color.GRAY);

        waveLoadingView.setBottomTitleSize(18);
        waveLoadingView.setProgressValue(20);
        waveLoadingView.setBorderWidth(10);
        waveLoadingView.setAmplitudeRatio(60);
        waveLoadingView.setWaveColor(Color.RED);
        waveLoadingView.setBorderColor(Color.GRAY);
        waveLoadingView.setTopTitleStrokeColor(Color.BLUE);
        waveLoadingView.setAnimDuration(3000);
        waveLoadingView.setTopTitleStrokeWidth(3);
        waveLoadingView.pauseAnimation();
        waveLoadingView.resumeAnimation();
        waveLoadingView.cancelAnimation();
        waveLoadingView.startAnimation();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),recyclerActivity .class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),drink.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),snack .class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),fruit.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),Exercise .class);
                startActivity(intent);
            }
        });

        return view;

    }
}
