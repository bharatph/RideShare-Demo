package com.cz.rideshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cz.rideshare.adapters.PermissionListAdapter;
import com.cz.rideshare.adapters.VerificationListAdapter;
import com.cz.rideshare.model.Permission;
import com.cz.rideshare.model.Verification;

import java.util.ArrayList;

public class RideDetailed extends AppCompatActivity {

    RecyclerView carPermissionRecyclerView = null;
    RecyclerView verificationRecyclerView = null;

    void initialise(){
        carPermissionRecyclerView = findViewById(R.id.carPermissionRecyclerView);
        verificationRecyclerView = findViewById(R.id.detailedVerificationRecyclerView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_detailed);
        initialise();
        ArrayList<Permission> permissions = new ArrayList<Permission>();
        ///////////////////////////////////////TODO FIREBASE INTEGRATION/////////////////////////////////
        permissions.add(new Permission("Chat", "https://cdn1.iconfinder.com/data/icons/freeline/32/account_friend_human_man_member_person_profile_user_users-256.png"));
        permissions.add(new Permission("Chat", "https://cdn1.iconfinder.com/data/icons/freeline/32/account_friend_human_man_member_person_profile_user_users-256.png"));
        permissions.add(new Permission("Chat", "https://cdn1.iconfinder.com/data/icons/freeline/32/account_friend_human_man_member_person_profile_user_users-256.png"));
        permissions.add(new Permission("Chat", "https://cdn1.iconfinder.com/data/icons/freeline/32/account_friend_human_man_member_person_profile_user_users-256.png"));

        //////////////////////////////////////////////////////////////////////////////////////////////////


        carPermissionRecyclerView.setAdapter(new PermissionListAdapter(permissions));
        carPermissionRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        verificationRecyclerView.setAdapter(new VerificationListAdapter(RideShareController.getInstance().user.getVerifications()));
        verificationRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}
