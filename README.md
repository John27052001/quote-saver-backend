# 📝 Quote Saver App – Backend (Spring Boot)

This is the **Spring Boot backend API** for the Quote Saver App — a full stack application that allows users to save, retrieve, and delete inspirational quotes.

## 🚀 Features

- 📤 Add a new quote
- 📥 View all saved quotes
- ❌ Delete quotes by ID
- 💾 In-memory H2 database for fast setup
- 🔗 REST API with full CORS support for frontend integration

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Lombok

## 📦 API Endpoints

| Method | Endpoint                 | Description          |
|--------|--------------------------|----------------------|
| GET    | `/api/quotes`            | Get all quotes       |
| POST   | `/api/quotes`            | Add a new quote      |
| DELETE | `/api/quotes/{id}`       | Delete a quote by ID |

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/John27052001/quote-saver-backend.git
cd quote-saver-backend
