package net.opendev.springboot.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("REGIONALE")
public class Regionale extends Direction{

	public Regionale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Regionale(String nomDirection) {
		super(nomDirection);
		// TODO Auto-generated constructor stub
	}

}
