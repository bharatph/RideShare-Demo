package com.cz.rideshare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cz.rideshare.adapters.RideSnapshotListAdpater;
import com.cz.rideshare.model.Gender;
import com.cz.rideshare.model.Node;
import com.cz.rideshare.model.Phone;
import com.cz.rideshare.model.Rating;
import com.cz.rideshare.model.RideSnapshot;
import com.cz.rideshare.model.User;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Date;

public class RideHistory extends AppCompatActivity {

    RecyclerView rideHistoryRecyclerView = null;

    private void initialize() {
        rideHistoryRecyclerView = findViewById(R.id.rideHistoryRecyclerView);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_history);
        initialize();

        User user = new User(78, "Someone", new Rating(5, 10f),
                Gender.MALE,
                null, new Phone(98414037, 91),
                new Date(), "dsfs", null, new Date());
        RideSnapshot rideSnapshot = new RideSnapshot(20,
                new Node("RMK College", new Date(), new LatLng(45.00, 65.9)), null,
                null, null,
                null, new Date(),
                null, new Rating(5,10f), user);
        ArrayList<RideSnapshot> rideSnapshots = new ArrayList<RideSnapshot>();
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);
        rideSnapshots.add(rideSnapshot);
        rideHistoryRecyclerView.setAdapter(new RideSnapshotListAdpater(rideSnapshots));
        rideHistoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        LinearSnapHelper sh = new LinearSnapHelper();
        sh.attachToRecyclerView(rideHistoryRecyclerView);

    }

}
