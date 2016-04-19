package com.github.javadojoprogramming.helloworld;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest {

	@Test
	public void getMessage() throws Exception {
		App app = new App();

		assertEquals("Hello John!", app.getMessage("John"));
	}

	@Test
	public void getMessageNull() throws Exception {
		App app = new App();

		assertEquals("Hello World!", app.getMessage(null));
	}

}
