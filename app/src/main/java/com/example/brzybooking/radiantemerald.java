package com.example.brzybooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class radiantemerald extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.third_hotel_description);

        TextView hotelName = findViewById(R.id.hotel_name);
        hotelName.setText("Radiantemerald");
        TextView price = findViewById(R.id.price);
        price.setText("$ 340");
        TextView location = findViewById(R.id.location);
        location.setText("Bali, Indonesia");
        TextView perNight = findViewById(R.id.per_night);
        perNight.setText("per night");
        TextView descriptionHeader = findViewById(R.id.description_header);
        descriptionHeader.setText("Description:");
        TextView description = findViewById(R.id.description);
        description.setText("Radiantemerald");
        TextView facilitiesHeader = findViewById(R.id.facilities_header);
        facilitiesHeader.setText("Facilities:");
        TextView facilities = findViewById(R.id.description);
        facilities.setText("Radiantemerald has yoga classes.");

    }

    public void hotelSelection(View v)
    {
        startActivity(new Intent(radiantemerald.this, radiantemeraldBooking.class));
    }
}
