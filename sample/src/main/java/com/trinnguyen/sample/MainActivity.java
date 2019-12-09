package com.trinnguyen.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.trinnguyen.SegmentView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SegmentView segmentView = findViewById(R.id.segment_2);
        segmentView.setNumSegments(3);
        segmentView.setText(0, "Map");
        segmentView.setText(1, "Transit");
        segmentView.setText(2, "Satellite");
    }
}
