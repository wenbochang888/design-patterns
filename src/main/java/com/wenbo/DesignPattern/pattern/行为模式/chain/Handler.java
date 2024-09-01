package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Animal;

public interface Handler {

	boolean handler(Animal animal);


	void setNextHandler(Handler nextHandler);
}
