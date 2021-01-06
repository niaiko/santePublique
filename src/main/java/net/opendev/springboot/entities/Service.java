package net.opendev.springboot.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Service implements Serializable{
	@Id@GeneratedValue
	private Long codeService;
	private String nomService;
	@ManyToOne
	@JoinColumn(name = "CODE_SER")
	private Direction direction;
	@OneToMany(mappedBy = "service",fetch = FetchType.LAZY)
	private Collection<Vehicule> vehicules;
	@OneToMany(mappedBy = "service",fetch = FetchType.LAZY)
	private Collection<Affectation> affectations;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String nomService, Direction direction) {
		super();
		this.nomService = nomService;
		this.direction = direction;
	}
	public Long getCodeService() {
		return codeService;
	}
	public void setCodeService(Long codeService) {
		this.codeService = codeService;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Collection<Affectation> getAffectations() {
		return affectations;
	}
	public void setAffectations(Collection<Affectation> affectations) {
		this.affectations = affectations;
	}


}
