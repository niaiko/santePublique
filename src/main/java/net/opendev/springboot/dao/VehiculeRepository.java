package net.opendev.springboot.dao;




import org.springframework.data.jpa.repository.JpaRepository;

import net.opendev.springboot.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

}
//@Query("select e from Vehicule v where v.nomVehicule like :x")