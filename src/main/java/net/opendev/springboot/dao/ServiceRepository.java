package net.opendev.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.opendev.springboot.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Long>{

}
