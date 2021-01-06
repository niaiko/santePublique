package net.opendev.springboot.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Vehicule implements Serializable{
	@Id@GeneratedValue
	private Long id;
	private String nomVehicule;
	private String couleur;
	private Date dateArrive;
	private String type;
	private String numCarteGris;
	private String numMatricule;
	private int nombrePlace;
	@ManyToOne
	@JoinColumn(name = "ID_VD")
	private Direction direction;
	@ManyToOne
	@JoinColumn(name = "ID_VS")
	private Service service;
public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

public Vehicule(String nomVehicule, String couleur, Date dateArrive, String type, String numCarteGris,
		String numMatricule, int nombrePlace,Direction direction,Service service) {
	super();
	this.nomVehicule = nomVehicule;
	this.couleur = couleur;
	this.dateArrive = dateArrive;
	this.type = type;
	this.numCarteGris = numCarteGris;
	this.numMatricule = numMatricule;
	this.nombrePlace = nombrePlace;
	this.direction = direction;
	this.service = service;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNomVehicule() {
	return nomVehicule;
}

public void setNomVehicule(String nomVehicule) {
	this.nomVehicule = nomVehicule;
}

public String getCouleur() {
	return couleur;
}

public void setCouleur(String couleur) {
	this.couleur = couleur;
}

public Date getDateArrive() {
	return dateArrive;
}

public void setDateArrive(Date dateArrive) {
	this.dateArrive = dateArrive;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getNumCarteGris() {
	return numCarteGris;
}

public void setNumCarteGris(String numCarteGris) {
	this.numCarteGris = numCarteGris;
}

public String getNumMatricule() {
	return numMatricule;
}

public void setNumMatricule(String numMatricule) {
	this.numMatricule = numMatricule;
}

public int getNombrePlace() {
	return nombrePlace;
}

public void setNombrePlace(int nombrePlace) {
	this.nombrePlace = nombrePlace;
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



	
}
