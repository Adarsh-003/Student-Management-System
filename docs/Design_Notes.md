Design Notes

--Why I used ArrayList instead of an Array

I used ArrayList because the number of students, courses, and enrollments changes during program execution. Unlike arrays, ArrayList grows dynamically, making it easier to add and remove elements without manually managing the array size.

--Where I used Static Members and Why

I used static members in the IdGenerator class.

Example:

studentIdCounter
courseIdCounter
enrollmentIdCounter

These counters are shared across the application, so only one copy should exist. Static methods such as getNextStudentId() generate unique IDs without creating an IdGenerator object.

--Where I used Inheritance and What I Gained

I created a base class named Person containing common fields:

id
firstName
lastName
email

Student extends Person, allowing it to inherit these common properties and methods.

Benefits:

Reduced duplicate code
Better code organization
Easier maintenance
Demonstrated runtime polymorphism by overriding getDisplayName()