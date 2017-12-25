package com.cz.rideshare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cz.rideshare.adapters.RideSnapshotListAdpater;
import com.cz.rideshare.model.Gender;
import com.cz.rideshare.model.RideSnapshot;
import com.cz.rideshare.model.User;

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

        User user = new User(78, "Someone", null,
                Gender.MALE,
                null, null,
                new Date(), "dsfs", null, new Date());
        RideSnapshot rideSnapshot = new RideSnapshot(20,
                null, null,
                null, null,
                null, null,
                null, null, user);
        rideHistoryRecyclerView.setAdapter(new RideSnapshotListAdpater());
        rideHistoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

}
