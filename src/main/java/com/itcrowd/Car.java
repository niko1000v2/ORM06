package com.itcrowd;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name = "CAR")

public class Car {
	

	@Override
	public String toString() {
		return "Car [id=" + id + ", creation_date=" + creation_date + ", name=" + name + ", model=" + model
				+ ", registration=" + registration + ", available=" + available + "]";
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="creation_date",
			unique=false,
			nullable=false,
			insertable=true,
			updatable=false)
	@Temporal(TemporalType.DATE)
	private Date creation_date;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="model")
	private String model;
	
	@Column(name="registration")
	private String registration;
	
	@Column(name="available")
	private boolean available;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Date getCreationDate() {
		return creation_date;
	}

	public void setCreationDate() {
		Date data = new Date();
		this.creation_date = data;
	}
	
		
	
}
