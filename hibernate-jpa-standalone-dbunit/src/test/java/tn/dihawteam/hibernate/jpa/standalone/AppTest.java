package tn.dihawteam.hibernate.jpa.standalone;


import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import tn.dihawteam.hibernate.jpa.standalone.production.model.Address;
import tn.dihawteam.hibernate.jpa.standalone.production.model.User;
import tn.dihawteam.hibernate.jpa.standalone.test.model.UserTest;


/**
 * 
 * 
 * @author amine.berguiga (https://github.com/dihaw-team)
 *
 */
public class AppTest extends AbstractDbUnitJpaTest {
 
	@Test
	public void testInsertProduction() {
		
		User newUser = new User();
		 
		newUser.setName("Amine berguiga Prod");
		Address address = new Address();
		address.setAddress("Sousse");
		address.setColor("Red");
		address.setNumber(123);
		newUser.setAddress(address);
		
		
		EM$PRODUCTION.getTransaction().begin();
		
		EM$PRODUCTION.persist(newUser);
		long id = newUser.getId();
		
		EM$PRODUCTION.getTransaction().commit();
		
		User user = EM$PRODUCTION.find(User.class, id);
		Assert.assertNotNull(user);
		Assert.assertEquals("Amine berguiga Prod", user.getName());
	}
	
	@Test
	public void testInsertTest() {
		
		UserTest newUser = new UserTest();
		 
		newUser.setName("Amine berguiga Test");
		
		EM$TEST.getTransaction().begin();
		
		EM$TEST.persist(newUser);
		long id = newUser.getId();
		
		EM$TEST.getTransaction().commit();
		
		UserTest user = EM$TEST.find(UserTest.class, id);
		Assert.assertNotNull(user);
		Assert.assertEquals("Amine berguiga Test", user.getName());
	}
	
	/**
	 * @Ignore: is used to ignore this function in test
	 */
	@Ignore
	@Test
	public void testFindAll() {
		
		@SuppressWarnings("unchecked")
		List<UserTest> allUsers = EM$TEST.createQuery("from UserTest").getResultList();
		Assert.assertEquals(1, allUsers.size());
	} 
	
	
}
