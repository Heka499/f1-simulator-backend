package com.example.f1simulator.service;

import com.example.f1simulator.model.Driver;
import com.example.f1simulator.model.DriverStats;
import com.example.f1simulator.model.Team;
import com.example.f1simulator.model.TeamStats;
import com.example.f1simulator.model.Championship;
import com.example.f1simulator.model.Car;
import com.example.f1simulator.model.Race;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class ChampionshipService {

    public ArrayList<Race> createRaceSchedule() {
        ArrayList<Race> races = new ArrayList<>();

        races.add(new Race("Australian Grand Prix", "Albert Park Circuit", "Melbourne", 58, 5.278));
        races.add(new Race("Chinese Grand Prix", "Shanghai International Circuit", "Shanghai", 56, 5.451));
        races.add(new Race("Japanese Grand Prix", "Suzuka Circuit", "Suzuka", 53, 5.807));
        races.add(new Race("Bahrain Grand Prix", "Bahrain International Circuit", "Sakhir", 57, 5.412));
        races.add(new Race("Saudi Arabian Grand Prix", "Jeddah Corniche Circuit", "Jeddah", 50, 6.174));
        races.add(new Race("Miami Grand Prix", "Miami International Autodrome", "Miami Gardens, Florida", 57, 5.412));
        races.add(new Race("Emilia Romagna Grand Prix", "Imola Circuit", "Imola", 63, 4.909));
        races.add(new Race("Monaco Grand Prix", "Circuit de Monaco", "Monaco", 78, 3.337));
        races.add(new Race("Spanish Grand Prix", "Circuit de Barcelona-Catalunya", "Montmeló", 66, 4.675));
        races.add(new Race("Canadian Grand Prix", "Circuit Gilles Villeneuve", "Montreal", 70, 4.361));
        races.add(new Race("Austrian Grand Prix", "Red Bull Ring", "Spielberg", 71, 4.318));
        races.add(new Race("British Grand Prix", "Silverstone Circuit", "Silverstone", 52, 5.891));
        races.add(new Race("Belgian Grand Prix", "Circuit de Spa-Francorchamps", "Stavelot", 44, 7.004));
        races.add(new Race("Hungarian Grand Prix", "Hungaroring", "Mogyoród", 70, 4.381));
        races.add(new Race("Dutch Grand Prix", "Circuit Zandvoort", "Zandvoort", 72, 4.259));
        races.add(new Race("Italian Grand Prix", "Monza Circuit", "Monza", 53, 5.793));
        races.add(new Race("Azerbaijan Grand Prix", "Baku City Circuit", "Baku", 51, 6.003));
        races.add(new Race("Singapore Grand Prix", "Marina Bay Street Circuit", "Singapore", 61, 5.063));
        races.add(new Race("United States Grand Prix", "Circuit of the Americas", "Austin, Texas", 56, 5.513));
        races.add(new Race("Mexico City Grand Prix", "Autódromo Hermanos Rodríguez", "Mexico City", 71, 4.304));
        races.add(new Race("São Paulo Grand Prix", "Interlagos Circuit", "São Paulo", 71, 4.309));
        races.add(new Race("Las Vegas Grand Prix", "Las Vegas Strip Circuit", "Paradise, Nevada", 50, 6.120));
        races.add(new Race("Qatar Grand Prix", "Lusail International Circuit", "Lusail", 57, 5.419));
        races.add(new Race("Abu Dhabi Grand Prix", "Yas Marina Circuit", "Abu Dhabi", 58, 5.554));

        return races;
    }

    public Championship createChampionship(int year) {
        // Define drivers
        ArrayList<Driver> drivers = new ArrayList<>();
        // Alpine
        drivers.add(new Driver("Franco Colapinto", 43, 80.0, 75.0));
        drivers.add(new Driver("Pierre Gasly", 10, 85.0, 80.0));
        // Aston Martin
        drivers.add((new Driver("Fernando Alonso", 14, 90.0, 85.0)));
        drivers.add(new Driver("Lance Stroll", 18, 75.0, 70.0));
        // Ferrari
        drivers.add(new Driver("Charles Leclerc", 16, 95.0, 94.0));
        drivers.add(new Driver("Lewis Hamilton", 44, 92.0, 90.0));
        // Haas
        drivers.add(new Driver("Esteban Ocon", 31, 80.0, 75.0));
        drivers.add(new Driver("Oliver Bearman", 87, 70.0, 65.0));
        // McLaren
        drivers.add(new Driver("Lando Norris", 4, 92.0, 85.0));
        drivers.add(new Driver("Oscar Piastri", 81, 90.0, 93.0));
        // Mercedes
        drivers.add(new Driver("Kimi Antonelli", 12, 80.0, 70.0));
        drivers.add(new Driver("George Russel", 63, 94.0, 94.0));
        // Racing Bulls
        drivers.add(new Driver("Isack Hadjar", 6, 85.0, 80.0));
        drivers.add(new Driver("Liam Lawson", 30, 80.0, 75.0));
        // Red Bull
        drivers.add(new Driver("Max Verstappen", 1, 100.0, 98.0));
        drivers.add(new Driver("Yuki Tsunoda", 22, 80.0, 75.0));
        // Sauber
        drivers.add(new Driver("Gabriel Bortoleto", 5, 85.0, 80.0));
        drivers.add(new Driver("Nico Hülkenberg", 27, 87.0, 75.0));
        // Williams
        drivers.add(new Driver("Alexander Albon", 23, 80.0, 80.0));
        drivers.add(new Driver("Carlos Sainz", 55, 85.0, 75.0));

        // Define cars
        Car alpineCar = new Car("A525", 80.0, 75.0, 70.0);
        Car astonMartinCar = new Car("AMR25", 85.0, 80.0, 75.0);
        Car ferrariCar = new Car("SF-25", 90.0, 85.0, 80.0);
        Car haasCar = new Car("VF-25", 75.0, 70.0, 65.0);
        Car mclarenCar = new Car("MCL39", 100.0, 95.0, 90.0);
        Car mercedesCar = new Car("F1 W16", 90.0, 90.0, 85.0);
        Car racingBullCar = new Car("VCARB 02", 85.0, 80.0, 85.0);
        Car redBullCar = new Car("RB21", 90.0, 95.0, 75.0);
        Car sauberCar = new Car("C45", 80.0, 75.0, 70.0);
        Car williamsCar = new Car("FW47", 75.0, 70.0, 65.0);

        // Define teams
        ArrayList<Team> teams = new ArrayList<>();
        Team alpine = new Team("Alpine", alpineCar);
        alpine.addDriver(drivers.get(0)); // Franco Colapinto
        alpine.addDriver(drivers.get(1)); // Pierre Gasly
        teams.add(alpine);

        Team astonMartin = new Team("Aston Martin", astonMartinCar);
        astonMartin.addDriver(drivers.get(2)); // Fernando Alonso
        astonMartin.addDriver(drivers.get(3)); // Lance Stroll
        teams.add(astonMartin);

        Team ferrari = new Team("Ferrari", ferrariCar);
        ferrari.addDriver(drivers.get(4)); // Charles Leclerc
        ferrari.addDriver(drivers.get(5)); // Lewis Hamilton
        teams.add(ferrari);

        Team haas = new Team("Haas", haasCar);
        haas.addDriver(drivers.get(6)); // Esteban Ocon
        haas.addDriver(drivers.get(7)); // Oliver Bearman
        teams.add(haas);

        Team mclaren = new Team("McLaren", mclarenCar);
        mclaren.addDriver(drivers.get(8)); // Lando Norris
        mclaren.addDriver(drivers.get(9)); // Oscar Piastri
        teams.add(mclaren);

        Team mercedes = new Team("Mercedes", mercedesCar);
        mercedes.addDriver(drivers.get(10)); // Kimi Antonelli
        mercedes.addDriver(drivers.get(11)); // George Russel
        teams.add(mercedes);

        Team racingBull = new Team("Racing Bulls", racingBullCar);
        racingBull.addDriver(drivers.get(12)); // Isack Hadjar
        racingBull.addDriver(drivers.get(13)); // Liam Lawson
        teams.add(racingBull);

        Team redBull = new Team("Red Bull", redBullCar);
        redBull.addDriver(drivers.get(14)); // Max Verstappen
        redBull.addDriver(drivers.get(15)); // Yuki Tsunoda
        teams.add(redBull);

        Team sauber = new Team("Sauber", sauberCar);
        sauber.addDriver(drivers.get(16)); // Gabriel Bortoleto
        sauber.addDriver(drivers.get(17)); // Nico Hülkenberg
        teams.add(sauber);

        Team williams = new Team("Williams", williamsCar);
        williams.addDriver(drivers.get(18)); // Alexander Albon
        williams.addDriver(drivers.get(19)); // Carlos Sainz
        teams.add(williams);

        // Create Championship

        return new Championship(2025, drivers, teams, createRaceSchedule());
    }
}
