package com.test.test;
import org.junit.Assert;
import org.junit.Test;

public class ShelfTest {
    
    @Test
    public void shelfCanAcceptAndReturnItem() {
        Shelf shelf = new Shelf();
        shelf.put("Orange");
        Assert.assertTrue(shelf.take("Orange"));
        //Assert.assertFalse(shelf.items.contains(null));
        //Assert.assertFalse(shelf.put(""));
        
    }
}