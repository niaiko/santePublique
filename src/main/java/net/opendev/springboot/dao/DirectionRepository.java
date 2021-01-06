package net.opendev.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.opendev.springboot.entities.Direction;

public interface DirectionRepository extends JpaRepository<Direction, Long>{

}
