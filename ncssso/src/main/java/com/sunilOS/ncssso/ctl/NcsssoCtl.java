package com.sunilOS.ncssso.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class NcsssoCtl {
	
	@Autowired
	FeignCtl fctl;

	@GetMapping("/ncsso/{id}")
	@HystrixCommand(fallbackMethod = "errorMethod")
	public Map getDoc(@PathVariable long id) {
		Map map=fctl.hello123(id);
		map.put("hi","Rays-Ncssso");
		return map;
	}
	
	@SuppressWarnings("unused")
	    Map errorMethod(long id) {
		Map map=new HashMap();
		map.put("Error","Hytrix Error");
		return map;
	}
	
	
}
