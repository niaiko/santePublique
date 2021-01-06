package net.opendev.springboot.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CONDANATION")
public class Condanation extends Affectation{

	public Condanation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condanation(Date dateAffectation, Direction direction, Service service) {
		super(dateAffectation, direction, service);
		// TODO Auto-generated constructor stub
	}

	
}
