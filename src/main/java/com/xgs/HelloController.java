package com.xgs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private GrilProperties grilProperties;
	
//	@RequestMapping(value= {"/hello","/hi"},method=RequestMethod.GET)
	//组合注解
	@GetMapping(value="/hello")
	public String say(@RequestParam(value="id",required=false,defaultValue="0") Integer myId) {
		return "id: "+myId;
//		return grilProperties.getCupSize();
	}
}
