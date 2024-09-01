package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.Cat;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatHandler extends AbstractHandler {

	@Override
	protected boolean onHandler(Animal animal) {
		animal.speak();
		if (animal instanceof Cat) {
			return true;
		}
		return false;
	}
}
