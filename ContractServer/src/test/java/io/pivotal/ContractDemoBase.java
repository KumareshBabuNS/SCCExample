package io.pivotal;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/**
 * Created by vupadhya on 1/12/17.
 */
public class ContractDemoBase {


    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new HelloWorldController());
    }


    public void assertThatRejectionReasonIsNull(Object rejectionReason) {
        assert rejectionReason == null;
    }
}
