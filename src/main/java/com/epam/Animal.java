package com.epam;

public enum Animal {
	DOG("Woof!"), CAT("Meow!"), DUCK("Quack!"), HORSE("Nyihaha");

	String voice;

	Animal(String voice) {
		this.voice = voice;
	}
}
