package com.bookmyflight.searchflight.service;

import java.util.List;

import com.bookmyflight.searchflight.dto.SearchFlghtInputDto;
import com.bookmyflight.searchflight.entity.FlightInfo;

public interface ISearchFlightService {

	List<FlightInfo> searchFlightByUserInput(SearchFlghtInputDto searchFlightByInput);

}
