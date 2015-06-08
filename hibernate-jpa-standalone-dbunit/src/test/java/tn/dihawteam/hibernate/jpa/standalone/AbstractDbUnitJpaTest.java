package tn.dihawteam.hibernate.jpa.standalone;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dbunit.DatabaseUnitException;
import org.hibernate.HibernateException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Abstract unit test case class.
 * This will load the test-data.xml dataset before each test case and will clean the database before each test
 * 
 * @author amine.berguiga (https://github.com/dihaw-team)
 * 
 *
 */
 
public abstract class AbstractDbUnitJpaTest {
	
	private   static EntityManagerFactory EMF$TEST;
	protected static EntityManager 	      EM$TEST;
	
	private   static EntityManagerFactory EMF$PRODUCTION;
	protected static EntityManager 	      EM$PRODUCTION;
	

	/**
	 * will create new instance fir EntitymanagerFactory and EntityManager for each 
	 * Unit Persistence (PU).
	 * @throws HibernateException
	 * @throws DatabaseUnitException
	 */
	@BeforeClass
	public static void initEntityManager() throws HibernateException, DatabaseUnitException {
		
		if(EMF$TEST == null )
		EMF$TEST = Persistence.createEntityManagerFactory("persistence-test");
		if(EM$TEST == null)
		EM$TEST = EMF$TEST.createEntityManager();
		
		
		EMF$PRODUCTION = Persistence.createEntityManagerFactory("persistence-production");
		EM$PRODUCTION = EMF$PRODUCTION.createEntityManager();
	}

	@AfterClass
	public static void closeEntityManager() {
		
		EM$TEST.close();
		EMF$TEST.close();
		
		EM$PRODUCTION.close();
		EMF$PRODUCTION.close();
	}
	
	/**
	 * Will clean the dataBase before each test
	 * 
	 * @throws SQLException 
	 * @throws DatabaseUnitException 
	 */
	@Before
	public void cleanDB() throws DatabaseUnitException, SQLException {
 
	}
}
