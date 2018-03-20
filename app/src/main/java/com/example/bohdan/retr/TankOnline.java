package com.example.bohdan.retr;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** Created by bohdan on 16.03.2018. */

public class TankOnline {

    @SerializedName("vehicle_armor_fedd")
    @Expose
    private Integer vehicleArmorFedd;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("max_health")
    @Expose
    private Integer maxHealth;

    @SerializedName("name")
    @Expose
    private String name;

    public Integer getVehicleArmorFedd() {
        return vehicleArmorFedd;
    }
    public void setVehicleArmorFedd(Integer vehicleArmorFedd) {
        this.vehicleArmorFedd = vehicleArmorFedd;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(Integer maxHealth) {
        this.maxHealth = maxHealth;
    }

    /*public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }*/
}
