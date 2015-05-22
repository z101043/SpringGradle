package org.ranestar.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranestar.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context/**/applicationContext*.xml"})
public class UserRepositoryTest {
	
	@Autowired UserRepository userRepositoy;

	@Test
	public void addUser() {
		User user = new User();
		user.setUser_id("test2");
		user.setUser_nm("테스트");
		user.setUser_pw("1234");
		user.setUser_tel("010-1234-1234");
		user.setPw_question("질문");
		user.setPw_answer("1234");
		user.setEmail("test@gmail.com");
		
		userRepositoy.save(user);
		
		User u = userRepositoy.findOne("test2");
		
		Assert.assertEquals(user.getUser_id(), u.getUser_id());
	}

}
