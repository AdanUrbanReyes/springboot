package com.ayan.demos.autonomoustransactionprocessing.repositories;

import com.ayan.demos.autonomoustransactionprocessing.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Short> {
}
