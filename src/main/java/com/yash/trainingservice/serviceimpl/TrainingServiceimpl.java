package com.yash.trainingservice.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.trainingservice.domain.Training;
import com.yash.trainingservice.repository.TrainingRepository;
import com.yash.trainingservice.service.TrainingService;

@Service
public class TrainingServiceimpl implements TrainingService{

	@Autowired
	private TrainingRepository trainingRepository;
	
	@Override
	public Training register(Training training) {
		return trainingRepository.save(training);
	}

	@Override
	public void delete(long trainingId) {
		trainingRepository.deleteById(trainingId);
	}

	@Override
	public void delete(Training training) {
		trainingRepository.delete(training);		
	}

	@Override
	public Training update(Training training) {
		return trainingRepository.save(training);
	}

	@Override
	public Iterable<Training> list() {
		return trainingRepository.findAll();
	}

	@Override
	public Optional<Training> findById(long trainingId) {
		return trainingRepository.findByTrainingId(trainingId);
	}

}
