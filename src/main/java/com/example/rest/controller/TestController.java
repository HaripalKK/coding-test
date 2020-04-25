package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.RequestModel;
import com.example.model.ResponseModel;
import com.example.service.CalculatorService;

@RestController
@RequestMapping("/api")
public class TestController {

	@Autowired
	private CalculatorService calculatorService;

	@PostMapping("/add")
	public ResponseEntity<ResponseModel> add(@RequestBody RequestModel request) {
		String result;
		try {
			result = calculatorService.add(request.getX(), request.getY());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(new ResponseModel(result));
	}

	@PostMapping("/diff")
	public ResponseEntity<ResponseModel> diff(@RequestBody RequestModel request) {
		String result;
		try {
			result = calculatorService.diff(request.getX(), request.getY());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(new ResponseModel(result));
	}
}
