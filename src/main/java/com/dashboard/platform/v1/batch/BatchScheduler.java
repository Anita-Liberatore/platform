package com.dashboard.platform.v1.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.dashboard.platform.v1.batch.helloworldbatch.HelloWorldBatch;

@Component
public class BatchScheduler {

	@Autowired
	private HelloWorldBatch helloWorldBatch;

	//10 minutes
//	@Scheduled (cron =" 0 */10 * * * *")
	//every 10 seconds
	@Scheduled (cron =" */10 * * * * *")
	public void scheduleHelloWorld(){
		 helloWorldBatch.doBatch();
	}
}
