package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.google.common.collect.Lists;
import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 1. cat
		Handler catHandler = new CatHandler();
		// 2. dog
		Handler dogHandler = new DogHandler();

		List<Handler> handlers = Lists.newArrayList(catHandler, dogHandler);


		TxnContext context = new TxnContext();
		context.setCat(new Cat());
		context.setDog(new Dog());

		for (Handler handler : handlers) {
			handler.handler(context);
		}
	}
}
