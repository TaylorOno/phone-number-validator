package com.taylor.ono.phonenumberverifier;

import com.taylor.ono.phonenumberverifier.AssertPhoneNumberValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AssertPhoneNumberValidatorTest {

    @Mock
    private ConstraintValidatorContext context;

    @Test
    public void isValid_whenValueCanBeEmptyOrNull_returnsTrue() {
        AssertPhoneNumberValidator assertEmailAddressValidator = new AssertPhoneNumberValidator();
        assertEmailAddressValidator.isValid(null, context);

        boolean isValid = assertEmailAddressValidator.isValid(null, context);

        assertTrue(isValid);

    }

    @Test
    public void isValid_whenValueIsAStringAndIsValidPhoneNumber_returnsTrue() {
        AssertPhoneNumberValidator assertEmailAddressValidator = new AssertPhoneNumberValidator();
        assertEmailAddressValidator.isValid(null, context);

        boolean isValid = assertEmailAddressValidator.isValid("202-762-1401", context);

        assertTrue(isValid);
    }

    @Test
    public void isValid_whenValueIsASetAndSetItemsAreValidPhoneNumber_returnsTrue() {
        AssertPhoneNumberValidator assertEmailAddressValidator = new AssertPhoneNumberValidator();
        assertEmailAddressValidator.isValid(null, context);

        Set<String> set = new HashSet<>();
        set.add("202-762-1401");
        boolean isValid = assertEmailAddressValidator.isValid(set, context);

        assertTrue(isValid);
    }

    @Test
    public void isValid_whenValueIsAQueueAndQueueItemsAreValidPhoneNumber_returnsTrue() {
        AssertPhoneNumberValidator assertEmailAddressValidator = new AssertPhoneNumberValidator();
        assertEmailAddressValidator.isValid(null, context);

        Queue<String> queue = new PriorityQueue<>();
        queue.add("202-762-1401");
        boolean isValid = assertEmailAddressValidator.isValid(queue, context);

        assertTrue(isValid);
    }

    @Test
    public void isValid_whenValueIsAListAndListItemsAreValidPhoneNumber_returnsTrue() {
        AssertPhoneNumberValidator assertEmailAddressValidator = new AssertPhoneNumberValidator();
        assertEmailAddressValidator.isValid(null, context);

        List<String> list = new ArrayList<>();
        list.add("202-762-1401");
        boolean isValid = assertEmailAddressValidator.isValid(list, context);

        assertTrue(isValid);
    }
}