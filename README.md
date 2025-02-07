# Online-Bus-Ticket-Booking-Application

Building an online bus ticket booking application in India with Java Full stack project

ProjectOverview:
Developed a bus ticket booking application that allows users to search for bus schedules, book tickets, and view booking history. The application supports seat reservation, payment, and booking confirmation functionalities.

Key Features:
•	Ticket Booking: Users can view available buses based on destination, date, and time, and then reserve seats.
•	Payment Integration: Added payment gateway simulation for ticket payment during the booking process.
•	Booking History: Implemented a system for users to view their past bookings and cancel tickets.
•	Backend Development: Developed REST APIs with Spring Boot for bus schedule management, booking, and payment services.
•	Database Management: Designed and implemented PostgreSQL database to store bus schedules, user bookings, and payment details.
•	Search & Filters: Added features to allow users to search and filter bus schedules by date, destination, and availability.
•	Frontend Interface: Designed a user-friendly interface with HTML, CSS, and JavaScript, providing real-time updates of available seats and bus schedules.
•	Testing: Ensured the correctness of the application by writing unit tests with JUnit to test backend functionalities like booking and payment processing.

Technologies Used: Core Java, Spring Boot, Spring Framework, PostgreSQL, JUnit, HTML, CSS, JavaScript.


Backend Development (Spring boot): 
1.Create a new Spring Boot version 3.3.4 project 

2.Define entities (e.g. Bus, Booking, Passenger) and set up the necessary data models.

3.Implement RESTful APIs for using spring boot's controller to handle bus booking request, user authentication and data retrieval in a database.

4.set up a database(MySQL/MongoDB) to store bus schedules, booking information and user data.


Frontend Development(HTML,CSS and Javascript/Thymeleaf):

1.Design a user interface (UI) for the application using HTML,CSS and Javascript/Thymeleaf template engine. 

2.Develop responsive web pages for listing available bus routes, booking forms, and user profiles.

2.Utilize CSS frameworks (example bootstrap) for styling to enhance the user experience. 

User Registration and Authentications:

1.User Registration 

2.Develop a user registration page with HTML form to collect user information like name, password and email.

3.Implement client side and server side validation for form input. 

4.Create Restful API endpoint in spring boot to handle user registration and store user data securely in the database. 


User Authentication: 

1.Implement user login and authentication using react components.

2. use JSON web token (JWT) for secure authentication.

Bus ticket booking:

1. Browse and select bus route

2. Create a page for the user which allows him to enter destinations (i.e. from=... to=....)

3. After entering the destination, browsers should navigate to the page containing bus route, along with departure and arrival time, and pricing.


Booking Process:

1.Develop booking forms with HTML and React components to capture user details(i.e. Passenger information and seat preferences).

2. Implement the booking logic in react to send booking requests to spring boot backend using Restful APIs.

3. Provide users with booking confirmations and e-ticket upon successful transactions.


User profile and booking history:

1.User Profile

2. Create a user profile page where user can view and update their personal information 

3. Implements features like changing passwords and managing payment methods.

Booking history:

1. Develop a section for users to view their booking history.

2. Retrieve booking data from the database and display it to users.


Database and Data Modeling:


1. Define entity and set up the necessary data models. 

2. set up a relational database using MySQL/MongoDB and configure JPA entity mapping.

Testing and quality assurance:

Write an unit test case and test application functionality.

Documentation:

1.Create Detailed documentation that explain how to set up, configure and run the project.

 2. Document the API endpoints, request/response formats, and data validation rules.
