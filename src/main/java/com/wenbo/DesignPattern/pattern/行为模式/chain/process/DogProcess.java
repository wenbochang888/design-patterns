package com.wenbo.DesignPattern.pattern.行为模式.chain.process;

import com.wenbo.DesignPattern.pattern.行为模式.chain.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DogProcess extends AbstractProcess {

	@Override
	public void process(TxnContext context) {
		for (Handler handler : getHandlerList()) {
			handler.handler(context);
		}
	}

	@PostConstruct
	public void initHandlerList() {
		// 可以从数据库中 也可以从其他地方去获取。完全根据自己的需要去加入handler，并且顺序也可以随时调整

		// 1. dog
		Handler dogHandler = new DogHandler();
		// 2. cat
		Handler catHandler = new CatHandler();

		List<Handler> handlers = new ArrayList<>();
		handlers.add(dogHandler);
		handlers.add(catHandler);
		setHandlerList(handlers);
	}
}
