package tn.dihawteam.hibernate.jpa.standalone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author amine.berguiga
 *
 *	Creating one EntityManagerFactory by application
 *When controlling database transactions programmatically one EntityManagerFactory per application is usually
  used. This is the optimal approach since loading an EntityManagerFactory has a high performance cost; JPA will
  analyze the database, validate entities and perform several other tasks when creating a new EntityManagerFactory.
  Thus it is unviable to create a new EntityManagerFactory per transaction.
  
  see Book : Java Persistence APJava Persistence APMini Book Mini Book. 
 *
 *
 *In other word this class will create "Singleton" Entity Manager ;)
 */


public abstract class ConnectionFactory {
	
	private static EntityManagerFactory entityManagerFactory;

		
	
	   private ConnectionFactory() {
	   }
	   
	   public static EntityManager getEntityManager(){
	        if (entityManagerFactory == null){
	            entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
	        }

	        return entityManagerFactory.createEntityManager();
	    }
	   
	   

}
