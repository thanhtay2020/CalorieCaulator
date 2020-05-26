package ucstaungoo.caloriescalulator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import me.itangqi.waveloadingview.WaveLoadingView;

public class Circle1 extends AppCompatActivity {
    ImageView btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        btn=findViewById(R.id.btnone);
        WaveLoadingView waveLoadingView=(WaveLoadingView)findViewById(R.id.waveloadingview);
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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),recyclerActivity .class);
                startActivity(intent);
            }
        });

    }
}
