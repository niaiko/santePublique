package net.opendev.springboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Aquisition implements Serializable {
	@Id@GeneratedValue
	private Long idAquisition;
	private String mode;
	@ManyToOne
	@JoinColumn(name = "ID_AQU")
	private Affectation affectation;
	
public Aquisition() {
		super();
		// TODO Auto-generated constructor stub
	}

public Aquisition(String mode, Affectation affectation) {
	super();
	this.mode = mode;
	this.affectation = affectation;
}

public Long getIdAquisition() {
	return idAquisition;
}

public void setIdAquisition(Long idAquisition) {
	this.idAquisition = idAquisition;
}

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

public Affectation getAffectation() {
	return affectation;
}

public void setAffectation(Affectation affectation) {
	this.affectation = affectation;
}

	
}
