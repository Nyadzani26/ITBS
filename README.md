# 📘 Tutor Booking System

A Java-based desktop application developed as a second-year Programming II module project at **Sol Plaatje University**. The system is designed to streamline the process of connecting students with qualified tutors based on availability, course, academic year, and modules. It provides a centralized platform for students to book tutoring sessions and for tutors to manage bookings efficiently.

---

##  Features

-  **Single Registration System**: All users (students and potential tutors) register once using their basic academic information (name, surname, student number, etc.).
-  **Student Roles**:
  - By default, all new users are registered as **Students**.
  - Students fill in their academic profile: course, academic year, and modules they need help with.
-  **Tutor Role Appointment**:
  - Only the **System Administrator** can assign a student the role of **Tutor**.
  - Once promoted, the student gains access to a dual-dashboard (Student and Tutor).
-  **Tutor Profile Management**:
  - Tutors specify modules they offer, availability times, and additional info to help students locate them.
  - Tutors can only tutor students **in lower academic years**.
    - E.g., 2nd years tutor 1st years, 3rd years tutor 1st and 2nd years.
-  **Booking System**:
  - Students can browse a list of available tutors who match their requirements.
  - Bookings are sent to tutors, who can **Accept** or **Reject**.
-  **Email Notifications**:
  - Booking confirmations or rejections (with reasons) are sent to students via email.
-  **Role-Based Dashboards**:
  - Tutors have access to both student and tutor dashboards, depending on the context of use.

---

## 🛠 Technologies Used

- 💻 Java (Core)
- 🛢️ JDBC (for database connection)
- 🗓 JCalendar (for selecting Availability)
- 📬 JavaMail API (for sending booking notifications)
- 🧩 NetBeans IDE

---

## 🧾 How It Works

1. **User Registration**: All users start as students and fill out basic personal and academic information.
2. **Student Profile Setup**: After registering, students fill out their profile, including:
   - Academic Year
   - Modules needing tutoring
   - Course name
3. **Admin Promotion**: The admin searches for registered students and promotes those qualified to the tutor role.
4. **Tutor Profile Setup**:
   - Tutors add tutoring modules, availability schedule, and other helpful details.
5. **Booking a Tutor**:
   - Students search tutors based on compatibility.
   - A booking request is sent to the tutor.
6. **Tutor Response**:
   - **Accept**: Student receives a confirmation email.
   - **Reject**: Tutor provides a reason, and the student is notified via email.

---


## 🧪 Getting Started (Local Setup)

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ITBS.git

