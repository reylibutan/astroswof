package com.reylibutan.astroswof.schedule.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reylibutan.astroswof.schedule.api.entity.Engineer;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer, Long> {

}
