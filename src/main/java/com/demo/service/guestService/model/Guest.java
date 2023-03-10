package com.demo.service.guestService.model;

public class Guest {

    private String guestId;
    private String guestName;
    private String guestIdentityProof;
    private boolean isGuestVerified;
    private String bookedPropertyId;

    public Guest() {
    }
    public Guest(String guestId, String guestName, String guestIdentityProof, boolean isGuestVerified, String bookedPropertyId) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.guestIdentityProof = guestIdentityProof;
        this.isGuestVerified = isGuestVerified;
        this.bookedPropertyId = bookedPropertyId;
    }

    public String getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestIdentityProof() {
        return guestIdentityProof;
    }

    public boolean getIsGuestVerified() {
        return isGuestVerified;
    }

    public String getBookedPropertyId() {
        return bookedPropertyId;
    }


    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestIdentityProof(String guestIdentityProof) {
        this.guestIdentityProof = guestIdentityProof;
    }

    public void setGuestVerified(boolean guestVerified) {
        isGuestVerified = guestVerified;
    }

    public void setBookedPropertyId(String bookedPropertyId) {
        this.bookedPropertyId = bookedPropertyId;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId='" + guestId + '\'' +
                ", guestName='" + guestName + '\'' +
                ", guestIdentityProof='" + guestIdentityProof + '\'' +
                ", isGuestVerified='" + isGuestVerified + '\'' +
                ", bookedPropertyId='" + bookedPropertyId + '\'' +
                '}';
    }
}
