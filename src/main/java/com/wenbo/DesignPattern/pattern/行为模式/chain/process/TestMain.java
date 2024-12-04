package com.wenbo.DesignPattern.pattern.行为模式.chain.process;

import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;
import com.wenbo.DesignPattern.pattern.行为模式.chain.TxnContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class TestMain {

	// 可以使用factory来配合使用, 想使用哪个就factory获取哪个即可
	@Autowired
	private CatProcess catProcess;  //  cat 的流程

	@Autowired
	private DogProcess dogProcess; //  dog 的流程

	@PostConstruct
	public void init() {
		TxnContext context = new TxnContext();
		context.setDog(new Dog());
		context.setCat(new Cat());

		catProcess.process(context);

		log.info("================================================================================");

		dogProcess.process(context);
	}

}
