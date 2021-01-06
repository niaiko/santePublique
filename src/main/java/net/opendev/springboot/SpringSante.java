package net.opendev.springboot;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.opendev.springboot.dao.AffectationRepository;
import net.opendev.springboot.dao.AquisitionRepository;
import net.opendev.springboot.dao.DirectionRepository;
import net.opendev.springboot.dao.ServiceRepository;
import net.opendev.springboot.dao.VehiculeRepository;
import net.opendev.springboot.entities.Affectation;
import net.opendev.springboot.entities.Aquisition;
import net.opendev.springboot.entities.Centrale;
import net.opendev.springboot.entities.Changement;
import net.opendev.springboot.entities.Condanation;
import net.opendev.springboot.entities.Direction;
import net.opendev.springboot.entities.Regionale;
import net.opendev.springboot.entities.Service;
import net.opendev.springboot.entities.Vehicule;

@SpringBootApplication
public class SpringSante implements CommandLineRunner {
	@Autowired
	private DirectionRepository directionRepository;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private VehiculeRepository vehiculeRepository; 
	@Autowired
	private AffectationRepository affectationRepository;
	@Autowired
	private AquisitionRepository aquisitionRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringSante.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Direction d1=directionRepository.save(new Regionale("ANALAMANGA"));
		Direction d2=directionRepository.save(new Centrale("ATSINANANA"));
		Direction d3=directionRepository.save(new Centrale("AMORON MANIA"));
		Direction d4=directionRepository.save(new Centrale("SAVA"));
		
		Service s1=serviceRepository.save(new Service("INFORMATIQUE", d1));
		Service s2=serviceRepository.save(new Service("LABORATOIRE", d2));
		Service s3=serviceRepository.save(new Service("RESSOURCE HUMAIN", d3));
		Service s4=serviceRepository.save(new Service("PHARMACIE", d4));
		
		vehiculeRepository.save(
				new Vehicule("Q7", "Blanc", new Date(), "4*4", "2585GTH69", "2020 TBL", 9, d1, s1));
		vehiculeRepository.save(
				new Vehicule("Sprinter312", "Rouge", new Date(), "MiniBus", "9874JIY45", "5854 TAH", 14, d2, s2));
		
		vehiculeRepository.save(
				new Vehicule("Q7", "Blanc", new Date(), "4*4", "2585GTH69", "2020 TBL", 9, d3, s3));
		vehiculeRepository.save(
				new Vehicule("Sprinter416", "Rouge", new Date(), "MiniBus", "9874JIY45", "5854 TAH", 14, d4, s4));
		vehiculeRepository.save(
				new Vehicule("Q7", "Blanc", new Date(), "4*4", "2585GTH69", "2020 TBL", 9, d1, s3));
		vehiculeRepository.save(
				new Vehicule("Sprinter312", "Rouge", new Date(), "MiniBus", "9874JIY45", "5854 TAH", 14, d3, s1));
		
		
		Affectation aff1=affectationRepository.save(new Changement(new Date(), d4, s2));
		Affectation aff2=affectationRepository.save(new Condanation(new Date(), d3, s1));
		
		
		aquisitionRepository.save(new Aquisition("DON", aff1));
		aquisitionRepository.save(new Aquisition("BUDGE ETAT", aff2));
		
	}

}
