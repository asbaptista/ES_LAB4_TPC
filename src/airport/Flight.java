package airport;

import java.util.Date;

public abstract class Flight {
    private String flightNumber;
    private String destination;
    private Date departureTime;
    private String gate;
    private double basePrice;

    private Airline airline;
    private Aircraft aircraft;

    public Flight(String flightNumber, String destination, Date departureTime, String gate, double basePrice, Airline airline, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.gate = gate;
        this.basePrice = basePrice;
        this.airline = airline;
        this.aircraft = aircraft;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public Date getDepartureTime() { return departureTime; }
    public String getGate() { return gate; }
    public double getBasePrice() { return basePrice; }
    public Airline getAirline() { return airline; }
    public Aircraft getAircraft() { return aircraft; }

    public abstract double calculateCost();
}