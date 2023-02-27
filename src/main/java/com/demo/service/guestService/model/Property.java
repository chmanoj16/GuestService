package com.demo.service.guestService.model;

public class Property {

    private String propertyId;
    private String propertyOwner;
    private String propertyAddress;
    private String propertyRating;
    private String currentPropertyTenant;

    public Property() {

    }
    public Property(String propertyId, String propertyOwner, String propertyAddress, String propertyRating, String currentPropertyTenant) {
        this.propertyId = propertyId;
        this.propertyOwner = propertyOwner;
        this.propertyAddress = propertyAddress;
        this.propertyRating = propertyRating;
        this.currentPropertyTenant = currentPropertyTenant;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public String getPropertyRating() {
        return propertyRating;
    }

    public String getCurrentPropertyTenant() {
        return currentPropertyTenant;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyOwner='" + propertyOwner + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyRating='" + propertyRating + '\'' +
                ", currentPropertyTenant='" + currentPropertyTenant + '\'' +
                '}';
    }
}
