package com.bookmyflight.searchflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.searchflight.dao.ISearchFlightDao;
import com.bookmyflight.searchflight.dto.SearchFlghtInputDto;
import com.bookmyflight.searchflight.entity.FlightInfo;

@Service
public class SearchFlightService implements ISearchFlightService {

	@Autowired
	private ISearchFlightDao searchFlightDao;

	@Override
	public List<FlightInfo> searchFlightByUserInput(
			SearchFlghtInputDto searchFlightByInput) {

		List<FlightInfo> listOfFlight = searchFlightDao
				.searchFlightByUserInput(searchFlightByInput);
		return listOfFlight;

	}

}
