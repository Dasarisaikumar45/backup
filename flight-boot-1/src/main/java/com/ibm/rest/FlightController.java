package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.Service.FlightService;
import com.ibm.entity.Flight;

@RestController
public class FlightController {
	@Autowired
	private FlightService s;

	@PostMapping(value = "/add", consumes = "application/json")
	public String save(@RequestBody Flight f) {
		int code = s.save(f);
		return "Flight added with code:" + code;
	}

	@GetMapping(value = "/get/{code}", produces = "application/json")
	public Flight fetch(int code) {
		return s.fetch(code);
	}

	@GetMapping(value = "/list", produces = "application/json")
	public List<Flight> list() {
		return s.list();
	}
	@DeleteMapping(value="/del/{code}")
	public String delete(@PathVariable int code) {
		s.remove(code);
		return "Flight deleted with code:"+ code;
	
	}
	@PutMapping(value="/update", consumes="application/json")
	public String update(@RequestBody Flight f) {
		s.update(f);
		return "Flight updated";
	}
	
	@GetMapping(value = "/findC/{carrier}")
	public String byCarrier(@PathVariable String carrier) {
		return "Flight finded by CARRIER"+carrier;
	}
	
	@GetMapping(value = "/findR/{source}{destination}")
	public String byRoute(@RequestBody Flight f) {
		return "Flight finded by ROUTE";
	}

}