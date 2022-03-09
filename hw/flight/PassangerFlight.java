package hw.flight;

import hw.airline.Airline;
import hw.airport.Airport;
import hw.exception.NullParameterException;

import java.util.*;

public class PassangerFlight implements Flight{
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;
    private PassangerFlight passangerCapacity;

    public PassangerFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
        setPassangerCapacity();
    }

    private void setPassangerCapacity() throws NullParameterException {
        if (passangerCapacity == null) {
            throw new NullParameterException("Passanger Capacity cannot be null. ");
        }
        this.passangerCapacity = passangerCapacity;
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 05, 05, 13, 30);
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setAirline(Airline airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() {
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    public String getPassangerCapacity() { return passangerCapacity.toString();}




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassangerFlight passangerFlight = (PassangerFlight) o;
        return Objects.equals(airline, passangerFlight.airline) &&
                Objects.equals(origin, passangerFlight.origin) &&
                Objects.equals(destination, passangerFlight.destination) &&
                Objects.equals(flightNumber, passangerFlight.flightNumber) &&
                Objects.equals(departureTime, passangerFlight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }
}
