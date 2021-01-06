package net.opendev.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.opendev.springboot.entities.Affectation;

public interface AffectationRepository extends JpaRepository<Affectation, Long>{

}
