package com.dashboard.platform.v1.impl;

import org.springframework.stereotype.Service;

import com.dashboard.platform.v1.api.PingApi;


@Service
public class PingApiImpl implements PingApi {

	@Override
	public String testPing() {
		String response = "true";
		
		return response;
	}
}
