
# 🎓 Java Inheritance & University Management System

This project demonstrates **Java inheritance**, **abstract classes**, **method overriding**, and **object-oriented design** for a university-like system with students, administration staff, and faculty members.

---

## 📝 Classes Overview

### 1. `Person`
- Base class with **name** and **year of birth**.
- Provides a `toString()` method for printing person details.

### 2. `Student` (Inherits `Person`)
- Attributes: `studentID`, `enrolledSemester`.
- Method: `Display()` prints student information.

### 3. `Employee` (Abstract Class, Inherits `Person`)
- Attributes: `employeeID`, `joiningYear`, `jobTitle`.
- Abstract method: `CalcPay()` — implemented by subclasses to calculate salary.
- Represents general employees.

### 4. `Administration` (Inherits `Employee`)
- Calculates salary based on years of service:  
  `salary = (currentYear - joiningYear) * 5000`
- Can update `jobTitle`.

### 5. `Faculty` (Inherits `Employee`)
- Attributes: `List_of_CourseID` to store courses taught.
- Calculates salary based on years of service:  
  `salary = (currentYear - joiningYear) * 4000`
- Can update and retrieve course list.

---

## 🚀 How to Run

1. Compile all classes:
```bash
javac Driver_OF_Inheritance.java
````

2. Run the main program:

```bash
java Driver_OF_Inheritance
```

3. The program demonstrates:

* Student display
* Employee and faculty salary calculation
* Course assignments for faculty
* Job title updates for administration staff
* Polymorphism via `Person` list

---

## ⚡ Example Output

```
Student{name='Junaid', YearOfBirth=2003, studentID=1234, enrolledSemester=3}
...
payment of HOD Faslullah :105000
payment of Assis.Prof.Afeef Sir :44000
Afeef Sir's subject list is :[oop, CED, DLD, DM]
payment of prof.Hina Ma'am :52000
Hina Ma'am's subject list is :[maths, geo, phy, chm]
```

---

## 🛠 Concepts Demonstrated

* Java inheritance and abstract classes
* Polymorphism
* Method overriding
* Lists to store multiple objects
* Object-oriented salary calculation
* Course management for faculty

---

## 📜 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code.

---

Do you want me to do that?
```
