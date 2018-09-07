package com.stone.manor.mapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stone.manor.data.SupportedOperations;

@RestController
@RequestMapping(value = "/")
@EnableWebMvc
public class SampleAsAService {
	private static final String MSG = "{\"message\": \"%s\"}";

	@RequestMapping(value = "/version", method = RequestMethod.GET)
	public ResponseEntity<String> getVersion() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body("Version 1.0.0");
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

	@RequestMapping(value = "/operations", method = RequestMethod.GET)
	public ResponseEntity<?> getOperations() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(SupportedOperations.getSupportedOperations());
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

	@RequestMapping(value = "/anyway/{company}/{person}", method = RequestMethod.GET)
	public ResponseEntity<?> getWorkDetails(@PathVariable("company") String company,
			@PathVariable("person") String person) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(String.format(MSG, person + " is from " + company));
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

	@RequestMapping(value = "/bday/{name}/{from}", method = RequestMethod.GET)
	public ResponseEntity<?> getBdayWishes(@PathVariable("name") String name, @PathVariable("from") String from) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
					.body(String.format(MSG, "Happy Birthday " + name + " - From, " + from));
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

	@RequestMapping(value = "/bm/{name}/{from}", method = RequestMethod.GET)
	public ResponseEntity<?> getAppreciation(@PathVariable("name") String name, @PathVariable("from") String from) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
					.body(String.format(MSG, "I truly appreciate you, " + name + " - From, " + from));
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

}
