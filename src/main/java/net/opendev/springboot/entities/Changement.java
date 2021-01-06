package net.opendev.springboot.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHANGEMENT_DETENTEUR")
public class Changement extends Affectation {

	public Changement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Changement(Date dateAffectation, Direction direction, Service service) {
		super(dateAffectation, direction, service);
		// TODO Auto-generated constructor stub
	}

	
}
