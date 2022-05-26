package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.messages.AirtimeTopupRequest;
import com.econetwireless.utils.messages.AirtimeTopupResponse;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Tinotenda Zungunde
 *
 *
 *
 */
@ExtendWith(MockitoExtension.class)
public class CreditsServiceTest {

    String partnerCode;
    String msisdn;
    SubscriberRequest createdSubscriberRequest = new SubscriberRequest();
    AirtimeTopupRequest airtimetp;

    @Before
    public void setup() {
        partnerCode = "hot-recharge";
        msisdn = "773303584";
        airtimetp = new AirtimeTopupRequest();
        airtimetp.setAmount(2.73);
        airtimetp.setMsisdn(msisdn);
        airtimetp.setPartnerCode(partnerCode);
        airtimetp.setReferenceNumber("TOPUP-REF-0123");
    }

    @Test
    public void testCredit() {
        CreditsServiceImpl creditsService = mock(CreditsServiceImpl.class);
        AirtimeTopupResponse airtimeTopup = mock(AirtimeTopupResponse.class);
        when(creditsService.credit(airtimetp)).thenReturn(airtimeTopup);

        boolean atr = creditsService.credit(airtimetp) != null;

        assertTrue(atr);

    }

}