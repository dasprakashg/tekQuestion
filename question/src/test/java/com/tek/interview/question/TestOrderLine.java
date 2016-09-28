package com.tek.interview.question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tek.interview.question.Item;
import com.tek.interview.question.OrderLine;

import static org.junit.Assert.assertEquals;

public class TestOrderLine {
    
	private OrderLine orderLine;
	@Before
	public void setUp() throws Exception{
		orderLine=new OrderLine(new Item("book", (float) 12.49),1);
	}
	
	@Test
    public void testOrderLineQuantity() throws Exception{
    	
    	assertEquals(1,orderLine.getQuantity());
    	
    }
    
    @After
    public void tearDown(){
    	orderLine=null;
    }
	
	
}

