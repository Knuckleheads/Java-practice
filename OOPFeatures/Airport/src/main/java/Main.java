import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        List<Flight> flightList = new ArrayList<>();

        Date dat0 = new Date();
        Date dat = new Date();
        dat.setTime(dat.getTime() + 1000*60*60*2);
        airport.getTerminals().stream().
                forEach(t1 -> t1.getFlights().stream()
                        .filter(flight -> flight.getDate().before(dat)
                        && flight.getDate().after(dat0)
                        && flight.getType().equals(Flight.Type.DEPARTURE)).
                        forEach(f -> flightList.add(f)));

        return flightList;
    }

}