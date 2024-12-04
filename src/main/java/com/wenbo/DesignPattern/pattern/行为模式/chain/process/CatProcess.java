package com.wenbo.DesignPattern.pattern.行为模式.chain.process;

import org.springframework.stereotype.Service;

@Service
public class CatProcess extends AbstractProcess {


	// process initHandlerList 都是默认继承抽象类里面的方法

    //@Override
    //public void process(TxnContext context) {
    //    for (Handler handler : getHandlerList()) {
    //        handler.handler(context);
    //    }
    //}

	//@Override
	//@PostConstruct
	//public void initHandlerList() {
	//	// 可以从数据库中 也可以从其他地方去获取
	//
	//	// 1. cat
	//	Handler catHandler = new CatHandler();
	//	// 2. dog
	//	Handler dogHandler = new DogHandler();
	//
	//	List<Handler> handlers = new ArrayList<>();
	//	handlers.add(catHandler);
	//	handlers.add(dogHandler);
	//	setHandlerList(handlers);
	//}
}
