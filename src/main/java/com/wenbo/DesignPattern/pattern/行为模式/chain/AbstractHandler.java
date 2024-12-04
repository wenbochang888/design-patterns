package com.wenbo.DesignPattern.pattern.行为模式.chain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractHandler implements Handler {

	@Override
	public boolean handler(TxnContext context) {

		try {
			preHandler(context);
			boolean res = onHandler(context);
			// 如果return true，则继续执行下一个handler
			return res;
		} catch (Exception e) {
			log.error("handler error", e);
			return false;
		} finally {
			postHandler(context);
		}
	}


	protected abstract boolean onHandler(TxnContext context);

	protected void preHandler(TxnContext context) {
		log.info("preHandler animal = {}", context);
	}

	protected void postHandler(TxnContext context) {
		log.info("postHandler animal = {}", context);
	}
}
