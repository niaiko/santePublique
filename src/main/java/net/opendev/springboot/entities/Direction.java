package net.opendev.springboot.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DIRECT",
discriminatorType = DiscriminatorType.STRING,length = 50)
public abstract class Direction implements Serializable {
	@Id@GeneratedValue
	private Long CodeDirection;
	private String nomDirection;
	@OneToMany(mappedBy = "direction",fetch = FetchType.LAZY)
	private Collection<Vehicule> vehicules;
	@OneToMany(mappedBy = "direction",fetch = FetchType.LAZY)
	private Collection<Service> services;
	@OneToMany(mappedBy = "direction",fetch = FetchType.LAZY)
	private Collection<Affectation> affectations;
	

public Direction() {
		super();
		// TODO Auto-generated constructor stub
	}

public Direction(String nomDirection) {
	super();
	this.nomDirection = nomDirection;
}

public Long getCodeDirection() {
	return CodeDirection;
}

public void setCodeDirection(Long codeDirection) {
	CodeDirection = codeDirection;
}

public String getNomDirection() {
	return nomDirection;
}

public void setNomDirection(String nomDirection) {
	this.nomDirection = nomDirection;
}

public Collection<Vehicule> getVehicules() {
	return vehicules;
}

public void setVehicules(Collection<Vehicule> vehicules) {
	this.vehicules = vehicules;
}

public Collection<Service> getServices() {
	return services;
}

public void setServices(Collection<Service> services) {
	this.services = services;
}

public Collection<Affectation> getAffectations() {
	return affectations;
}

public void setAffectations(Collection<Affectation> affectations) {
	this.affectations = affectations;
}



}
