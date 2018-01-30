package com.csdncloud.servicefeign.service.hystrix;

import org.springframework.stereotype.Component;

import com.csdncloud.servicefeign.service.HiService;

@Component
public class HiServiceHystrix implements HiService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
