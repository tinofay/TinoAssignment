package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.utils.messages.AirtimeBalanceResponse;
import com.econetwireless.utils.messages.AirtimeTopupRequest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Tinotenda Zungunde
 */
@ExtendWith(MockitoExtension.class)
public class EnquiriesServiceTest {

    String partnerCode;
    String msisdn;

    @Before
    public void setup() {
        partnerCode = "hot-recharge";
        msisdn = "773303584";

    }

    @Test
    public void testEnquire() {

        AirtimeBalanceResponse airtime = mock(AirtimeBalanceResponse.class);
        EnquiriesServiceImpl enquiriesService = mock(EnquiriesServiceImpl.class);

        when(enquiriesService.enquire(partnerCode, msisdn)).thenReturn(airtime);

        boolean enquireResult = enquiriesService.enquire(partnerCode, msisdn) != null;

        assertTrue(enquireResult);

    }

}