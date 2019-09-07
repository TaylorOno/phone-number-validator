package com.taylor.ono.phonenumberverifier;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PhoneNumberVerifierTest {

    @Test
    public void isValidPhoneNumber_returnsTrue() {
        PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();
        boolean value = phoneNumberVerifier.isValidPhoneNumber("202-762-1401");
        assertTrue(value);
    }

    @Test
    public void isValidPhoneNumber_whenNoDashes_returnsTrue() {
        PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();
        boolean value = phoneNumberVerifier.isValidPhoneNumber("2027621401");
        assertTrue(value);
    }

    @Test
    public void isValidPhoneNumber_whenHasCountryCode_returnsTrue() {
        PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();
        boolean value = phoneNumberVerifier.isValidPhoneNumber("1-202-762-1401");
        assertTrue(value);
    }

    @Test
    public void isValidPhoneNumber_whenArgumentEmpty_returnsFalse() {
        PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();
        boolean value = phoneNumberVerifier.isValidPhoneNumber("");
        assertFalse(value);
    }

    @Test
    public void isValidPhoneNumber_whenArgumentNull_returnsFalse() {
        PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();
        boolean value = phoneNumberVerifier.isValidPhoneNumber(null);
        assertFalse(value);
    }
}