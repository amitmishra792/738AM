package com.bookmyflight.searchflight.dao;

import java.util.List;

import com.bookmyflight.searchflight.dto.SearchFlghtInputDto;
import com.bookmyflight.searchflight.entity.FlightInfo;

public interface ISearchFlightDao {

	  List<FlightInfo> searchFlightByUserInput(SearchFlghtInputDto searchFlightByInput);

}
