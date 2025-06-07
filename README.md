<p align="center">
  <img src="imgs/Brasao-UFPA-colorido.png" alt="UFPA Coat of Arms" width="150"/>
</p>

# Interactive Java Calculator

This project presents an interactive calculator developed in Java, running on the command line (CLI), capable of performing both basic and advanced mathematical operations. It focuses on Object-Oriented Programming (OOP) principles, ensuring modularity, code reuse, and robustness through proper exception handling.

## 📋 Description

The calculator allows users to perform various numeric operations through a simple and intuitive text-based menu. In addition to basic arithmetic, it supports advanced features such as factorials, prime number validation, roots, permutations, and arrangements.

## ✅ Functional Requirements

- [x] Basic operations: addition, subtraction, multiplication, and division
- [x] Integer operations: integer division and remainder
- [x] Math functions: nth root, floor, and ceiling
- [x] Advanced features: factorial, permutations, arrangements
- [x] Validation: check if a number is prime or a perfect square
- [x] Interactive CLI menu

## 🚫 Non-Functional Requirements

- Code must be written in Java 17 using OOP principles
- Must handle common errors such as invalid input and division by zero
- Clear and user-friendly CLI interface

## 🧪 Testing

Manual testing was conducted with valid and invalid inputs to ensure:
- Correct operation outputs
- Edge cases (e.g., 0!, negative roots, arrangements with p > n)
- Accurate prime and perfect square detection

## 🧱 Architecture

- **`Calculadora` class**: Implements all mathematical methods with input validation and exception handling.
- **`Main` class**: Displays the interactive CLI menu, receives user input, and executes operations.

## 🛠 Technologies

- **Language:** Java 17  
- **IDE:** Visual Studio Code  
- **Paradigm:** Object-Oriented Programming  
- **Execution:** Command Line Interface (CLI)  
- **Development Environment:** Windows 10 and Linux

## 📎 Example Usage

```bash
> java Main
Choose an operation:
1. Add
2. Subtract
3. Check if prime
...
