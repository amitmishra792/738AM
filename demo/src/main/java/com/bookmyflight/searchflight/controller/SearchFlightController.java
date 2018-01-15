package com.bookmyflight.searchflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.bookmyflight.searchflight.dto.SearchFlghtInputDto;
import com.bookmyflight.searchflight.entity.FlightInfo;
import com.bookmyflight.searchflight.service.ISearchFlightService;

@Controller
@RequestMapping("search")
@CrossOrigin(origins = { "http://localhost:4200" })
public class SearchFlightController {
	
	@Autowired
	  private ISearchFlightService searchFlightService;

	@PostMapping("searchFlightByUserInput")
	public ResponseEntity<List<FlightInfo>> searchFlightByUserInput(
			@RequestBody SearchFlghtInputDto searchFlightByInput,
			UriComponentsBuilder builder) {

		System.out.println("Search Flight Source : "
				+ searchFlightByInput.getSource());
		System.out.println("Search Flight Destination : "
				+ searchFlightByInput.getDestination());
		System.out.println("Search Flight Date : "
				+ searchFlightByInput.getDateOfJourney());

		List<FlightInfo> listOfFlight = this.searchFlightService
				.searchFlightByUserInput(searchFlightByInput);
		
		return new ResponseEntity<List<FlightInfo>>(listOfFlight, HttpStatus.OK);
	}
}
