package com.bookmyflight.searchflight.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookmyflight.searchflight.dto.SearchFlghtInputDto;
import com.bookmyflight.searchflight.entity.FlightInfo;

@Transactional
@Repository
public class SearchFlightDao implements ISearchFlightDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<FlightInfo> searchFlightByUserInput(
			SearchFlghtInputDto searchFlightByInput) {
		String hql = "FROM FlightInfo as fltInfo WHERE fltInfo.source = ? and fltInfo.destination = ?";

		List<FlightInfo> listOfFlight = entityManager.createQuery(hql)
				.setParameter(1, searchFlightByInput.getSource())
				.setParameter(2, searchFlightByInput.getDestination())
				.getResultList();

		System.out.println("List of flight : " + listOfFlight);
		return listOfFlight;
	}

}
