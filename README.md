1.Objective:
-To develop a console-based reservation system where a user can:
*Log in with credentials.
*Reserve a ticket (with a fixed PNR).
*Cancel the reservation if already booked.
*Exit the system.
-The system simulates basic user authentication, ticket booking, and ticket cancellation in a simple, interactive format.

2.Steps Performed:
-Initialized variables:
*Username & password for login
*Ticket status (ticketBooked)
*Static PNR and reserved name
-User authentication:
*enter a username and password
*Validated against stored credentials
-Displayed menu options in a loop:
-Reserve Ticket
-Cancel Ticket
-Exit
-Reservation logic:
*If no ticket is booked, prompt for name and confirm booking with PNR
*Prevent duplicate bookings
-Cancellation logic:
*Allow cancellation only if a ticket exists
*Validate PNR before cancellation
-Exit logic:
*Terminates the program upon user request

3.Tools & Technologies Used
-Programming Language: Java
-Input Handling: Scanner class for reading user input
-Core Java Features:
*Variables & data types
*if-else conditions
*switch-case
*Loops (while)
*Console I/O
*Logic Handling: Boolean flags for ticket status, integer PNR tracking

4.Outcome
-A fully functional Java console application that:
*Authenticates users
*Books a single ticket with a fixed PNR (1001)
*Cancels the ticket with PNR verification
*Displays meaningful user prompts and validations
-Demonstrates:
*Basic programming concepts
*Menu-driven application
*Real-life logic simulation
-Ideal for:
*Beginners learning Java
*Building upon with features like multiple reservations, date-based booking, or file storage


