package com.example.demo.subtest.sub2.service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.utility.SubConfig;

import jakarta.annotation.PostConstruct;



public class thread_Consumer implements Runnable {
	
	private final static Logger logger = LoggerFactory.getLogger(thread_Consumer.class);
	
	private String TOPIC;
	private String GROUP_ID;
	private String threadName;
	
	private SubConfig subConfig = new SubConfig();
	
	public thread_Consumer(String TOPIC, String GROUP_ID) {
		
		this.TOPIC = TOPIC;
		this.GROUP_ID = GROUP_ID;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
				
				KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(subConfig.props(GROUP_ID));
				consumer.subscribe(Arrays.asList(TOPIC));
				
				while (true) {
					ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(1));
					
					logger.info("{}", records.count());
					
					
					for (ConsumerRecord<String, String> record : records) {
						logger.info("{}", record);
						
					}
				}
				

			}

		
}

