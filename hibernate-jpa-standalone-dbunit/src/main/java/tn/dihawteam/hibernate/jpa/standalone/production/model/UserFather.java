package tn.dihawteam.hibernate.jpa.standalone.production.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author amine.berguiga
 * MappedSuperclass: 
 * A MappedSuperclass cannot be annotated with @Entity\@Table. It is not a class that will be 
 * persisted. Its attributes/methods will be reflected in its child classes.
 */
@MappedSuperclass// to share methods/attributes between classes
public abstract class UserFather {
	
	
	@Column(name = "name", nullable = false, unique=false, length=50)
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
