package hw;

import hw.exception.BadParameterException;
import hw.exception.NullParameterException;
import hw.flight.Flight;
import hw.airline.Airline;
import hw.airport.Airport;
import hw.flight.FlightFactory;

public class Main {
    public static void main(String[] args) throws BadParameterException, NullParameterException {

        Flight flight = new Flight() {
            @Override
            public String getFlightNumber() {
                return null;
            }
        };

        FlightManager flightManager = new FlightManagerProxy();

        flightManager.createFlight(flight);


    }
}
