# Java CLI Calculator

A simple command-line calculator written in Java. It performs basic arithmetic operations like addition, subtraction, multiplication and division with a continuous calculation feature based on previous results.

## 🛠 Features

- Addition `+`
- Subtraction `-`
- Multiplication `*`
- Division `/` with zero check
- Continuous operations using previous result

## ❓ How to Run

1. Make sure you have Java installed.
2. Clone the repository:
   
   ```bash
   git clone https://github.com/hxidrix/Java-CLI-Calculator.git
   cd Java-CLI-Calculator
   
4. Compile and run:

   ```bash
   javac src/*.java
   java -cp src Calculator

## 📸 Preview

   ```bash
  Enter first value: 
  10
  Enter operation (+, -, *, /)
  +
  Enter next number to perform operation: 
  5
  Result of 10.0 + 5.0 is 15.0
  continue? (y/n)
  y
  Previous result becomes first value: 15.0
  Enter operation (+, -, *, /)
  /
  Enter next number to perform operation: 
  3
  Result of 15.0 / 3.0 is 5.0
  continue? (y/n)
  n
  
  --- Operation Result ---
  15.0 / 3.0 = 5.0
  ------------------------
  ```

## 📁 Project Structure

```
Java-CLI-Calculator/
├── src/
│   ├── Calculator.java
│   └── CalcCore.java
├── README.md
```
