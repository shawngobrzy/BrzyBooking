package com.example.brzybooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class shawnswrldBooking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.first_hotel_booking_details);

        TextView blankSpaceA = findViewById(R.id.a);
        blankSpaceA.setText("");
        TextView blankSpaceB = findViewById(R.id.b);
        blankSpaceB.setText("");
        TextView hotelName = findViewById(R.id.hotelOneName);
        hotelName.setText("Shawnswlrd");
        TextView price = findViewById(R.id.hotelOnePrice);
        price.setText("$ 360");
        TextView location = findViewById(R.id.hotelOneLocation);
        location.setText("Virginia Beach, VA");
        TextView perNight = findViewById(R.id.hotelOnePerNight);
        perNight.setText("3 nights");
        TextView descriptionHeader = findViewById(R.id.hotelOneBookingHeader);
        descriptionHeader.setText("");
        TextView description = findViewById(R.id.description);
        description.setText("");
        TextView facilitiesHeader = findViewById(R.id.hotelOneRoomHeader);
        facilitiesHeader.setText("");
        TextView facilities = findViewById(R.id.facilities_description);
        facilities.setText("Contact number: 757-436-2391");

    }

    public void shawnswrldReservation(View v)
    {
        startActivity(new Intent(shawnswrldBooking.this, shawnswrldBooking.class));
    }
}
