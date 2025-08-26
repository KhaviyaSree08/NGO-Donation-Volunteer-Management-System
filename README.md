# NGO-Donation-Volunteer-Management-System
The NGO Donation &amp; Volunteer Management System is a Java-based application integrated with a MySQL database to simplify and automate NGO operations. It manages donors, volunteers, donations, and events effectively, ensuring transparency and efficiency for social organizations.

# Problem Statement
Many NGOs face challenges in maintaining donor databases, tracking donation histories, and efficiently utilizing volunteers for various events. Manual record-keeping often leads to errors, mismanagement, and lack of transparency.  

Solution: This system provides a centralized digital platform to manage donations, volunteer assignments, and event-related activities seamlessly.

# Target Users
- NGO Administrators:Manage events, track donations, and assign volunteers.
- Donors:Contribute funds and view their donation history.
- Volunteers: Register, update availability, and participate in events.
- Event Coordinators: Oversee specific events and volunteer allocation.

# Features
- Donor registration and donation tracking  
- Volunteer registration, skill management, and event assignments  
- Event creation, scheduling, and volunteer allocation  
- Donation receipt generation with multiple payment modes  
- Reporting for donations, events, and volunteer contributions  

# Tech Stack
- Frontend: JavaFX(For UI Design)  
- Database: MySQL  


### Main Classes:
- **User (Base Class)**  
  Attributes: userId, name, email, phone  
  Methods: login(), logout()  

- **Donor (extends User)**  
  Attributes: totalDonated  
  Methods: makeDonation(), viewDonationHistory()  

- **Volunteer (extends User)**  
  Attributes: skills, availability  
  Methods: updateAvailability(), assignToEvent()  

- **Event**  
  Attributes: eventId, eventName, date, location  
  Methods: addEvent(), assignVolunteer()  

- **Donation**  
  Attributes: donationId, amount, paymentMode, donationDate  
  Methods: recordDonation(), generateReceipt()  

- **Admin (extends User)**  
  Methods: createEvent(), manageVolunteers(), generateReports()  

