package hw.flight;

import hw.FlightManager;
import hw.airline.Airline;
import hw.airport.Airport;

import java.util.Optional;


public class RealFlightManager implements FlightManager {

    private static FlightManager flight;

    @Override
    public void createFlight(String type, Airline airline, Airport origin, Airport destination) {
        flight.createFlight((String) type, (Airline) airline, (Airport) origin, (Airport) destination);
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flight.getFlightByFlightNumber(flightNumber);
    }
}
