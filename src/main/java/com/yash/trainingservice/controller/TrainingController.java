package com.yash.trainingservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.trainingservice.domain.Training;
import com.yash.trainingservice.payload.ApiResponse;
import com.yash.trainingservice.payload.ApiResponseData;
import com.yash.trainingservice.service.TrainingService;
import com.yash.trainingservice.serviceimpl.MapValidationErrorService;
import com.yash.trainingservice.serviceimpl.TrainingServiceimpl;

@RestController
@CrossOrigin
@RequestMapping("/api/trainings")
public class TrainingController {

	@Autowired
	public TrainingServiceimpl trainingServiceimpl;

	@Autowired
	public MapValidationErrorService mapValidationErrorService;

	@GetMapping("")
	public ResponseEntity<?> getAllTrainings() {
		Iterable<Training> trainings = trainingServiceimpl.list();
		return new ResponseEntity<>(trainings, HttpStatus.OK);
	}

	@GetMapping("/{trainingId}")
	public ResponseEntity<?> getTrainingById(@PathVariable long trainingId) {
		Optional<Training> training = trainingServiceimpl.findById(trainingId);
		return new ResponseEntity<>(training, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<?> createTraining(@RequestBody Training training, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		Training training1 = trainingServiceimpl.register(training);
		return new ResponseEntity<>(training1, HttpStatus.CREATED);
	}

	@DeleteMapping("/{trainingId}")
	public ResponseEntity<?> deleteTrainingById(@PathVariable Integer trainingId) {
		if (trainingId == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		trainingServiceimpl.delete(Integer.toUnsignedLong(trainingId));
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("")
	public ResponseEntity<?> UpdateUser(@RequestBody Training training, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		Training training1 = trainingServiceimpl.update(training);
		return new ResponseEntity<>(training1, HttpStatus.CREATED);
	}
}
