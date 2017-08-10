package com.xgs;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xgs.domain.Gril;
import com.xgs.service.GrilService;

/**
 * 
 * @author zxq
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GrilServiceTest {
	
	private GrilService grilService;
	
	public void findOneTest() {
		Gril gril=grilService.findOne(73);
		Assert.assertEquals(new Integer(13),gril.getAge());
	}

}
