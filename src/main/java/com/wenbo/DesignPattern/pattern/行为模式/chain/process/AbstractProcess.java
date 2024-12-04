package com.wenbo.DesignPattern.pattern.行为模式.chain.process;

import com.wenbo.DesignPattern.pattern.行为模式.chain.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProcess implements BaseProcess {
	private List<Handler> handlerList = new ArrayList<>();


	@Override
	public void process(TxnContext context) {
		for (Handler handler : getHandlerList()) {
			handler.handler(context);
		}
	}

	@PostConstruct
	public void initHandlerList() {
		// 可以从数据库中 也可以从其他地方去获取

		// 1. cat
		Handler catHandler = new CatHandler();
		// 2. dog
		Handler dogHandler = new DogHandler();

		List<Handler> handlers = new ArrayList<>();
		handlers.add(catHandler);
		handlers.add(dogHandler);
		setHandlerList(handlers);
	}

	public List<Handler> getHandlerList() {
		return handlerList;
	}

	public void setHandlerList(List<Handler> handlerList) {
		// handlerList 不需要排序，按需进入加入排序
		this.handlerList = handlerList;
	}
}
