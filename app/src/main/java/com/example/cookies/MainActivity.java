package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Called when the cookie should be eaten.
     */

    public void eatCookie(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView eatCookie = (ImageView) findViewById(R.id.cookie_image_view);
        eatCookie.setImageResource(R.drawable.after_cookie);

        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("I'm so full!");


        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}



