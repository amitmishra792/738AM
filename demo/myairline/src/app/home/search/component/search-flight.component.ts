import { Component, ElementRef } from '@angular/core';
import { FormControl, FormBuilder, FormGroup, Validators } from '@angular/forms';

import { SearchFlight } from '../class/search-flight';
import { FlightInfo } from '../class/flight-info';
import { SearchFlightService } from '../service/search-flight.service';
import { SearchedFlightDataComponent } from '../component/searched-flight-data/searched-flight-data.component';
import { AUTOCOMPLETE_OPTION_HEIGHT } from '@angular/material';

@Component({
  selector: 'app-search-flight',
  templateUrl: './search-flight.component.html',
  styleUrls: ['./search-flight.component.css']
})
export class SearchFlightComponent {

  // Declaration of instance variable
  statusCode: number;
  allFlightDetails: FlightInfo[];
  private searchedFlightData: SearchedFlightDataComponent;

  searchUserForm = new FormGroup({
    source: new FormControl('', Validators.required),
    destination: new FormControl('', Validators.required),
    dateOfJourney: new FormControl('', Validators.required)
  });

  // Create constructor to get service instance
  constructor(private searchFlightService: SearchFlightService) {
  }

  // Handle Login User Here
  onSearchUserFormSubmit() {
    let source = '';
    let destination = '';
    let dateOfJourney = '';
    let searchFlight: SearchFlight;
    let resFlightAllDetails;
    this.searchedFlightData = new SearchedFlightDataComponent();


    source = this.searchUserForm.get('source').value.trim();
    destination = this.searchUserForm.get('destination').value.trim();
    dateOfJourney = (this.searchUserForm.get('dateOfJourney').value.trim());
    searchFlight = new SearchFlight(source, destination, dateOfJourney);

    resFlightAllDetails = this.searchFlightService.searchFlight(searchFlight).subscribe(
      data => this.allFlightDetails = data);
    this.searchedFlightData.getAllFlightInfoBySrchInput(resFlightAllDetails);
  }

}
