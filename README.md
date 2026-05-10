# Secure Student Information System (SSIS)

## Project Overview
The primary goal is to design and implement a secure student information system that manages academic grades while strictly adhering to secure software development lifecycle (SDLC) principles.

The implementation focuses on the Secure Login Process, demonstrating defensive programming techniques to mitigate common vulnerabilities such as SQL Injection and unauthorized access.

## Key Security Features
The Java implementation has several security principles:

1.  **Input Whitelisting:** Student IDs are restricted to numeric values only using Regular Expressions (`[0-9]+`).
2.  **Length Validation:** Student IDs must be exactly 9 digits.
    *Passwords must be between 8 and 20 characters.*
3.  **SQL Injection Prevention:** The system scans input for common injection characters (e.g., `'` and `=`) and terminates the session if a threat is detected.
4.  **Fail-Safe Defaults:** Access is denied by default unless all security checks are successfully passed and credentials match.
5.  **Defensive Error Handling:** The system provides clear feedback for validation errors without revealing sensitive system information.

## System Functionalities
The broader system architecture is designed to support:
* **Account Management:** Secure creation and updates for user accounts.
* **Role-Based Access Control (RBAC):**
  *Students:* View their own academic grades.
  *Instructors:* Post and update course grades.
* **Data Integrity:** Ensuring grades remain accurate and unmanipulated.


## Security Testing Cases
The implementation has been verified against the following test scenarios:
* **SQL Injection Prevention:** Rejected attempts using `'` or `=` characters.
* **Length Validation:** Enforcement of the 9-digit ID and 8-20 character password rules.
* **Type Validation:** Rejection of non-numeric Student IDs.
* **Successful Login:** Verification of valid credentials for authorized students.

