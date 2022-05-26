package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Tinotenda Zungunde
 */
@ExtendWith(MockitoExtension.class)
public class ReportingServiceTest {

    String partnerCode;
    String msisdn;
    @Before
    public void setup() {
        partnerCode = "hot-recharge";
        msisdn = "773303584";

    }

    @Test
    public void testValidatePartnerCode() {
        ReportingServiceImpl reportingService = mock(ReportingServiceImpl.class);
        List<SubscriberRequest> finalList = reportingService.findSubscriberRequestsByPartnerCode(partnerCode);

        when(finalList.isEmpty()).thenReturn(null);

        boolean result = !finalList.iterator().hasNext();

        assertTrue(result);

    }

}