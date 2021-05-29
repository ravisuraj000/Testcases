package com.airports;

import com.aiports.helpers.AirportType;


import java.nio.file.Files;
import java.nio.file.Paths;

public class NewFileDemo {
    public static void main(String[] args) throws Exception {
        long smallairports = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::smallAirports)
                .count();
        long mediumairports = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::mediumAirports)
                .count();
        long largeairports = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::largeAirports)
                .count();
        long heliports = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::heliports)
                .count();
        long closed = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::closed)
                .count();
        long seaplanebases = Files.readString(Paths.get("C:\\airportsdata\\airports.csv"))
                .lines()
                .filter(NewFileDemo::seaplaneBases)
                .count();
        System.out.println(smallairports);
        System.out.println(mediumairports);
        System.out.println(largeairports);
        System.out.println(heliports);
        System.out.println(closed);
        System.out.println(seaplanebases);
    }

    public static boolean smallAirports(String airport) {
        return airport.contains(AirportType.small_airport.name());
    }

    public static boolean largeAirports(String airport) {
        return airport.contains(AirportType.large_airport.name());
    }

    public static boolean heliports(String airport) {
        return airport.contains(AirportType.heliport.name());
    }

    public static boolean closed(String airport) {
        return airport.contains(AirportType.closed.name());
    }

    public static boolean seaplaneBases(String airport) {
        return airport.contains(AirportType.seaplane_base.name());
    }

    public static boolean mediumAirports(String airport) {
        return airport.contains(AirportType.seaplane_base.name());
    }


}
