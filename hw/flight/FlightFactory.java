package hw.flight;

import examples.vehicles.Truck;
import examples.vehicles.Vehicle;
import hw.airline.Airline;
import hw.airport.Airport;
import hw.exception.NullParameterException;

import javax.print.attribute.standard.Destination;
import java.util.HashMap;
import java.util.Map;

public class FlightFactory {

    private static Map<Airline, Airport> flightCache = new HashMap<>();

    private FlightFactory() {
    }

    public static Flight createFlight(Airline airline) {
        Flight newFlight = flightCache.computeIfAbsent(airline, newAirline -> {
            Airport newOrigin = new Airport();
            Airport newDestination = new Airport();
            return new Flight(newAirline, newOrigin, newDestination);
        });
        return newFlight;
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch (NullParameterException e) {
                return null;
            }
        }
        else if (type.equals("passangerFlight")) {
            try {
                return new PassangerFlight(airline, origin, destination);
            } catch (NullParameterException e) {
                return null;
            }
        }
        else {
            return null;
        }
    }


}
