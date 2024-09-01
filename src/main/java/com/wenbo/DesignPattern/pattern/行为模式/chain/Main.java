package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;

public class Main {
	public static void main(String[] args) {
		// 1. cat
		Handler catHandler = new CatHandler();
		// 2. dog
		Handler dogHandler = new DogHandler();
		// 3. 设置下一个handler
		catHandler.setNextHandler(dogHandler);


		catHandler.handler(new Cat());
		System.out.println("==============");
		catHandler.handler(new Dog());
	}
}
