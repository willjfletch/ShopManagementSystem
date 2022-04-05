package com.arms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tester class for item functionality
 *
 * @author William Fletcher
 *
 */
public class ItemTest {

    private Item item1;
    private Item item2;

    @BeforeEach
    public void generateItems() {

        Item item1 = new Item(1, "item1", 2.00);

        Item item2 = new Item(2, "item2", 3.50);

    }

    /**
     * Tests we can create items.
     */
    @Test
    public void itemIDTest() { Item itemTest = new Item(1, "item1", 2.00); }

}
