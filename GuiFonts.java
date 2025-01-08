<!-- XMl file -->
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:background="#f2f2f2"  <!-- Set background color -->

    android:padding="16dp">

    <!-- TextView with custom font and color -->
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Welcome to My App!"
        android:textSize="24sp"
        android:textColor="#4CAF50"  <!-- Set text color -->
        android:fontFamily="sans-serif-medium"
        android:layout_marginBottom="20dp"/>

    <!-- EditText for input -->
    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter text"
        android:textSize="18sp"
        android:padding="10dp"
        android:background="@android:drawable/edit_text"
        android:textColor="#000000"
        android:layout_marginBottom="20dp"/>

    <!-- Button with custom font and color -->
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me"
        android:textSize="18sp"
        android:textColor="#ffffff"
        android:backgroundTint="#FF5722" <!-- Set button background color -->
        android:layout_marginTop="20dp"/>
        
</LinearLayout>



//MainActivity.java
package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize components
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        // Button click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (!inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "You entered: " + inputText, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter something!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
