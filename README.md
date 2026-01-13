# Product Management REST API - Task 2

This document covers **Task 2 (Final Implementation)**. It builds upon Task 1 by implementing a full Product Management System with **CRUD** (Create, Read, Update, Delete) operations, **Exception Handling**, and an **In-Memory Repository**.

## 🚀 Features
* **Create Product:** Add new products to the system via API.
* **Read Product:** Retrieve detailed product information by ID.
* **Delete Product:** Remove a product from the database.
* **Exception Handling:** Custom **404 Not Found** error when accessing non-existent IDs.
* **In-Memory Storage:** Uses `HashMap` for data persistence as per requirements.
* **API Documentation:** Fully integrated with **Swagger UI**.

## 🛠 Technologies Used
* **Java 17**
* **Spring Boot 3.2.5**
* **Spring Web** (REST API)
* **SpringDoc OpenAPI** (Swagger UI)
* **Maven**

## ⚙️ How to Run
1.  Open the project in **IntelliJ IDEA**.
2.  Run the `FirstRestApiSpringApplication` class.
3.  Once the application starts, open **Swagger UI** to test the API:
    👉 **[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)**

---

## 📸 API Usage & Screenshots
Below is the step-by-step verification of all functionalities using Swagger UI.

### 0️⃣ API Overview
The main dashboard showing all available endpoints in the `product-controller`.
<img width="1552" height="917" alt="Ekran Resmi 2026-01-13 13 28 49" src="https://github.com/user-attachments/assets/3b202b8e-a3e1-44b0-891c-d50953f7a481" />


### 1️⃣ Create Product (POST)
**Action:** Adding a new product named "Test Product".
* **Request (Input):**
![post1.png](screenshots/post1.png)
* **Response (Output - 200 OK):**
  ![post2.png](screenshots/post2.png)![img_2.png](img_2.png)

### 2️⃣ Read Product (GET)
**Action:** Retrieving details of the product with ID `1`.
* **Request (Input):**
  ![get1.png](screenshots/get1.png)
* **Response (Output - JSON Body):**
  ![get2.png](screenshots/get2.png)
* **Response (Output - Headers):**
  ![img_5.png](img_5.png)

### 3️⃣ Delete Product (DELETE)
**Action:** Removing the product with ID `1`.
* **Request (Input):**
  ![delete1.png](screenshots/delete1.png)
* **Response (Output - 204 No Content):**
  ![delete2.png](screenshots/delete2.png)
* ** Retrieving all products.
*  <img width="1440" height="900" alt="Ekran Resmi 2026-01-13 17 41 55" src="https://github.com/user-attachments/assets/5478c016-30a1-41b1-8f5a-07c3b73fb403" />

### 4️⃣ Exception Handling (404 Not Found)
**Action:** Trying to access the deleted product (ID `1`).
* **Result:** The system returns a custom error message.
  ![error.jpeg](screenshots/error.jpeg)

---

## 🔌 API Endpoints Reference
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/api/v1/products` | Create a new product |
| **GET** | `/api/v1/products/{id}` | Get product details |
| **PUT** | `/api/v1/products/{id}` | Update product name |
| **DELETE** | `/api/v1/products/{id}` | Delete a product |

## 👨‍💻 Author
* **Student:** Eyup Yahya Suzen
* **Task:** #2 - CRUD Operations
