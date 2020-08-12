package com.springboot.jetkins.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="playground")
public class Employee {
	
	private int equip_id;
	private	String type;
	private String color;
	private String location;
	
	public Employee() {
		
	}
	public Employee(String type, String color, String location) {
		this.type = type;
		this.color= color;
		this.location = location;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEquip_id() {
		return equip_id;
	}
	public void setEquip_id(int equip_id) {
		this.equip_id = equip_id;
	}
	
	@Column(name="type", nullable=false)
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="color",nullable=false)
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Column(name="location", nullable=false)
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	  public String toString() {
	        return "Employee [id=" + equip_id + ", type=" + type + ", color=" + color + ", location=" + location
	       + "]";
	   }
	
}
