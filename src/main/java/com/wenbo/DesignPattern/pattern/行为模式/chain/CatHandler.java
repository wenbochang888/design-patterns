package com.wenbo.DesignPattern.pattern.行为模式.chain;

import com.wenbo.DesignPattern.pattern.Cat;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatHandler extends AbstractHandler {

	@Override
	protected boolean onHandler(TxnContext context) {
		Cat cat = context.getCat();
		if (cat == null) {
			return false;
		}
		cat.speak();
		return true;
	}

	@Override
	protected void preHandler(TxnContext context) {
		Cat cat = context.getCat();
		log.info("preHandler animal = {}", cat);
	}

	@Override
	protected void postHandler(TxnContext context) {
		Cat cat = context.getCat();
		log.info("postHandler animal = {}", cat);
	}
}
