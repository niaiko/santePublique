package net.opendev.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.opendev.springboot.entities.Aquisition;

public interface AquisitionRepository extends JpaRepository<Aquisition, Long>{

}
