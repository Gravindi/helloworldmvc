package org.model;


import junit.framework.TestCase;

public class ModelTest extends TestCase{
	private Model model;
	
	public void setUp() throws Exception {
		 this.model = new Model();
	}
	
	public void testGetHelloWorld() {
		 assertEquals("Hello World", this.model.getHelloWorld());
	}
} 

