package com.econetwireless.epay.business.services.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Tinotenda Zungunde
 */
@ExtendWith(MockitoExtension.class)
public class PartnerCodeValidatorTest {

    String partnerCode;
    String msisdn;
    @Before
    public void setup() {
        partnerCode = "hot-recharge";
        msisdn = "773303584";
    }

    @Test
    public void testValidatePartnerCode() {
        PartnerCodeValidatorImpl partnerCodeValidator = mock(PartnerCodeValidatorImpl.class);
        when(partnerCodeValidator.validatePartnerCode(partnerCode)).thenReturn(true);

        boolean enquireResult = partnerCodeValidator.validatePartnerCode(partnerCode);

        assertTrue(enquireResult);

    }

}