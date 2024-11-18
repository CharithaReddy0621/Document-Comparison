# Document-Comparison
Comparison of two text files using ReactJS and SpringBoot
# Document Comparison Application

This application allows users to upload two documents, compare their content, and view the differences. The system consists of a **backend** API built with Spring Boot and a **frontend** user interface built with React.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Backend Setup](#backend-setup)
4. [Frontend Setup](#frontend-setup)
5. [Application Flow](#application-flow)
6. [API Endpoints](#api-endpoints)
7. [Troubleshooting](#troubleshooting)

---

## Features

- Upload two documents for comparison.
- Displays added, removed, and changed lines between the documents.
- Responsive frontend for ease of use.
- Backend processing with mock comparison logic (can be enhanced for real-world use).
- Error handling for missing files and server errors.

---

## Technologies Used

### Backend:
- **Java Spring Boot**: Handles API logic and document comparison.
- **Maven**: Dependency management.

### Frontend:
- **React**: User interface for uploading documents and viewing results.
- **Axios**: For making API calls.
- **Bootstrap/Material-UI (Optional)**: For styling and responsiveness.

---

## Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/CharithaReddy0621/Document-Comparison.git
   cd <repository_folder>/backend
2.Build and run the backend application:
  mvn clean install
  mvn spring-boot:run
3.Backend API will be available at http://127.0.0.1:8000/api.


## Frontend Setup
-- cd <repository_folder>/frontend
-- npm install
-- npm start
-- Frontend will be available at http://localhost:3000.

