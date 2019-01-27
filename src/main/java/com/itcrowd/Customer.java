package com.itcrowd;
import javax.persistence.*;

@Entity
@Table (name = "CUSTOMER")
public class Customer {
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + "]";
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="second_name")
	private String second_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	
}
