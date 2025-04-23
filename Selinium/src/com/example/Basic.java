package com.example;

public class Basic {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Basic b = new Basic();

		System.out.println(b.add(10, 20));
		System.out.println("doing some changes");

	}

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}
}
