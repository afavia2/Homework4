package hw;

import hw.airline.Airline;
import hw.airport.Airport;
import hw.flight.Flight;
import hw.flight.RealFlightManager;

import java.util.Optional;

public class FlightManagerProxy implements FlightManager {

    private static FlightManager flight;

    @Override
    public void createFlight(String type, Airline airline, Airport origin, Airport destination) {
        System.out.println("A flight is being created.");

        if(flight == null) {
            flight = (FlightManager) new RealFlightManager();
        }

        flight.createFlight((String) type, (Airline) airline, (Airport) origin, (Airport) destination);
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        System.out.println("Flight number: " + flightNumber + " is being retrieved.");
        return flight.getFlightByFlightNumber(flightNumber);
    }
}
