/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Client;
import java.util.UUID;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.validation.Valid;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API tests for AnotherFakeApi
 */
public class AnotherFakeApiTest {


    private AnotherFakeApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("http://petstore.swagger.io:80/v2", AnotherFakeApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * To test special tags
     *
     * To test special tags and operation ID starting with number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void call123testSpecialTagsTest() {
        UUID uuidTest = null;
        Client body = null;
        //Client response = api.call123testSpecialTags(uuidTest, body);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
