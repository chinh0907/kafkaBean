//package com.example.demo.subtest.sub2.subscribe;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.subtest.sub1.service.thread_Consumer;
//
//import jakarta.annotation.PostConstruct;
//
//@Configuration   
//public class kafka_consumer2 {
//
//	private String TOPIC = "test1";
//	private String GROUP_ID = "test-group1";	
//	
//	@Bean
//	public void sendMessage1() {
//		
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		
//		thread_Consumer worker = new thread_Consumer(TOPIC, GROUP_ID);
//		executorService.execute(worker);
//				
//	}
//	
//	
//}
