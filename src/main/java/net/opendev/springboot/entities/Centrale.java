package net.opendev.springboot.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CENTRALE")
public class Centrale extends Direction{

	public Centrale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centrale(String nomDirection) {
		super(nomDirection);
		// TODO Auto-generated constructor stub
	}

	

}
