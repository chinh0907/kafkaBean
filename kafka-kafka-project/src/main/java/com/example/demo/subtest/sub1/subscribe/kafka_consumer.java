package com.example.demo.subtest.sub1.subscribe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.subtest.sub1.service.thread_Consumer;

@Configuration   
public class kafka_consumer {
	
	private String TOPIC = "test";
	private String GROUP_ID = "test-group";
	
	
	@Bean
	public void sendMessage() {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		thread_Consumer worker = new thread_Consumer(TOPIC, GROUP_ID);
		executorService.execute(worker);
		
		/*
		 * FixedThreadPool: 고정된 개수의 스레드를 가지고 있는 스레드 풀입니다. 스레드가 사용되지 않을 때는 대기 상태를 유지합니다. 사용 가능한 스레드의 개수가 고정되어 있기 때문에, 스레드를 계속해서 생성 및 삭제하는 부하가 없습니다.
		 * CachedThreadPool: 필요한 수만큼의 스레드를 동적으로 생성하는 스레드 풀입니다. 스레드가 사용되지 않을 때는 일정 시간 이후에 삭제됩니다. 스레드를 생성/삭제하는 비용이 적기 때문에, 짧은 시간 동안 많은 작업을 처리해야 하는 경우에 적합합니다.
		 * SingleThreadExecutor: 하나의 스레드만을 가지는 스레드 풀입니다. 스레드가 사용되지 않을 때는 대기 상태를 유지합니다. 스레드를 하나만 사용하기 때문에, 스레드 동기화와 같은 복잡한 문제를 해결할 수 있습니다. 
		 * ScheduledThreadPool: 일정 시간마다 작업을 실행하는 스레드 풀입니다. 스레드가 사용되지 않을 때는 대기 상태를 유지합니다. 작업을 일정 시간마다 실행해야 하는 경우에 적합합니다.
		 * */
		
	}
	
	
}

