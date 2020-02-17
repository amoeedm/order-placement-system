package com.crudrest.orderplacement.orderplacementsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    //Test for checking that object is created..
    @Test
    void orderObjectIsCreated() {
        Order testOrder = new Order();
        assertNotNull(testOrder);
    }
}
