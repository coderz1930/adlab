//Main activity.java file
package com.example.graphicsapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the custom view to draw graphics
        setContentView(new GraphicsView(this));
    }
}


// GraphicsView.Java
package com.example.graphicsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GraphicsView extends View {

    private Paint paint;

    public GraphicsView(Context context) {
        super(context);

        // Initialize Paint object
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Set background color
        canvas.drawColor(Color.LTGRAY);

        // Draw a line
        paint.setColor(Color.BLUE);
        canvas.drawLine(100, 100, 300, 100, paint);

        // Draw a rectangle
        paint.setColor(Color.GREEN);
        canvas.drawRect(100, 150, 300, 300, paint);

        // Draw a circle
        paint.setColor(Color.RED);
        canvas.drawCircle(200, 450, 50, paint);

        // Draw text
        paint.setColor(Color.BLACK);
        paint.setTextSize(40);
        canvas.drawText("Hello, Graphics!", 100, 550, paint);
    }
}

