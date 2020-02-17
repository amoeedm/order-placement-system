package com.crudrest.orderplacement.orderplacementsystem;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderControllerTest {

    //HTTP test for asserting that an object is created and stored in the database.
    @Test
    public void testGetOrderListSuccess() throws Exception {

        RestTemplate rest = new RestTemplate();
        URI uri = new URI("http://localhost:8080/orders");
        ResponseEntity<String> result = rest.getForEntity(uri, String.class);

        Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals(true, result.getBody().contains("id"));
    }
}
