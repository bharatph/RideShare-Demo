package com.cz.rideshare.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
public class User {
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private String id;
    
    /**
    * @generated
    */
    private String phoneNumber;
    
    /**
    * @generated
    */
    private ArrayList<RideSnapshot> ridesOfferedSnapshot;

    private String email;
    /**
    * @generated
    */
    private Uri displayPicture;
    
    /**
    * @generated
    */
    private Rating rating;
    
    /**
    * @generated
    */
    private String bio;
    
    /**
    * @generated
    */
    private Gender gender;
    
    /**
    * @generated
    */
    private Date memberSince;
    
    /**
    * @generated
    */
    private Date lastOnline;
    
    
    
    /**
     * @generated
     */
    public User(String id, String name, String email, Rating rating, Gender gender, ArrayList<RideSnapshot> ridesOfferedSnapshot, String phoneNumber, Date memberSince, String bio, Uri displayPicture, Date lastOnline) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rating = rating;
        this.gender = gender;
        this.ridesOfferedSnapshot = ridesOfferedSnapshot;
        this.phoneNumber = phoneNumber;
        this.memberSince = memberSince;
        this.bio = bio;
        this.displayPicture = displayPicture;
        this.lastOnline = lastOnline;
    }
    

    /**
    * @generated
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    public void setName(String name) {
        this.name = name;
    }


    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    /**
    * @generated
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    public void setId(String id) {
        this.id = id;
    }
    
    
    /**
    * @generated
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    /**
    * @generated
    */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    /**
    * @generated
    */
    public ArrayList<RideSnapshot> getRidesOfferedSnapshot() {
        return this.ridesOfferedSnapshot;
    }
    
    /**
    * @generated
     * @param ridesOfferedSnapshot
    */
    public void setRidesOfferedSnapshot(ArrayList<RideSnapshot> ridesOfferedSnapshot) {
        this.ridesOfferedSnapshot = ridesOfferedSnapshot;
    }
    
    
    /**
    * @generated
    */
    public Uri getDisplayPicture() {
        return this.displayPicture;
    }
    
    /**
    * @generated
    */
    public void setDisplayPicture(Uri displayPicture) {
        this.displayPicture = displayPicture;
    }
    
    
    /**
    * @generated
    */
    public Rating getRating() {
        return this.rating;
    }
    
    /**
    * @generated
    */
    public void setRating(Rating rating) {
        this.rating = rating;
    }
    
    
    /**
    * @generated
    */
    public String getBio() {
        return this.bio;
    }
    
    /**
    * @generated
    */
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    
    /**
    * @generated
    */
    public Gender getGender() {
        return this.gender;
    }
    
    /**
    * @generated
    */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    
    /**
    * @generated
    */
    public Date getMemberSince() {
        return this.memberSince;
    }
    
    /**
    * @generated
    */
    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }
    
    
    /**
    * @generated
    */
    public Date getLastOnline() {
        return this.lastOnline;
    }
    
    /**
    * @generated
    */
    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }
    
    
    
    
}
