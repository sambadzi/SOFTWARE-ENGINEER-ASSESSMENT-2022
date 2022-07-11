/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.services.impl.EnquiriesServiceImpl;
import com.econetwireless.utils.messages.AirtimeBalanceResponse;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author  Blessing Sambadzi
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
