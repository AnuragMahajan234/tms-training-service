package com.yash.trainingservice.service;

import java.util.Optional;

import com.yash.trainingservice.domain.Training;

public interface TrainingService {
	
	public Training register(Training training);

	public void delete(long trainingId);

	public void delete(Training training);

	public Training update(Training training);

	public Iterable<Training> list();

	public Optional<Training> findById(long trainingId);
}
