package com.microservice.FumElection.repository;

import com.microservice.FumElection.model.Election;
import com.microservice.FumElection.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotesRepository extends JpaRepository<Vote, Integer> {
//    Vote findByElectionAndUserId(Election e, int userId);
    Vote findByElectionAndUserEmail(Election e, String userEmail);
}
