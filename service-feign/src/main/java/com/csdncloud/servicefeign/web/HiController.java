package com.csdncloud.servicefeign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csdncloud.servicefeign.service.HiService;

@RestController
public class HiController {
	@Autowired
	HiService hiService;

	@GetMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return hiService.sayHiFromClientOne(name);
	}
}
