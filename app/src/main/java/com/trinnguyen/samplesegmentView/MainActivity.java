package com.trinnguyen.samplesegmentView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.trinnguyen.SegmentView;

public class MainActivity extends AppCompatActivity implements SegmentView.OnSegmentItemSelectedListener {

    SegmentView segmentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        segmentView = findViewById(R.id.segment_2);
        segmentView.setNumSegments(3);
        segmentView.setText(0, "Map");
        segmentView.setText(1, "Transit");
        segmentView.setText(2, "Satellite");
    }

    @Override
    protected void onStart() {
        super.onStart();
        segmentView.setOnSegmentItemSelectedListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        segmentView.setOnSegmentItemSelectedListener(null);
    }

    @Override
    public void onSegmentItemSelected(int index) {
        Toast.makeText(this, "On segment selected: " + segmentView.getText(index), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSegmentItemReselected(int index) {
        Toast.makeText(this, "On segment reselected: " + segmentView.getText(index), Toast.LENGTH_LONG).show();
    }
}
