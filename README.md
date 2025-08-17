# 🏎️ Formula 1 Simulator — Backend (Spring Boot)

This is the backend portion of a Formula 1 simulation project built with Java and Spring Boot. It simulates Formula 1 races based on driver, car, and team performance and provides REST API endpoints for managing championships and running simulations.

---

## 🔧 Technologies Used

- **Java 21**
- **Spring Boot**
- **Maven**
- **REST API**
- No database or frontend integration yet (planned)

---

## ✅ Current Features (v0.2)

### Championship Management
- Create a championship for a specific year with predefined drivers, teams, cars, and race schedules.
- Retrieve championship standings (drivers and teams) sorted by points.

### Race Simulation
- Simulate races one at a time or all races in a championship.
- Race results are determined by a performance score combining:
  - `Car`: speed, reliability, handling
  - `Driver`: skill, consistency
  - Random factor for unpredictability.
- Update driver and team standings after each race.
- Race results are returned in finishing order.

### REST API Endpoints
- **POST `/championship/create`**: Create a championship for a given year.
- **POST `/championship/{year}/next`**: Simulate the next race in the championship.
- **GET `/championship/{year}/standings`**: Retrieve driver and team standings for a championship year.

---

## 📦 Example API Responses

### Create Championship
**Request**:
```bash
curl -X POST "http://localhost:8080/championship/create?year=2025"

Championship for the year 2025 created successfully. 
Drivers: Max Verstappen, Charles Leclerc, George Russel, Oscar Piastri, ...
Teams: Red Bull, Ferrari, Mercedes, McLaren, ...
```

Simulate Next Race
**Request**:
```bash
curl -X POST "http://localhost:8080/championship/2025/next"
```

**Response**
```
Race: Australian Grand Prix Results:
Max Verstappen (1) - Position: 1
Charles Leclerc (16) - Position: 2
George Russel (63) - Position: 3
Oscar Piastri (81) - Position: 4
...

Driver Standings:
Max Verstappen: 25.0
Charles Leclerc: 18.0
George Russel: 15.0
Oscar Piastri: 12.0
...

Team Standings:
Red Bull: 25.0
Ferrari: 18.0
Mercedes: 15.0
McLaren: 12.0
...
```

Retrieve Standings
**Request**:
```bash
curl -X GET "http://localhost:8080/championship/2025/standings"
```

**Response**
```
Driver Standings:
Max Verstappen: 50.0
Charles Leclerc: 36.0
George Russel: 30.0
Oscar Piastri: 24.0
...

Team Standings:
Red Bull: 50.0
Ferrari: 36.0
Mercedes: 30.0
McLaren: 24.0
...
```

## 🚀 Planned Features
- Database integration for persistent storage of championships and results.
- Frontend interface for managing championships and viewing results.
- Advanced race simulation logic considering weather, pit stops, and tire strategies.