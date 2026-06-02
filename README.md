# NBA Stats WebApp

A REST API built with Java and Spring Boot that allows users to search 
for NBA players and retrieve their information using the balldontlie.io API.

## Tech Stack
- Java 21
- HTTP
- JavaScript
- Spring Boot
- Maven
- highlightly.net API

## Endpoints
### Get Player Info
GET /player?name={playerName}

Returns player information including name, position, height, 
weight, college, jersey number, and team.

### Example
GET /player?name=lebron

## What I Learned
- How to build a REST API with Spring Boot
- How to call external APIs using RestTemplate
- How to deserialize JSON responses into Java objects using Jackson
- How to handle errors gracefully with a GlobalExceptionHandler
- How to use environment variables to secure API keys
- Basic HTML and JavaScript
