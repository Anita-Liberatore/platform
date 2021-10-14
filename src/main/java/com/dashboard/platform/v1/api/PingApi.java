package com.dashboard.platform.v1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public interface PingApi 
{
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String testPing();
	
	
}

