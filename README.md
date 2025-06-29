# 🏎️ Formula 1 Simulator — Backend (Spring Boot)

This is the backend portion of a Formula 1 simulation project built with Java and Spring Boot. It simulates Formula 1 races based on driver and car performance and provides REST API endpoints for running simulations.

---

## 🔧 Technologies Used

- **Java 21**
- **Spring Boot**
- **Maven**
- **REST API**
- No database or frontend integration yet (planned)

---

## ✅ Current Features (v0.1)

- Basic simulation of a race using hardcoded data.
- Drivers and cars have performance attributes:
  - `Car`: speed, reliability, handling
  - `Driver`: skill
- Race result is determined by a simple performance score combining these attributes and a small amount of randomness.
- REST endpoint at `/simulate` returns the result of a race.

Example response:
```json
[
  "Max Verstappen 1 (Red Bull)",
  "Charles Leclerc 16 (Ferrari)",
  "George Russel 63 (Mercedes)",
  "Oscar Piastri 81 (McLaren)"
]
