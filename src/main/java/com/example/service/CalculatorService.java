package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
	public String add(String x, String y);

	public String diff(String x, String y);
}