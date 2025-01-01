package com.example.brzybooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class diddysgetaway extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_hotel_description);

        TextView hotelName = findViewById(R.id.hotel_name);
        hotelName.setText("Diddy's Getaway");
        TextView price = findViewById(R.id.price);
        price.setText("$ 200");
        TextView location = findViewById(R.id.location);
        location.setText("Miami, Fl");
        TextView perNight = findViewById(R.id.per_night);
        perNight.setText("per night");
        TextView descriptionHeader = findViewById(R.id.description_header);
        descriptionHeader.setText("Description:");
        TextView description = findViewById(R.id.description);
        description.setText("Diddy's Getaway offers Diddition.");
        TextView facilitiesHeader = findViewById(R.id.facilities_header);
        facilitiesHeader.setText("Facilities:");
        TextView facilities = findViewById(R.id.description);
        facilities.setText("Diddy's Getaway offers free baby oil.");


    }

    public void hotelSelection(View v)
    {
        startActivity(new Intent(diddysgetaway.this, diddysgetawayBooking.class));
    }

}
