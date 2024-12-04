package com.wenbo.DesignPattern.pattern.行为模式.chain;

public interface Handler {

	boolean handler(TxnContext context);
}
