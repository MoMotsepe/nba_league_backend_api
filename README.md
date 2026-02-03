# nba_league_backend_api
NBA League Backend API. This project is a Spring Boot REST API designed to manage NBA league player data. It provides endpoints to create, retrieve, update, delete, and filter players stored in a PostgreSQL database.  This backend is intended to serve as the data layer for a future frontend application, following a clean layered architecture.
---

## Features

- RESTful API built with Spring Boot
- PostgreSQL database integration using Spring Data JPA
- CRUD operations for players
- Filtering players by:
  - Name
  - Team
  - Position
  - Nation
  - Team and position combined
- Clean separation of concerns:
  - Controller
  - Service
  - Repository
  - Entity

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven

---

## Project Structure

src/main/java
└── com.example.nbaleague
├── player
│ ├── Player.java
│ ├── PlayerRepository.java
│ ├── PlayerService.java
│ └── PlayerController.java
└── NbaLeagueApplication.java


---

## API Endpoints

Base URL:


/api/v11/player


### Get all players


GET /api/v11/player


### Filter players


GET /api/v1/player?team=Lakers
GET /api/v1/player?name=LeBron
GET /api/v1/player?position=SG
GET /api/v1/player?nation=USA
GET /api/v1/player?team=Lakers&position=SF


### Add a new player


POST /api/v1/player


Request body:
```json
{
  "name": "LeBron James",
  "nation": "USA",
  "pos": "SF",
  "age": 39,
  "team": "Lakers"
}

Update a player
PUT /api/v1/player

Delete a player
DELETE /api/v1/player/{playerName}

Database Configuration

The application uses PostgreSQL.

Example configuration (do not commit secrets):

spring.datasource.url=jdbc:postgresql://localhost:5432/nba_data
spring.datasource.username=postgres
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update

How to Run

Clone the repository

Create a PostgreSQL database

Set environment variables for DB credentials

Run the application:

mvn spring-boot:run


The API will start on:

http://localhost:8080

Future Improvements

Frontend integration (React)

User authentication and authorization

Pagination and sorting

Validation and error handling

Performance optimizations

Author

Disi Motsepe
BSc Information Technology
Spring Boot Backend Developer
