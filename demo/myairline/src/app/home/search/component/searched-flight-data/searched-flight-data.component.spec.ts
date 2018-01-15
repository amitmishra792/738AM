import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchedFlightDataComponent } from './searched-flight-data.component';

describe('SearchedFlightDataComponent', () => {
  let component: SearchedFlightDataComponent;
  let fixture: ComponentFixture<SearchedFlightDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchedFlightDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchedFlightDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
