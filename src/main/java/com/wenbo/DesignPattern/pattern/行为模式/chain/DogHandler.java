package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.Dog;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogHandler extends AbstractHandler {

	@Override
	protected boolean onHandler(Animal animal) {
		animal.speak();
		if (animal instanceof Dog) {
			return true;
		}
		return false;
	}
}
