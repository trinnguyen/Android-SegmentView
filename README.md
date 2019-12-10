## SegmentView
Simple Android Segment Control cloned from iOS 13

<img src="https://raw.githubusercontent.com/trinnguyen/Android-SegmentView/master/segment_view_sample.jpg" alt="Sample Android SegmentView" width="360"/>


## XML layout code
```xml
<com.trinnguyen.SegmentView
    android:id="@+id/segment_2"
    android:layout_width="300dp"
    android:layout_height="36dp"
    app:separateLineColor="#D6D6D9"
    app:unselectedTextColor="#7F7F7F"
    app:selectedTextColor="#FFFFFF"
    app:unselectedBackgroundColor="#EEEEEF"
    app:selectedBackgroundColor="@color/colorPrimary"
    app:textAppearance="@style/TextAppearance.AppCompat.Body1"
    app:numSegments="3"
    app:selectedIndex="1"/>
```

## Usage in Android

### Update title
```java
SegmentView segmentView = findViewById(R.id.segment_2);
segmentView.setText(0, "Map");
segmentView.setText(1, "Transit");
segmentView.setText(2, "Satellite");
```

### Listener
```
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
```

## Usage in Xamarin.Android

### Update title
```java
SegmentView segmentView = FindViewById<SegmentView>(Resource.Id.segment_2);
segmentView.SetText(0, "Map");
segmentView.SetText(1, "Transit");
segmentView.SetText(2, "Satellite");
```

### Listener
