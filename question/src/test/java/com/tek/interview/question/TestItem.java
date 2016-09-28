package com.tek.interview.question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tek.interview.question.Item;

import static org.junit.Assert.assertEquals;

public class TestItem {
    
	private Item item;
	@Before
	public void setUp(){	
	item=new Item(null,0);
	}
	
	@Test
    public void testItemDesscription() throws Exception{
    	item=new Item("book", (float) 12.49);
    	assertEquals("book", item.getDescription());
    	
    }
    
    @After
    public void tearDown(){
    	item=null;
    }
	
	
}
