package com.xgs.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
	
	@Before("execution(public * com.xgs.controller.GrilController.*(..))")
	public void log() {
		System.out.println("1111111111111111111");
	}

}
