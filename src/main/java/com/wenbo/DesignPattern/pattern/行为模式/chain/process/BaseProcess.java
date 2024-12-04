package com.wenbo.DesignPattern.pattern.行为模式.chain.process;

import com.wenbo.DesignPattern.pattern.行为模式.chain.TxnContext;

public interface BaseProcess {

	void process(TxnContext context);

}
