package com.yash.trainingservice.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.trainingservice.domain.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training,Long> {

	Optional<Training> findByTrainingId(long trainingId);
	
}
