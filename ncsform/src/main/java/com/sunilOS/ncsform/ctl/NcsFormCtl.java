package com.sunilOS.ncsform.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NcsFormCtl {
	@RequestMapping(value = "/hi/{id}",method = RequestMethod.GET)
	public Map say(@PathVariable long id) {
		Map map=new HashMap();
		map.put("hi","Rays-NcsForm");
		return map;
	}
	
}
