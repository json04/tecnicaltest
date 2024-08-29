# Technical Exercise

## Requirements

- Docker
- Docker Compose
- JDK 17
- Maven

## Instructions for Execution

1. Clone thr repository:
    ```sh
    git clone https://github.com/json04/tecnicaltest.git
    ```
2. Navigate to the project directory:
    ```sh
    cd technicalExercise
    ```
3. Package the application with Maven:
    ```sh
    mvn clean package
    ```
4. Build the Docker image:
    ```sh
    docker build -t technicalexercise:latest .
    ```
5. Raise containers with Docker Compose:
    ```sh
    docker-compose up
    ```
6. Access the application at `http://localhost:8080`.

## API endpoints

AUTORS

--Create an author
POST /api/authors
Body: { "name": "Author Name", "birthdate": "YYYY-MM-DD" }

--Update an author
PUT /api/authors/{id}
Body: { "name": "Author Name", "birthdate": "YYYY-MM-DD" }

--Delete an author
DELETE /api/authors/{id}

--Consult an author
GET /api/authors/{id}


BOOKS


--Create a book
POST /api/books
Body: { "title": "Book Title", "author": { "id": 1 } }

--Updating a book
PUT /api/books/{id}
Body: { "title": "Book Title", "author": { "id": 1 } }

--Delete a book
DELETE /api/books/{id}

--Consult a book
GET /api/books/{id}
