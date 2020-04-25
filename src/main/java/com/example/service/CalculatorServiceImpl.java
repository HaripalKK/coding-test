package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String add(String x, String y) {
		int sum = Integer.parseInt(x) + Integer.parseInt(y);
		String result = Integer.toString(sum);
		return result;
	}

	@Override
	public String diff(String x, String y) {
		int diff = Integer.parseInt(x) - Integer.parseInt(y);
		String result = Integer.toString(diff);
		return result;
	}

}
