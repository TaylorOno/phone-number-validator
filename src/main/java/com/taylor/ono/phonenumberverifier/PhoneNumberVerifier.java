package com.taylor.ono.phonenumberverifier;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.springframework.stereotype.Component;

@Component
public class PhoneNumberVerifier {

    PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

    public boolean isValidPhoneNumber(String input) {
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneUtil.parse(input, "US");
            return phoneUtil.isValidNumber(phoneNumber);
        } catch (NumberParseException e) {
            return false;
        }
    }
}
