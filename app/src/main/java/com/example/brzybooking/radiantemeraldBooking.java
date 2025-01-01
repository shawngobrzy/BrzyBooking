package com.example.brzybooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class radiantemeraldBooking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.third_hotel_booking_details);

        TextView blankSpaceA = findViewById(R.id.a);
        blankSpaceA.setText("");
        TextView blankSpaceB = findViewById(R.id.b);
        blankSpaceB.setText("");
        TextView hotelName = findViewById(R.id.hotelOneName);
        hotelName.setText("Radiantemerald");
        TextView price = findViewById(R.id.hotelOnePrice);
        price.setText("$ 1,360");
        TextView location = findViewById(R.id.hotelOneLocation);
        location.setText("Bali, Indonesia");
        TextView perNight = findViewById(R.id.hotelOnePerNight);
        perNight.setText("4 nights");
        TextView descriptionHeader = findViewById(R.id.hotelOneBookingHeader);
        descriptionHeader.setText("");
        TextView description = findViewById(R.id.description);
        description.setText("");
        TextView facilitiesHeader = findViewById(R.id.hotelOneRoomHeader);
        facilitiesHeader.setText("");
        TextView facilities = findViewById(R.id.facilities_description);
        facilities.setText("Contact number: 800-440-0998");

    }

    public void radiantemeraldReservation(View v)
    {
        startActivity(new Intent(radiantemeraldBooking.this, radiantemeraldBooking.class));
    }

}
