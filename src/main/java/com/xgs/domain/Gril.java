package com.xgs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Gril {

	@Id
	@GeneratedValue
	private Integer id;
	private String cupSize;
	 @NotNull(message = "金额必传")
	private Double money;
	@Min(value=18,message="未成年少女不得入内")
	private Integer age;
	public Gril() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Gril [id=" + id + ", cupSize=" + cupSize + ", money=" + money + ", age=" + age + "]";
	}
	
}
