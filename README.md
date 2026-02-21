# Product API - Zest India Assignment

Enterprise-grade Product Management REST API built with Spring Boot, JWT Authentication, and MySQL.

## Tech Stack

- Java 17, Spring Boot 3.5.11
- Spring Security + JWT (jjwt 0.12.3)
- Spring Data JPA + MySQL 8.0
- Swagger/OpenAPI 3 (Springdoc 2.6.0)
- Docker + Docker Compose
- JUnit 5 + Mockito (8 tests passing ✅)

## API Endpoints

### Auth
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/v1/auth/register | Register new user |
| POST | /api/v1/auth/login | Login and get JWT token |
| POST | /api/v1/auth/refresh | Refresh JWT token |

### Products (JWT Required)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/v1/products | Get all products |
| GET | /api/v1/products/{id} | Get product by ID |
| POST | /api/v1/products | Create new product |
| PUT | /api/v1/products/{id} | Update product |
| DELETE | /api/v1/products/{id} | Delete product (ADMIN only) |

### Items (JWT Required)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/v1/products/{id}/items | Get items for product |
| POST | /api/v1/products/{id}/items | Add item to product |

## Run Locally

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0

### Steps

```bash
git clone <repo-url>
cd product-api
mvn clean install -DskipTests
mvn spring-boot:run
```

The app will start on `http://localhost:8080`

## Run with Docker

```bash
mvn clean package -DskipTests
docker-compose up --build
```

## Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

## Test Results

```
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0 ✅
```

## Project Structure

```
src/main/java/com/zestindia/productapi/
├── config/          # Security & Swagger config
├── controller/      # REST controllers
├── dto/             # Request/Response DTOs
├── entity/          # JPA entities
├── exception/       # Global exception handler
├── repository/      # Spring Data JPA repositories
├── security/        # JWT filter & user details
└── service/         # Business logic
```

## Environment Variables (Docker)

| Variable | Description |
|----------|-------------|
| SPRING_DATASOURCE_URL | MySQL connection URL |
| SPRING_DATASOURCE_USERNAME | Database username |
| SPRING_DATASOURCE_PASSWORD | Database password |
| APP_JWT_SECRET | JWT secret key |
| APP_JWT_EXPIRATION | JWT expiry in ms (default: 86400000) |
| APP_JWT_REFRESH_EXPIRATION | Refresh token expiry in ms |
