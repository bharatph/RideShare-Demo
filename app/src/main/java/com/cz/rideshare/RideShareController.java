package com.cz.rideshare;

import com.cz.rideshare.model.Gender;
import com.cz.rideshare.model.Rating;
import com.cz.rideshare.model.RideSnapshot;
import com.cz.rideshare.model.User;
import com.cz.rideshare.model.Verification;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Home on 28-12-2017.
 */

class RideShareController {
    private static final RideShareController ourInstance = new RideShareController();

    static RideShareController getInstance() {
        return ourInstance;
    }

    public User user = null;

    public void setUser(FirebaseUser fUser) {

        ArrayList<Verification> verifications = new ArrayList<Verification>();

        verifications.add(new Verification("Mobile Number Verified", true));
        verifications.add(new Verification("Email Verified", true));
        verifications.add(new Verification("Licence Verified", false));
        verifications.add(new Verification("208 Facebook Friends", true));


        user = new User("0", "User", "", new Rating(45, 34), Gender.MALE, new ArrayList<RideSnapshot>(), "", new Date(), "", null, new Date(), new ArrayList<Verification>());

    }

    private RideShareController() {
        //get settings from local store

        //initializing with initial values, so it's never null
        user = new User("0", "User", "", new Rating(45, 34), Gender.MALE, new ArrayList<RideSnapshot>(), "", new Date(), "", null, new Date(), new ArrayList<Verification>());
    }
}
