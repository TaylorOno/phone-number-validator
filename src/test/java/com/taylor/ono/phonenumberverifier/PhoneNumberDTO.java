package com.taylor.ono.phonenumberverifier;

public class PhoneNumberDTO {

    @AssertPhoneNumber
    private String phoneNumber;

    public void setPhoneNumber(String emailAddress) {
        this.phoneNumber = emailAddress;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }
}
