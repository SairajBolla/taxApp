package com.abc.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.UserEntity;
import com.abc.service.IncomeTaxService;
import com.abc.service.UserService;

@RestController
@RequestMapping("v1/tax")
public class TaxCalculatorImpl implements TaxCalculator {

	@Autowired
	UserService userService;

	@Autowired
	IncomeTaxService incomeTaxService;

	@Override
	public ResponseEntity<Double> calculateTax(@PathParam(value = "userId") Long userId) {
		UserEntity userEntity;
		Double incomeTax = 0.0;
		if (userService.isUserIdExists(userId)) {
			try {
				userEntity = userService.fetchUserDetails(userId);
				incomeTax = incomeTaxService.computeIncomeTax(userEntity.getGrossSalary(), userEntity.getAge());
				return new ResponseEntity<Double>(incomeTax, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<Double>((Double) null, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} else {
			return new ResponseEntity<Double>(incomeTax, HttpStatus.OK);
		}

	}
}
