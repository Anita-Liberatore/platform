package com.dashboard.platform.v1.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dashboard.platform.v1.api.PingApi;


@Service
public class PingApiImpl implements PingApi {

	@Override
	public ResponseEntity<String> testPing() {
		try {
			
			return new ResponseEntity<>("true", HttpStatus.OK);
		} catch (Exception e) {		
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
