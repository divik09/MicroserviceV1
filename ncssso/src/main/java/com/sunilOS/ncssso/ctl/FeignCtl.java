package com.sunilOS.ncssso.ctl;

import java.util.Map;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="NCSDOC")
@RibbonClient(name = "NCSDOC")
public interface FeignCtl {
	@RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
	public Map hello123(@PathVariable long id);
}
