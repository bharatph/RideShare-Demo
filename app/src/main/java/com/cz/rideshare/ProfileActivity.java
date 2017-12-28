package com.cz.rideshare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {
    private final Context context = this;
    private Button logoutButton = null;
    private EditText emailEditText = null;

    void initialize(){
        logoutButton = findViewById(R.id.logoutButton);
        emailEditText = findViewById(R.id.profileUserEmailEdit);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initialize();
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(context, LoginActivity.class);
                startActivity(i);
            }
        });
        emailEditText.setText(RideShareController.getInstance().user.getEmail());
    }
}
