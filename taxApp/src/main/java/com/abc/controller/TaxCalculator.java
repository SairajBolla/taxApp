package com.abc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TaxCalculator {

	@RequestMapping(value = "calculateTax/{userId}", produces = "application/json", method = RequestMethod.GET)
	default ResponseEntity<Double> calculateTax(@PathVariable("userId") Long userId) {
		return new ResponseEntity<Double>(HttpStatus.NOT_IMPLEMENTED);
	}
}
