package com.csdncloud.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.csdncloud.servicefeign.service.hystrix.HiServiceHystrix;

@FeignClient(value="service-hola",fallback = HiServiceHystrix.class)
public interface HiService {
//	@GetMapping("/hi")
	@RequestMapping(method = RequestMethod.GET, value = "/hi",
    produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
