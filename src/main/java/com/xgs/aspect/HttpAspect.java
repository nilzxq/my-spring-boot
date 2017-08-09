package com.xgs.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
	
	private static final Logger log = LoggerFactory.getLogger(HttpAspect.class);
	@Pointcut("execution(public * com.xgs.controller.GrilController.*(..))")
	public void log() {
		
	}
	
	@Before("log()")
	public void doBefore() {
		log.info("1111111111111111111");
	}
	@After("log()")
	public void doAfter() {
		log.info("222222222222");
	}

}
