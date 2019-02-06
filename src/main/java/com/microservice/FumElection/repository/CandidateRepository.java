package com.microservice.FumElection.repository;

import com.microservice.FumElection.model.Candidate;
import com.microservice.FumElection.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    public List<Candidate> findByElectionsIn(Election election);
}
