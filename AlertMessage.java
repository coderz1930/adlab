//MainActivity.java
package com.example.alertmessage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the button to the Java code
        Button showAlertButton = findViewById(R.id.showAlertButton);

        // Set an OnClickListener for the button
        showAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show an alert dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("This is a simple alert message.");
                builder.setPositiveButton("OK", null); // Close the dialog when OK is clicked
                builder.show();
            }
        });
    }
}


//XML file
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:background="#f0f8ff">

    <Button
        android:id="@+id/showAlertButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show Alert"
        android:layout_centerInParent="true"
        android:background="#007bff"
        android:textColor="#ffffff"
        android:padding="10dp"
        android:layout_margin="10dp"
        android:layout_gravity="center" />
</RelativeLayout>
