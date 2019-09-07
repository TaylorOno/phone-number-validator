# Phone Number Validator

## 1.0.0 *[CURRENT]*

### About
Validator Wrapper for the google [libphonenumber](https://github.com/google/libphonenumber) library currently version `8.10.17`

- The annotation @AssertPhoneNumber which verifies if a phone number is valid
- This annotation may be used on a FIELD, PARAMETER, or METHOD level
- If you want to verify that a field is not empty or null, use the javax provided annotations @NotNull or @NotEmpty since this annotation does not care if the Object in question is null
- The annotation works for Strings, Queue, List, Set
- The following is an example of how this annotation may be used. It will verify that the phoneNumber field is a valid number
```
public class PhoneNumberDTO {

    @AssertPhoneNumber
    private String phoneNumber;
}
```

#### 2) Use the [`PhoneNumberVerifier`](./src/main/java/com/taylor/ono/phonenumberverifier/PhoneNumberVerifier.java)

```
import com.taylor.ono.phonenumberverifier.PhoneNumberVerifier;

public class SampleClass {

    public boolean isValidPhoneNumber(String phoneNumber) {
        return new PhoneNumberVerifier().isValid(phoneNumber);
    }

}

```
