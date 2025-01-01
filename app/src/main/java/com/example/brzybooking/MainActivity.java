package com.example.brzybooking;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Set hostel name and image
        TextView hostelName = findViewById(R.id.hostel_name);
        ImageView hostelImage = findViewById(R.id.hostel_image);
        hostelName.setText("Brzy Booking");
        hostelImage.setImageResource(R.drawable.brzybookinglogo);

    }

    public void viewHotelList(View v)
    {
        startActivity(new Intent(MainActivity.this, HotelListActivity.class));
    }

}