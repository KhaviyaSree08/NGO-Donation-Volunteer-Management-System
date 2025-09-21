# NGO-Donation-Volunteer-Management-System
The NGO Donation and Volunteer Management System is a Java-based application integrated with a MySQL database to simplify and automate NGO operations. It manages donors, volunteers, donations, and events effectively, ensuring transparency and efficiency for social organizations.

## Problem Statement
Many NGOs face challenges in maintaining donor databases, tracking donation histories, and efficiently utilizing volunteers for various events. Manual record-keeping often leads to errors, mismanagement, and lack of transparency.  

**Solution:** This system provides a centralized digital platform to manage donations, volunteer assignments, and event-related activities seamlessly.

## Target Users
- **NGO Administrators** – Manage events, track donations, and assign volunteers.
- **Donors** – Contribute funds and view their donation history.
- **Volunteers** – Register, update availability, and participate in events.
- **Event Coordinators** – Oversee specific events and volunteer allocation.

## Features
- Donor registration and donation tracking  
- Volunteer registration, skill management, and event assignments  
- Event creation, scheduling, and volunteer allocation  
- Donation receipt generation
- Reporting for donations, events, and volunteer contributions  

## Tech Stack
- **Frontend:** Java Swing / JavaFX  
- **Backend:** Core Java with JDBC  
- **Database:** MySQL  

## Class Design (UML)
classDiagram
    User <|-- Donor
    User <|-- Volunteer
    User <|-- Admin
    Donor "1" --> "many" Donation
    Event "1" --> "many" Volunteer

    class User {
      -int iuserId
      -String sname
      -String semail
      -String sphone
      +login()
      +logout()
    }

    class Donor {
      -double totaldonated
      +makeDonation()
      +viewDonationHistory()
    }

    class Volunteer {
      -String skills
      -String availability
      +updateAvailability()
      +assignToEvent()
    }

    class Event {
      -int eventId
      -String eventName
      -String date
      -String location
      +addEvent()
      +assignVolunteer()
    }

    class Donation {
      -int donationId
      -double amount
      -String paymentMode
      -LocalDate donationDate
      +getAmount()
      +generateReceipt()
    }

    class Admin {
      +createEvent()
      +manageVolunteers()
      +generateReports()
    }

### Main Classes:
- **User (Base Class)**  
  Attributes: iuserId, sname, semail, sphone  
  Methods: login(), logout()  

- **Donor (extends User)**  
  Attributes: totaldonated  
  Methods: makeDonation(), viewDonationHistory()  

- **Volunteer (extends User)**  
  Attributes: skills, availability  
  Methods: updateAvailability(), assignToEvent()  

- **Event**  
  Attributes: eventId, eventName, date, location  
  Methods: addEvent(), assignVolunteer()  

- **Donation**  
  Attributes: donationId, amount, paymentMode, donationDate  
  Methods: getAmount(), generateReceipt()  

- **Admin (extends User)**  
  Methods: createEvent(), manageVolunteers(), generateReports()  


## OOP Concepts Used
- **Inheritance:** `Donor`, `Volunteer`, and `Admin` extend `User` to avoid redundancy.  
- **Polymorphism:** Methods like `generateReports()` behave differently for each report type.  
- **Encapsulation:** Sensitive fields (e.g., passwords, donation amounts) are private with controlled access via getters/setters.  
- **Abstraction:** Database operations are separated into dedicated service classes.

