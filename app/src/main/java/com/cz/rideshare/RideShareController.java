package com.cz.rideshare;

import com.cz.rideshare.model.User;

/**
 * Created by Home on 28-12-2017.
 */

class RideShareController {
    private static final RideShareController ourInstance = new RideShareController();

    static RideShareController getInstance() {
        return ourInstance;
    }

    public User user = new User(null, null, null, null, null, null, null, null, null, null, null, null);

    private RideShareController() {
    }
}
