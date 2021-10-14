package com.dashboard.platform.v1.batch.helloworldbatch;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.dashboard.platform.v1.batch.BaseBatch;

@Service
public class HelloWorldBatch extends BaseBatch {

	//this batch print HELLO WORD ever ten seconds
	@Override
	protected void doBatchBase() {
		System.out.println("Hello World" +"" +new Date());
	}

}
