package com.xgs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//其中第二个参数为Id的类型
public interface GrilRep extends JpaRepository<Gril,Integer> {
	//通过年龄查询
	public List<Gril> findByAge(Integer age);

}
