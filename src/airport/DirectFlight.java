package airport;

import java.util.Date;

public class DirectFlight extends Flight {

    public DirectFlight(String flightNumber, String destination, Date departureTime, String gate, double basePrice, Airline airline, Aircraft aircraft) {
        super(flightNumber, destination, departureTime, gate, basePrice, airline, aircraft);
    }

    @Override
    public double calculateCost() {
        return 0.0;
    }
}