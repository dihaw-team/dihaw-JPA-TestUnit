package tn.dihawteam.hibernate.jpa.standalone.production.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address {

	
    @Column(name = "house_address")
    private String address;
    @Column(name = "house_color")
    private String color;
    @Column(name = "house_number")
    private int number;
    
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
    
    
    
    
    
}
