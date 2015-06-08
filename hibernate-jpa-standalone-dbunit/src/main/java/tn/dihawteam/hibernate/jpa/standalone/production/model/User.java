
package tn.dihawteam.hibernate.jpa.standalone.production.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author amine.berguiga
 *
 */
@Table(name = "users", schema="production")
@Entity
public class User extends UserFather implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Embedded
    private Address address;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + getName() + "]";
	}
	
	public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
	    
}
