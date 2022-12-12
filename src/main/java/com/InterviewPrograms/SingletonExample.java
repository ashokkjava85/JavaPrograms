package com.InterviewPrograms;

public class SingletonExample {

	private static SingletonExample singletonex;

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		return new SingletonExample();

	}

}
