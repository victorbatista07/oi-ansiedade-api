package br.com.oiansiedade.oiansiedade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique=true)
    private String username;

    public User() {}
    
    public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

}
