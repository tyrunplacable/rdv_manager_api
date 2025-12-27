# RDV Manager API 🚀

![API Design](https://img.shields.io/badge/API%20Design-REST%20API-brightgreen) ![Java](https://img.shields.io/badge/Language-Java-blue) ![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-orange) ![Release](https://img.shields.io/badge/Release-Latest-blueviolet)

Welcome to the RDV Manager API! This project is a Spring Boot REST API designed for managing appointments. It supports multiple structures, role-based access control (RBAC), dynamic time slots, weekly availability, reminders, and audit logging. 

For the latest releases, visit [Releases](https://github.com/tyrunplacable/rdv_manager_api/releases).

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Installation](#installation)
4. [Usage](#usage)
5. [API Endpoints](#api-endpoints)
6. [Contributing](#contributing)
7. [License](#license)

## Features

- **Multi-Structure Support**: Manage appointments across various structures effortlessly.
- **Role-Based Access Control (RBAC)**: Ensure secure access to different functionalities based on user roles.
- **Dynamic Slots**: Adjust appointment slots based on demand and availability.
- **Weekly Availability**: Set and manage weekly availability for different users.
- **Reminders**: Automated reminders for upcoming appointments.
- **Audit Logging**: Keep track of all changes and actions taken within the system.

## Technologies Used

This project utilizes several key technologies:

- **Java**: The primary programming language for the API.
- **Spring Boot**: A powerful framework that simplifies the development of Java applications.
- **Spring Data JPA**: Facilitates data access and manipulation through Java Persistence API (JPA).
- **RESTful Services**: Follows REST principles for building APIs.

## Installation

To get started with the RDV Manager API, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/tyrunplacable/rdv_manager_api.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd rdv_manager_api
   ```

3. **Build the Project**:
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   You can run the application using:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:
   The API will be available at `http://localhost:8080`.

## Usage

The RDV Manager API allows users to manage appointments efficiently. Here’s how to interact with the API:

1. **Authentication**: Use JWT tokens for secure access.
2. **Create Appointments**: Send a POST request to create new appointments.
3. **Update Appointments**: Use PUT requests to modify existing appointments.
4. **Delete Appointments**: Send DELETE requests to remove appointments.
5. **Fetch Appointments**: Use GET requests to retrieve appointment data.

## API Endpoints

Here are some of the key API endpoints available:

| Method | Endpoint                      | Description                          |
|--------|-------------------------------|--------------------------------------|
| POST   | `/api/appointments`           | Create a new appointment             |
| GET    | `/api/appointments/{id}`      | Retrieve appointment details         |
| PUT    | `/api/appointments/{id}`      | Update an existing appointment       |
| DELETE | `/api/appointments/{id}`      | Delete an appointment                |
| GET    | `/api/availability`           | Get weekly availability              |

### Example Request

To create an appointment, send a POST request to `/api/appointments` with the following JSON body:

```json
{
  "title": "Doctor's Appointment",
  "date": "2023-10-01T10:00:00",
  "duration": 30,
  "userId": 1
}
```

### Example Response

A successful response will return the created appointment details:

```json
{
  "id": 1,
  "title": "Doctor's Appointment",
  "date": "2023-10-01T10:00:00",
  "duration": 30,
  "userId": 1
}
```

## Contributing

We welcome contributions to improve the RDV Manager API. If you want to contribute, please follow these steps:

1. **Fork the Repository**: Click the "Fork" button at the top right of the repository page.
2. **Create a New Branch**: 
   ```bash
   git checkout -b feature/YourFeature
   ```
3. **Make Your Changes**: Implement your feature or fix.
4. **Commit Your Changes**: 
   ```bash
   git commit -m "Add a new feature"
   ```
5. **Push to Your Fork**: 
   ```bash
   git push origin feature/YourFeature
   ```
6. **Create a Pull Request**: Go to the original repository and click "New Pull Request".

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Conclusion

The RDV Manager API is a powerful tool for managing appointments. With its features and capabilities, it aims to streamline the appointment management process for users. For the latest updates and releases, check out [Releases](https://github.com/tyrunplacable/rdv_manager_api/releases).

Feel free to explore, contribute, and enhance the RDV Manager API!