# Android-SegmentView
Simple Android Segment Control cloned from iOS 13

![Sample SegmentView](https://raw.githubusercontent.com/trinnguyen/Android-SegmentView/master/segment_view_sample.jpg)

## XML layout code
```xml
<com.trinnguyen.SegmentView
    android:id="@+id/segment_2"
    android:layout_width="300dp"
    android:layout_height="36dp"
    android:layout_marginTop="100dp"
    android:layout_marginStart="24dp"
    app:separateLineColor="#D6D6D9"
    app:unselectedTextColor="#7F7F7F"
    app:selectedTextColor="#FFFFFF"
    app:unselectedBackgroundColor="#EEEEEF"
    app:selectedBackgroundColor="@color/colorPrimary"
    app:textAppearance="@style/TextAppearance.AppCompat.Body1"
    app:numSegments="3"
    app:selectedIndex="1"/>
```

## Update title
```java
segmentView.setText(0, "Map");
segmentView.setText(1, "Transit");
segmentView.setText(2, "Satellite");
```
