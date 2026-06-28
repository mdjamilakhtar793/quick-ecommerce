# 🛒 Multi-Vendor QuickCommerce API

A scalable and modular **Multi-Vendor QuickCommerce REST API** built with **Spring Boot** following clean architecture
principles. The application enables multiple vendors to manage products, orders, customers, and business operations from
a single platform.

---

## 🚀 Features

- 👤 User Authentication & Authorization
- 🏪 Multi-Vendor Management
- 📦 Product Management
- 🛍️ Category Management
- 🛒 Shopping Cart
- ❤️ Wishlist
- 📍 Address Management
- 📑 Order Management
- 💳 Payment Integration Ready
- 🚚 Delivery Tracking
- ⭐ Product Reviews & Ratings
- 📊 Vendor Dashboard APIs
- 🔐 JWT Authentication
- 🌐 RESTful API Design
- 📄 Global Exception Handling
- 🔄 DTO & Entity Mapping

---

# 🏗️ Project Structure

```
src
└── main
    ├── java
    │   └── com.jamildev
    │       ├── config          # Spring Security & Application Configuration
    │       ├── controller      # REST Controllers
    │       ├── domain          # Entities / Domain Models
    │       ├── dto             # Data Transfer Objects
    │       ├── exception       # Custom Exceptions & Global Handlers
    │       ├── mapper          # Entity ↔ DTO Mapping
    │       ├── model           # Additional Models / Enums
    │       ├── repository      # JPA Repositories
    │       ├── request         # Request Models
    │       ├── response        # Response Models
    │       ├── service         # Business Logic
    │       ├── utils           # Utility Classes
    │       └── QuickecommerceApplication.java
    │
    └── resources
        ├── application.properties
        └── static

---

# 🏛️ Architecture


                Client
                  │
                  ▼
          REST Controller
                  │
                  ▼
             Service Layer
                  │
                  ▼
            Repository Layer
                  │
                  ▼
             Database (MySQL)


---

# 🛠️ Technology Stack

| Technology         | Version |
|--------------------|---------|
| Java               | 17+     |
| Spring Boot        | 3.x     |
| Spring MVC         | ✔       |
| Spring Data JPA    | ✔       |
| Spring Security    | ✔       |
| JWT                | ✔       |
| Hibernate          | ✔       |
| Maven              | ✔       |
| MySQL              | ✔       |
| Lombok             | ✔       |
| MapStruct / Mapper | ✔       |

---

# 📂 Package Responsibilities

## config

Contains application configuration.

- Security Configuration
- JWT Configuration
- CORS Configuration
- Bean Configuration

---

## controller

REST API endpoints.

Example:

- AuthController
- ProductController
- VendorController
- OrderController
- SellerController
- AdminDashboard Controller
- SellerAdminController

---

## service

Business logic implementation.

Responsible for:

- Validation
- Business Rules
- Transactions
- Calling repositories

---

## repository

Spring Data JPA interfaces.
Handles all database operations.

---

## domain

JPA Entity classes.

- User
- Vendor
- Product
- Category
- Order
- Cart

---

## dto

DTO classes used between Controller and Service layers.

Keeps Entity objects hidden from API clients.

---

## mapper

Maps:

- Entity → DTO
- DTO → Entity

---

## request

Incoming request payloads.

CreateProductRequest
RegisterRequest
LoginRequest


---

## response

Outgoing API response models.


ProductResponse
OrderResponse
VendorResponse

---

## exception

Contains

- Custom Exceptions
- Error Responses
- Global Exception Handler

---

## utils

Utility classes

Example:

- JWT Utilities
- Date Utilities
- Validation Utilities

---

# ⚙️ Installation


---

## Configure Environment

Create:

src/main/resources/application.properties


Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quickcommerce
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
jwt.secret=YOUR_SECRET_KEY
jwt.expiration=86400000

> **Note:** Do not commit your `application.properties` file. Instead, commit an `application.properties.example` file
> and add the real file to `.gitignore`.

---

## Build Project

```bash
mvn clean install
---

## Run Project

mvn spring-boot:run

or

Run


QuickecommerceApplication.java


from your IDE.

---

# 🔐 Authentication

The project uses JWT Authentication.

Typical flow:


Register
│
▼
Login
│
▼
Receive JWT Token
│
▼
Include Token

Authorization:
Bearer <JWT_TOKEN>


---

# 📦 REST API

Example endpoints

| Method | Endpoint           | Description    |
|--------|--------------------|----------------|
| POST   | /api/auth/register | Register User  |
| POST   | /api/auth/login    | Login          |
| GET    | /api/products      | List Products  |
| POST   | /api/products      | Create Product |
| GET    | /api/orders        | Get Orders     |
| POST   | /api/orders        | Create Order   |

---

# 🧪 Testing

Run

mvn test


---

# 📖 Future Improvements

- Docker Support
- Redis Cache
- Elasticsearch
- Email Verification
- Payment Gateway
- Notifications
- Swagger Documentation
- Kubernetes Deployment
- CI/CD Pipeline

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

git checkout -b feature/new-feature

3. Commit changes

git commit -m "Add new feature"

4. Push

git push origin feature/new-feature

5. Open a Pull Request

---

# 📄 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

**Jamil Dev**

GitHub: https://github.com/your-username

⭐ If you found this project helpful, consider giving it a star!