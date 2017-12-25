package com.cz.rideshare.model;

import java.util.Date;
import android.media.Image;

/**
* @generated
*/
public class Permission {
    
    /**
    * @generated
    */
    private String permissionName;
    
    /**
    * @generated
    */
    private Image permissionImage;
    
    
    
    /**
     * @generated
     */
    public Permission(String permissionName, Image permissionImage) {
        this.permissionName = permissionName;
        this.permissionImage = permissionImage;
    }
    

    /**
    * @generated
    */
    public String getPermissionName() {
        return this.permissionName;
    }
    
    /**
    * @generated
    */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
    
    
    /**
    * @generated
    */
    public Image getPermissionImage() {
        return this.permissionImage;
    }
    
    /**
    * @generated
    */
    public void setPermissionImage(Image permissionImage) {
        this.permissionImage = permissionImage;
    }
    
    
    
    
}
