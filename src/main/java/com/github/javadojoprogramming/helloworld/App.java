package com.github.javadojoprogramming.helloworld;

public class App {

	public String getMessage(final String name) {
		if (name == null) {
			return "Hello World!";
		}
		return "Hello " + name + "!";
	}

}
