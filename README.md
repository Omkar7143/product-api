# 🚀 Product API – Spring Boot Backend (Deployed)

## 📌 Overview

This is a **Production-Ready Product Management REST API** built using Spring Boot.
It supports authentication, role-based access control, and full CRUD operations for products and items.

---

## 🌐 Live Demo

👉 https://product-api-s592.onrender.com/swagger-ui.html

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Security (JWT Authentication)
* Spring Data JPA
* MySQL (Railway Cloud Database)
* Docker (Multi-stage Build)
* Render (Deployment)
* Swagger (API Documentation)

---

## 🔐 Features

* JWT Authentication (Login/Register/Refresh Token)
* Role-Based Authorization (USER / ADMIN)
* Product CRUD APIs
* Item Management APIs
* Global Exception Handling
* Clean Controller-Service-Repository Architecture

---

## 📂 Project Structure

```
com.zestindia.productapi
│
├── controller        → REST APIs
├── service           → Business logic
├── repository        → Database access
├── entity            → Database models
├── dto               → Request/Response models
├── security          → JWT + Spring Security config
├── exception         → Global error handling
```

---

## ⚙️ API Endpoints

### 🔑 Auth APIs

* POST /api/v1/auth/register
* POST /api/v1/auth/login
* POST /api/v1/auth/refresh

### 📦 Product APIs

* GET /api/v1/products
* POST /api/v1/products
* PUT /api/v1/products/{id}
* DELETE /api/v1/products/{id}

### 📄 Item APIs

* GET /api/v1/products/{id}/items
* POST /api/v1/products/{id}/items

---

## 🧪 How to Run Locally

```bash
git clone https://github.com/Omkar7143/product-api.git
cd product-api
mvn clean install
java -jar target/product-api-0.0.1-SNAPSHOT.jar
```

---

## 🗄️ Database Setup

Update `application.properties` with your MySQL credentials.

---

## 🐳 Docker Support

```bash
docker build -t product-api .
docker run -p 8080:8080 product-api
```

---

## 📸 API Testing

Use Swagger UI:
👉 http://localhost:8080/swagger-ui.html

---

## 🎯 Future Improvements

* Add pagination & filtering
* Add unit + integration tests
* CI/CD pipeline
* Redis caching

---

## 👨‍💻 Author

**Omkar Jadhav**
📧 [omkar.s.jadhav321@gmail.com](mailto:omkar.s.jadhav321@gmail.com)
🔗 https://github.com/Omkar7143

---

## ⭐ If you like this project

Give it a ⭐ on GitHub
