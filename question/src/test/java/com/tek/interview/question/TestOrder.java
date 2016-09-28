package com.tek.interview.question;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tek.interview.question.Item;
import com.tek.interview.question.Order;
import com.tek.interview.question.OrderLine;

import static org.junit.Assert.assertEquals;

public class TestOrder {
	private Order order;
	@Before
	public void setUp() throws Exception{
		
		order = new Order();
		
		
	}
	
	@Test
    public void testOrderSize() throws Exception{
    	
		order.add(new OrderLine(new Item("book", (float) 12.49), 1));
		order.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
        order.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));
        assertEquals(3,order.size());
    	
    }
    
    @After
    public void tearDown(){
    	order=null;
    }
	
	
}
