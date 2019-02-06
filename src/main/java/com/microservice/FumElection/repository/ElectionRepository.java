package com.microservice.FumElection.repository;

import com.microservice.FumElection.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Integer> {
}
