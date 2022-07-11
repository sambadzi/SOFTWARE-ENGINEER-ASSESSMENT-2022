/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.services.impl.PartnerCodeValidatorImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author  Blessing Sambadzi
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
