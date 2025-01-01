package com.example.brzybooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.telecom.Call;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class HotelListActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.hotel_list);

            //Hotel list preview
            TextView hotelListTitle = findViewById(R.id.hotel_list_title);
            hotelListTitle.setText("Hotels!");

        }

    public void viewHotel1(View v)
    {
        startActivity(new Intent(HotelListActivity.this, shawnswrld.class));
    }

    public void viewHotel2(View v)
    {
        startActivity(new Intent(HotelListActivity.this, diddysgetaway.class));
    }

    public void viewHotel3(View v)
    {
        startActivity(new Intent(HotelListActivity.this, radiantemerald.class));
    }

}

