package com.cz.rideshare;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.TextView;

import com.cz.rideshare.adapters.RideSnapshotListAdpater;
import com.cz.rideshare.model.Gender;
import com.cz.rideshare.model.Node;
import com.cz.rideshare.model.Rating;
import com.cz.rideshare.model.RideSnapshot;
import com.cz.rideshare.model.User;
import com.cz.rideshare.model.Vehicle;
import com.cz.rideshare.model.VehicleType;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Date;

public class FilterRide extends AppCompatActivity {

    private final Context context = this;

    private RecyclerView recyclerView = null;
    private TextView headerTextView = null;

    private void initialise(){
        recyclerView = findViewById(R.id.rideFilterRecyclerView);
        headerTextView = findViewById(R.id.filterHeaderText);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_ride);
        initialise();
        //
         headerTextView.setText("Chennai - Bengaluru");




        ArrayList<RideSnapshot> rideSnapshots = new ArrayList<RideSnapshot>();

        ///////////////////////////////////TODO Firebase Integration/////////////////////////////////////

        User user = new User("78", "Someone", "someone@someone.com", new Rating(5, 10f),
                Gender.MALE,
                null, "+91 99999 99999",
                new Date(), "dsfs", Uri.parse("https://www.latfusa.com/media/archive/20130529130146Ben_A__.jpg"), new Date());
        RideSnapshot rideSnapshot = new RideSnapshot(20, 365f,
                new Node("RMK College", new Date(), new LatLng(45.00, 65.9)), null,
                new Vehicle("Suzuki Honda",
                        2,
                        "TN-XX XXXX",
                        564,
                        new VehicleType("https://images.hgmsites.net/lrg/2013-bmw-6-series-4-door-sedan-640i-gran-coupe-front-exterior-view_100411916_l.jpg", "Van"),
                        null),
                null,
                null, new Date(),
                new Node("CZ Smart Mobility", new Date(), new LatLng(46.00f, 34.65f)), new Rating(5,10f), user);
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RideSnapshotListAdpater(context, rideSnapshots));
    }
}
