package com.xgs;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @author zxq
 *
 */
@ConfigurationProperties(prefix="my-spring-boot")
public class GrilProperties {
	private String cupSize;
	private Integer age;
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
