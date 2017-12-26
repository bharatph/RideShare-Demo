package com.cz.rideshare.model;

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
    private int id;
    
    /**
    * @generated
    */
    private Phone phoneNumber;
    
    /**
    * @generated
    */
    private ArrayList<RideSnapshot> ridesOfferedSnapshot;
    
    /**
    * @generated
    */
    private String displayPicture;
    
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
    public User(int id, String name, Rating rating, Gender gender, ArrayList<RideSnapshot> ridesOfferedSnapshot, Phone phoneNumber, Date memberSince, String bio, String displayPicture, Date lastOnline) {
        this.id = id;
        this.name = name;
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
    
    
    /**
    * @generated
    */
    public int getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    public void setId(Integer id) {
        this.id = id;
    }
    
    
    /**
    * @generated
    */
    public Phone getPhoneNumber() {
        return this.phoneNumber;
    }
    
    /**
    * @generated
    */
    public void setPhoneNumber(Phone phoneNumber) {
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
    public String getDisplayPicture() {
        return this.displayPicture;
    }
    
    /**
    * @generated
    */
    public void setDisplayPicture(String displayPicture) {
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
