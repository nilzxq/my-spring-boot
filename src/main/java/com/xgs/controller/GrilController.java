package com.xgs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xgs.domain.Gril;
import com.xgs.repository.GrilRep;
@RestController
public class GrilController {

	@Autowired
	private GrilRep grilRep;
	/**
	 * 查询所有女生列表
	 * @return
	 */
	@RequestMapping(value="/grils",method=RequestMethod.GET)
	public List<Gril> getGrilList(){
		System.out.println("grilList");
		return grilRep.findAll();
	}
	
	/**
	 * 添加一个女生
	 * @param cupSize
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/grils",method=RequestMethod.POST)
	public Gril addGril(@Valid Gril gril,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return null;
		}
		gril.setAge(gril.getAge());
		gril.setCupSize(gril.getCupSize());
	    return grilRep.save(gril);
	}
	/**
	 * 根据Id查询女生
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/grils/{id}",method=RequestMethod.POST)
	public Gril getGril(@PathVariable("id")Integer id) {
		return grilRep.findOne(id);
	}
	/**
	 * 更新女生信息
	 * @param id
	 * @param cupSize
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/grils/{id}",method=RequestMethod.PUT)
	 public Gril updataGril(@PathVariable("id")Integer id,
			 @RequestParam("cupSize")String cupSize,
			 @RequestParam("age")Integer age) {
		 Gril gril=new Gril();
		 gril.setAge(age);
		 gril.setCupSize(cupSize);
		 gril.setId(id);
		 return grilRep.save(gril);
	 }
	
	/**
	 * 删除ID
	 * @param id
	 */
	@DeleteMapping(value="/grils/{id}")
	public void updateGril(@PathVariable("id")Integer id) {
		grilRep.delete(id);
	}
	
	@RequestMapping(value="/grils/age/{age}",method=RequestMethod.GET)
	public List<Gril> getGrils(@PathVariable("age")Integer age){
		return grilRep.findByAge(age);
	}
}

   