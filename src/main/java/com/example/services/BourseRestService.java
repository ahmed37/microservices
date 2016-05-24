package com.example.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class BourseRestService {
	@Value("${me}")
	private String message;

	@RequestMapping("/messages")
	private String tellMe() {
		return message;
	}

}
