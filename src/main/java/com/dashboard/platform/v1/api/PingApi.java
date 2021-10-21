package com.dashboard.platform.v1.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public interface PingApi 
{
	@GetMapping(value="/test")
	public ResponseEntity<String> testPing();
	
	
}

