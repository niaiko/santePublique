package net.opendev.springboot.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",
discriminatorType = DiscriminatorType.STRING,length = 50)
public abstract class Affectation implements Serializable{
	@Id@GeneratedValue
	private Long idAffectation;
	private Date DateAffectation;
	@ManyToOne
	@JoinColumn(name = "ID_AFFD")
	private Direction direction;
	@ManyToOne
	@JoinColumn(name = "ID_AFFS")
	private Service service;
	@OneToMany(mappedBy = "affectation",fetch = FetchType.LAZY)
	private Collection<Aquisition> aquisitions;

public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}

public Affectation(Date dateAffectation, Direction direction, Service service) {
	super();
	DateAffectation = dateAffectation;
	this.direction = direction;
	this.service = service;
}

public Long getIdAffectation() {
	return idAffectation;
}

public void setIdAffectation(Long idAffectation) {
	this.idAffectation = idAffectation;
}

public Date getDateAffectation() {
	return DateAffectation;
}

public void setDateAffectation(Date dateAffectation) {
	DateAffectation = dateAffectation;
}

public Direction getDirection() {
	return direction;
}

public void setDirection(Direction direction) {
	this.direction = direction;
}

public Service getService() {
	return service;
}

public void setService(Service service) {
	this.service = service;
}

public Collection<Aquisition> getAquisitions() {
	return aquisitions;
}

public void setAquisitions(Collection<Aquisition> aquisitions) {
	this.aquisitions = aquisitions;
}


}
