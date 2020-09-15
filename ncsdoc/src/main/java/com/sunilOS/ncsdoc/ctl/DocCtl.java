package com.sunilOS.ncsdoc.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunilOS.ncsdoc.dto.DocDTO;

@RestController

public class DocCtl {
	
	private Map map=new HashMap(); ;
	
	public DocCtl() {
		DocDTO dto=new DocDTO(1,"anil");
		DocDTO dto1=new DocDTO(2,"shivam");
		this.map.put(1,dto);
		this.map.put(2,dto1);
		
	}

	@RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
	public Map hello(@PathVariable long id) {
		Map map=new HashMap();
		map.put("hello","hello-NcsDoc");
		return map;
	}	
}
