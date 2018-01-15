import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Response, Headers, URLSearchParams, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { SearchFlight } from '../class/search-flight';
import { FlightInfo } from '../class/flight-info';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class SearchFlightService {

  searchFlightUrl = 'http://localhost:2019/search/searchFlightByUserInput';
  // searchFlightUrl= '';
  constructor(private http: Http) {
  }

  // Login User JSON Data Creation and Sent request to server done here
  searchFlight(searchFlight: SearchFlight): any {
    let cpHeaders: Headers;
    let options: RequestOptions;
    cpHeaders = new Headers({ 'Content-Type': 'application/json' });
    options = new RequestOptions({ headers: cpHeaders });
     return this.http.post(this.searchFlightUrl, searchFlight, options)
      .map(this.extractData);
  }

  private extractData(res: Response) {
    let body;
    body = res.json();
    return body;
  }

}
