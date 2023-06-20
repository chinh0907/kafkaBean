package com.example.demo.utility;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SubConfig {
	
	private static Properties props;

	private static String bootstrap;
	private static String key_deserializer;
	private static String value_deserializer;
	private static String enable_auto_commit;
	private static String auto_offset_reset;
	private static String fetch_min_bytes;
	private static String fetch_max_bytes;
	private static String request_timeout_ms;
	private static String session_timeout_ms;
	private static String heartbeat_interval_ms;
	private static String max_partition_fatch_bytes;
	private static String max_poll_interval_ms;
	private static String max_poll_records;
	private static String fetch_max_wait_ms;
	private static String partition_assignment_strategy;
	
	@Value("${kafka.bootstrap-servers}")
	public void setBootstrap(String bootstrap) {
		SubConfig.bootstrap = bootstrap;
	}
	
	@Value("${kafka.consumer.key-deserializer}")
	public void setKey_deserializer(String key_deserializer) {
		SubConfig.key_deserializer = key_deserializer;
	}
	
	@Value("${kafka.consumer.value-deserializer}")
	public void setValue_deserializer(String value_deserializer) {
		SubConfig.value_deserializer = value_deserializer;
	}
	
	@Value("${kafka.consumer.enable-auto-commit}")
	public void setEnable_auto_commit(String enable_auto_commit) {
		SubConfig.enable_auto_commit = enable_auto_commit;
	}
	
	@Value("${kafka.consumer.auto-offset-reset}")
	public void setAuto_offset_reset(String auto_offset_reset) {
		SubConfig.auto_offset_reset = auto_offset_reset;
	}
	
	@Value("${kafka.consumer.fetch-min-bytes}")
	public void setFetch_min_bytes(String fetch_min_bytes) {
		SubConfig.fetch_min_bytes = fetch_min_bytes;
	}
	
	@Value("${kafka.consumer.fetch-max-bytes}")
	public void setFetch_max_bytes(String fetch_max_bytes) {
		SubConfig.fetch_max_bytes = fetch_max_bytes;
	}
	
	@Value("${kafka.consumer.request-timeout-ms}")
	public void setRequest_timeout_ms(String request_timeout_ms) {
		SubConfig.request_timeout_ms = request_timeout_ms;
	}
	
	@Value("${kafka.consumer.session-timeout-ms}")
	public void setSession_timeout_ms(String session_timeout_ms) {
		SubConfig.session_timeout_ms = session_timeout_ms;
	}
	
	@Value("${kafka.consumer.heartbeat-interval-ms}")
	public void setHeartbeat_interval_ms(String heartbeat_interval_ms) {
		SubConfig.heartbeat_interval_ms = heartbeat_interval_ms;
	}
	
	@Value("${kafka.consumer.max-partition-fatch-bytes}")
	public void setMax_partition_fatch_bytes(String max_partition_fatch_bytes) {
		SubConfig.max_partition_fatch_bytes = max_partition_fatch_bytes;
	}
	
	@Value("${kafka.consumer.max-poll-interval-ms}")
	public void setMax_poll_interval_ms(String max_poll_interval_ms) {
		SubConfig.max_poll_interval_ms = max_poll_interval_ms;
	}
	
	@Value("${kafka.consumer.max-poll-records}")
	public void setMax_poll_records(String max_poll_records) {
		SubConfig.max_poll_records = max_poll_records;
	}
	
	@Value("${kafka.consumer.fetch-max-wait-ms}")
	public void setFetch_max_wait_ms(String fetch_max_wait_ms) {
		SubConfig.fetch_max_wait_ms = fetch_max_wait_ms;
	}
	
	@Value("${kafka.consumer.partition-assignment-strategy}")
	public void setPartition_assignment_strategy(String partition_assignment_strategy) {
		SubConfig.partition_assignment_strategy = partition_assignment_strategy;
	}

	
	public Properties props (String consumer_id) {
		
		System.out.println(key_deserializer);
		
		props = new Properties();
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, key_deserializer);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, value_deserializer);
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, consumer_id);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, enable_auto_commit);
		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, auto_offset_reset);
		props.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG, fetch_min_bytes);
		props.put(ConsumerConfig.FETCH_MAX_BYTES_CONFIG, fetch_max_bytes);
		props.put(ConsumerConfig.REQUEST_TIMEOUT_MS_CONFIG, request_timeout_ms);
		props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, session_timeout_ms);
		props.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, heartbeat_interval_ms);
		props.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, max_partition_fatch_bytes);
		props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, max_poll_interval_ms);
		props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, max_poll_records);
		props.put(ConsumerConfig.FETCH_MAX_WAIT_MS_CONFIG, fetch_max_wait_ms);
		props.put(ConsumerConfig.PARTITION_ASSIGNMENT_STRATEGY_CONFIG, partition_assignment_strategy);
		
		return props;
		
	}
	

}
