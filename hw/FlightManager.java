package hw;

import hw.airline.Airline;
import hw.airport.Airport;
import hw.flight.Flight;

import java.util.Optional;

public interface FlightManager {


    public void createFlight(String type, Airline airline, Airport origin, Airport destination);

    public Optional<Flight> getFlightByFlightNumber(String flightNumber);


}

/*
public final class FlightManager {

    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(flight);

        return flight.getFlightNumber();
    }


    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }





}
*/