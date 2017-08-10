package com.xgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xgs.domain.Gril;
import com.xgs.enums.ResultEnum;
import com.xgs.exception.GrilException;
import com.xgs.repository.GrilRep;

@Service
public class GrilService {

	@Autowired
	private GrilRep grilRep;
	
	@Transactional
	public void insertTwo() {
		Gril grilA=new Gril();
		grilA.setCupSize("A");
		grilA.setAge(18);
		grilRep.save(grilA);
		
		Gril grilB=new Gril();
		grilB.setCupSize("BBBB");
		grilB.setAge(19);
		grilRep.save(grilB);
	}
	
	 public void getAge(Integer id) throws Exception{
	        Gril gril= grilRep.findOne(id);
	        Integer age = gril.getAge();
	        if (age < 10) {
	            //返回"你还在上小学吧" code=100
            throw new GrilException(ResultEnum.PRIMARY_SCHOOL);
	        }else if (age > 10 && age < 16) {
	            //返回"你可能在上初中" code=101
            throw new GrilException(ResultEnum.MIDDLE_SCHOOL);
	        }
	        //如果>16岁,加钱
	        //...
}
	 
	 /**
	  * 通过ID查询一个女生的信息
	  * @param id
	  * @return
	  */
	 public Gril findOne(Integer id) {
		 return grilRep.findOne(id);
	 }
}
