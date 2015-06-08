
package tn.dihawteam.hibernate.jpa.standalone.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tn.dihawteam.hibernate.jpa.standalone.production.model.UserFather;


@Table(name = "users", schema="test")
@Entity
public class UserTest extends UserFather implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	


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
}
