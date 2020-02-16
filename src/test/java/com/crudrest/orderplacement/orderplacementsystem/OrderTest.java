package com.crudrest.orderplacement.orderplacementsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void orderObjectIsCreated() {
        Order testOrder = new Order();
        assertNotNull(testOrder);
    }
}