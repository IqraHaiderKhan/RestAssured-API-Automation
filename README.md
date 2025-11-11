# RestAssured API Automation Framework

A **Java-based API automation testing framework** built using **RestAssured** and **TestNG**.  
This project demonstrates industry-standard design practices with clean, modular, and scalable test architecture.

---

## Tech Stack

| Layer | Technology |
|:--|:--|
| Language | Java 21 |
| Test Framework | TestNG |
| API Testing | RestAssured |
| Build Tool | Maven |
| Reporting | Surefire / TestNG HTML Reports |
| Design Pattern | Config-driven Modular Framework |

---

## Project Structure
RestAssured-API-Automation/
│
├── pom.xml # Maven project configuration
└── src/
├── test/
│ ├── java/
│ │ └── tests/
│ │ └── SampleTest.java # Example API test case
│ └── resources/
│ └── testdata.json # Sample input data
└── main/
└── java/
└── utils/
└── ConfigReader.java # Configuration utility

---

## How to Run Tests

```bash
mvn clean test