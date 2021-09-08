package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.limitServiceConfig;

@RestController
public class ConfigLimitServiceController {

	@GetMapping("/limits")
	public limitServiceConfig getConfigLimitServiceController()
	{
		return new limitServiceConfig(2,2222);
		
	}
}
