package com.xgs.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
	
	@Pointcut("execution(public * com.xgs.controller.GrilController.*(..))")
	public void log() {
		
	}
	
	@Before("log()")
	public void doBefore() {
		System.out.println("1111111111111111111");
	}
	@After("log()")
	public void doAfter() {
		System.out.println("22222222");
	}

}
