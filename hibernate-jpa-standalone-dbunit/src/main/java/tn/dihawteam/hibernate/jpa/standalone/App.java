package tn.dihawteam.hibernate.jpa.standalone;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tn.dihawteam.hibernate.jpa.standalone.test.model.UserTest;


/**
 * Simple standalone JPA app.
 * Will load the user inserted by the script import-users.sql
 * 
 * @author Geoffroy Warin (https://github.com/geowarin)
 *
 */
public class App {
	
	private static Logger log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		EntityManager entityManager =	ConnectionFactory.getEntityManager();
		
		UserTest found = entityManager.find(UserTest.class, 1L);
		log.info("****************");
		log.info("Result");
		log.info(""+found);
		log.info("****************");
	}
}
