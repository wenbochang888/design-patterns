package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Dog;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogHandler extends AbstractHandler {

	@Override
	protected boolean onHandler(TxnContext context) {
		Dog dog = context.getDog();
		if (dog == null) {
			return false;
		}
		dog.speak();
		return true;
	}

	@Override
	protected void preHandler(TxnContext context) {
		Dog dog = context.getDog();
		log.info("preHandler animal = {}", dog);
	}

	@Override
	protected void postHandler(TxnContext context) {
		Dog dog = context.getDog();
		log.info("postHandler animal = {}", dog);
	}
}
