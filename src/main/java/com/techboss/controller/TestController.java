package com.techboss.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping
	public String generateLogs() {
		logger.info("INFO Message");
		logger.warn("WARN Message");
		
		try {
			String s=null;
			s.charAt(100);
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "Generated";
	}
}
